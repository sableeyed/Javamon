package io.valhala.javamon.item;

import io.valhala.javamon.overworld.Location;

public class GroundItem extends ItemStructure {

	private boolean hidden;
	private Location location;
	
	public GroundItem(String name, boolean hidden, Location location) {
		super(name,ItemCategory.GROUND_ITEM);
		this.hidden = hidden;
		this.location = location;
	}
	
	public boolean isHidden() {return hidden;}

	public void setHidden(boolean hidden) {this.hidden = hidden;}

	public Location getLocation() {return location;}

	public void setLocation(Location location) {this.location = location;}
	
	public String toString() {
		return this.getName() + "\n" + hidden + "\n";
	}
}
