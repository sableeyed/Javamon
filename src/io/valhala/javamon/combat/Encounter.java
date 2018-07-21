package io.valhala.javamon.combat;

import io.valhala.javamon.overworld.Player;
import io.valhala.javamon.pokemon.Pokemon;

public class Encounter {

	//private Player p = 
	private Pokemon wildPokemon;
	public Encounter(Pokemon wildPokemon) {
		this.wildPokemon = wildPokemon;
	}
	public Pokemon getWildPokemon() {
		return wildPokemon;
	}
	public void setWildPokemon(Pokemon wildPokemon) {
		this.wildPokemon = wildPokemon;
	}
}
