package io.valhala.javamon.inventory;

import java.util.ArrayList;
import java.util.List;

import io.valhala.javamon.item.BackpackItem;

public class Backpack {
	private final  int CAPACITY = 20;
	private List<BackpackItem> itemsInBag = new ArrayList<BackpackItem>(CAPACITY);
	
	public Backpack() {

	}
}
