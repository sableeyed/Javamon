package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Bulbasaur extends Pokemon {

	public Bulbasaur() {
		super("Bulbasaur", 45, 49, 49, 45, 65, true, 1,Type.GRASS,Type.POISON);
	}
}
