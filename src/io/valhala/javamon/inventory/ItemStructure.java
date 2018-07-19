package io.valhala.javamon.inventory;

public abstract class ItemStructure {
	
	private ItemCategory itemType;
	private String name;
	
	public ItemStructure() {}

	public ItemStructure(String name, ItemCategory itemType) {
		this.name = name;
		this.itemType = itemType;
	}



	public ItemCategory getItemType() {
		return itemType;
	}

	public void setItemType(ItemCategory itemType) {
		this.itemType = itemType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
