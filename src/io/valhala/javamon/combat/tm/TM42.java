package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM42 extends CombatAbility {

	public TM42() {
		super.name = "Dream Eater";
		super.type = AbilityType.PSYCHIC;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 100;
		super.accuracy = (float) 100.0;
		super.pp = (int) 15;
		super.effect = "?";
	}
}
