package io.valhala.javamon.game;

import io.valhala.javamon.item.GroundItem;
import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.skeleton.Abra;

public class Launcher {
	public static void main(String[] args) {
		Game g = new Game("Pokemon Java Technical Preview", 640, 480);
		g.start();
	}
}
