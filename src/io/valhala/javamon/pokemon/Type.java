package io.valhala.javamon.pokemon;

public enum Type {
	NORMAL,
	FIGHTING,
	FLYING,
	POISON,
	GROUND,
	ROCK,
	BUG,
	GHOST,
	FIRE,
	WATER,
	GRASS,
	ELECTRIC,
	PSYCHIC,
	ICE,
	DRAGON;
	
	private String pokemonType;
	
	public void setPokemonType(String s) {
		this.pokemonType = s.toString();
	}
	
	public String getPokemonType() {return pokemonType;} 
}
