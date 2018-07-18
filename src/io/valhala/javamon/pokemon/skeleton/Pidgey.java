package io.valhala.javamon.pokemon.skeleton;

import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Pidgey extends Pokemon {

	public Pidgey() {
		super("Pidgey", 40, 45, 40, 56, 35, true, 16,Type.NORMAL,Type.FLYING);
	}

}
