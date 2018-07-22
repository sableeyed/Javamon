package io.valhala.javamon.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import io.valhala.javamon.game.display.Display;
import io.valhala.javamon.game.graphics.Assets;
import io.valhala.javamon.game.graphics.ImageLoader;
import io.valhala.javamon.game.graphics.SpriteSheet;

public class Game implements Runnable {
	
	private Display display;
	public String title;
	public int width, height;
	private Thread thread;
	private boolean running = false;
	
	private BufferStrategy strat;
	private Graphics g;
	

	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
	}

	@Override
	public void run() {
		init();
		
		int fps = 30;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			if(delta >= 1) {
				tick();
				render();
				ticks++;
				delta--; //i heard this was bad practice vs delta -= 1;?
			}
			
			if(timer >= 1000000000) {
				System.out.println("Ticks: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		stop();
	}
	
	int x = 30;
	private void tick() {
		//x+=1;
	}
	
	private void render() {
		strat = display.getCanvas().getBufferStrategy();
		if(strat == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = strat.getDrawGraphics();
		//clear
		g.clearRect(0, 0, width, height);
		//draw
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
		g.drawImage(Assets.copyright, x,70,null);
		
		
		strat.show();
		g.dispose();
	}
	
	private void init() {
		display = new Display(title, width, height);
		Assets.init();

	}

	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running)
			return;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	


}
