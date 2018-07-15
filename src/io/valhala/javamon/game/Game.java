package io.valhala.javamon.game;

import io.valhala.javamon.game.display.Display;

public class Game implements Runnable {
	
	private Display display;
	public String title;
	public int width, height;
	private Thread thread;
	private boolean running = false;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
	}

	@Override
	public void run() {
		init();
		
		while(running) {
			tick();
			render();
		}
		stop();
	}
	
	private void tick() {
		
	}
	
	private void render() {
		
	}
	
	private void init() {
		display = new Display(title, width, height);
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
