package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Fearow extends Pokemon {

	public Fearow() {
		super("Fearow", 65, 90, 65, 100, 61, false, 22,Type.NORMAL,Type.FLYING);
	}

}
