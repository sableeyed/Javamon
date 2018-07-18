package io.valhala.javamon.pokemon.evolution;

public enum EvolutionMethod {
	THUNDER_STONE,
	MOON_STONE,
	FIRE_STONE,
	LEAF_STONE,
	WATER_STONE,
	TRADE,
	LEVEL_UP;

	private String method;
	
	public String getMethod() {return method.toString();}
	
	public void setMethod(String method) {this.method = method;}
	
}
