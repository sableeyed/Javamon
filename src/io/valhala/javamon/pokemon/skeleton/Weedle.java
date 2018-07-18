package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Weedle extends Pokemon {

	public Weedle() {
		super("Weedle", 40, 35, 30, 50, 20, true, 13,Type.BUG,Type.POISON);	
	}
}
