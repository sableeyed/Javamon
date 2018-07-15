package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM46 extends CombatAbility {
//broken
	public TM46() {
		super.name = "Psywave";
		super.type = AbilityType.PSYCHIC;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 0;
		super.accuracy = (float) 100.0;
		super.pp = (int) 15;
		super.effect = "?";
	}
}
