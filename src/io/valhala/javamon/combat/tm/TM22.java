package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM22 extends CombatAbility {

	public TM22() {
		super.name = "Solar Beam";
		super.type = AbilityType.GRASS;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 120;
		super.accuracy = (float) 100.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
