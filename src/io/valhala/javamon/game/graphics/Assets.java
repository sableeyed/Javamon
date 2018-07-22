package io.valhala.javamon.game.graphics;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 140, height = 43;
	public static BufferedImage copyright;
	public static void init() {
		SpriteSheet sheet= new SpriteSheet(ImageLoader.loadImage("/img/YellowIntro.png"));
		 
		copyright = sheet.crop(35,13 , width, height);
	}
}
