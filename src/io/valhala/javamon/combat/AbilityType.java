package io.valhala.javamon.combat;

public enum AbilityType {
	GRASS,
	POISON,
	PSYCHIC,
	ICE,
	NORMAL,
	DARK,
	GROUND,
	WATER,
	GHOST,
	FIGHTING,
	DRAGON,
	FLYING,
	FIRE,
	BUG,
	ELECTRIC;

	private String type;
	
	public void setType(AbilityType typer) {
		this.type = typer.toString();
	}
	
	public String getType() {return type;}
}

