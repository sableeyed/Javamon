package io.valhala.javamon.item;

public abstract class Item {
	
	private String name;
	
	public Item() {}

	public Item(String name) {this.name = name;}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}
	
	public String toString() {return name;}
}
