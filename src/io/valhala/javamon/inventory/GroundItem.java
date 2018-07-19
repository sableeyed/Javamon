package io.valhala.javamon.inventory;

import io.valhala.javamon.overworld.Location;

public class GroundItem extends ItemStructure {

	private boolean hidden;
	private Location location;
	
	public GroundItem(boolean hidden, Location location) {
		super("ITEM_NAME",ItemCategory.GROUND_ITEM);
		this.hidden = hidden;
		this.location = location;
	}

	public boolean isHidden() {return hidden;}

	public void setHidden(boolean hidden) {this.hidden = hidden;}

	public Location getLocation() {return location;}

	public void setLocation(Location location) {this.location = location;}
}
