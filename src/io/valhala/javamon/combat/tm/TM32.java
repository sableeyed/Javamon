package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM32 extends CombatAbility {

	public TM32() {
		super.name = "Double Team";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.STATUS;
		super.power = (int) 0;
		super.accuracy = (float) 0.0;
		super.pp = (int) 15;
		super.effect = "?";
	}
}
