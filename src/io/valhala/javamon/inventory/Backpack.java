package io.valhala.javamon.inventory;

import io.valhala.javamon.item.Item;


public class Backpack {
	private final  int CAPACITY = 20;
	//private List<BackpackItem> itemsInBag = new ArrayList<BackpackItem>(CAPACITY);
	
	public Backpack() {

	}
	
	public void addToInventory(Item i) {System.out.println("new pokeball added to bag");}
}
