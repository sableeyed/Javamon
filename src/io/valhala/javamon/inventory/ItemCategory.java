package io.valhala.javamon.inventory;

public enum ItemCategory {
	GROUND_ITEM,
	INVENTORY_ITEM;
	
	private String type;
	
	public String getType() {return type.toString();}
	
	public void setType(String type) {this.type = type;}
}
