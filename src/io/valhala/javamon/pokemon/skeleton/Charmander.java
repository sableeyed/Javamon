package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Charmander extends Pokemon {

	public Charmander() {
		super("Charmander", 39, 52, 43, 65, 50, true, 4,Type.FIRE,null);
	}
}
