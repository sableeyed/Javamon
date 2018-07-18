package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Metapod extends Pokemon {

	public Metapod() {
		super("Metapod", 50, 20, 55, 30, 25, true, 11,Type.BUG,null);
	}

}
