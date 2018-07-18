package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Butterfree extends Pokemon {

	public Butterfree() {
		super("Butterfree", 60, 45, 50, 70, 80, false, 12,Type.BUG,Type.FLYING);
	}

}
