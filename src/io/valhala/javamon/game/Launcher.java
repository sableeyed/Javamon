package io.valhala.javamon.game;

import io.valhala.javamon.inventory.Backpack;
import io.valhala.javamon.item.Item;
import io.valhala.javamon.item.Pokeball;

public class Launcher {
	public static void main(String[] args) {
		Backpack b = new Backpack();
		b.addToInventory(new Pokeball());
		Game g = new Game("Pokemon Java Technical Preview", 640, 480);
		g.start();
	}
}
