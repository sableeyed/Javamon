package io.valhala.javamon.combat;

public enum AbilityCategory {
	SPECIAL,
	PHYSICAL,
	STATUS;
	
	private String category;
	
	public void setCategory(AbilityCategory c) {
		this.category = c.toString();
	}
	
	public String getCategory() {return category;}
}
