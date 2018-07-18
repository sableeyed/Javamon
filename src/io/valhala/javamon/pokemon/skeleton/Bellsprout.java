package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Bellsprout extends Pokemon {
//I have to do this to the rest. Also maybe abstract because we have
//WildPokemon, PlayerPokemon, NPCPokemon
	public Bellsprout() {
		super("Bellsprout", 50, 75, 35, 40, 70, true, 69,Type.GRASS,Type.POISON);
		// TODO Auto-generated constructor stub
	}

}
