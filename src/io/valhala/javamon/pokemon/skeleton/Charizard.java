package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Charizard extends Pokemon {

	public Charizard() {
		super("Charizard", 78, 84, 78, 100, 85, false, 6,Type.FIRE,Type.FLYING);
	}

}
