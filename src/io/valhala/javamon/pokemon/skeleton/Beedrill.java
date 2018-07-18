package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Beedrill extends Pokemon {

	public Beedrill() {
		super("Beedrill", 65, 80, 40, 75, 45, false, 15,Type.BUG,Type.POISON);
	}

}
