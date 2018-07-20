package io.valhala.javamon.overworld;

import java.util.List;

import io.valhala.javamon.item.GroundItem;

public class Map {
	
	private String name;
	private static List<GroundItem> itemsOnMap; //whenever the map is recreated we dont want new data in the array
}
