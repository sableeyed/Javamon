package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Ivysaur extends Pokemon {

	public Ivysaur() {
		super("Ivysaur", 60, 62, 63, 60, 80, true, 2,Type.GRASS,Type.POISON);
	}
}
