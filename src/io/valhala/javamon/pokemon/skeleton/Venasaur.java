package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Venasaur extends Pokemon {

	public Venasaur() {
		super("Venusaur", 80, 82, 83, 80, 100, false, 3,Type.GRASS,Type.POISON);
	}
}
