package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM25 extends CombatAbility{

	public TM25() {
		super.name = "Thunder";
		super.type = AbilityType.ELECTRIC;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 100;
		super.accuracy = (float) 70.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
