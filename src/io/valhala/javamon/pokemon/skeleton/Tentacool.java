package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Tentacool extends Pokemon {

	public Tentacool() {
		super("Tentacool", 40, 40, 65, 70, 100, true, 72,Type.WATER,Type.POISON);
	}
}
