package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM11 extends CombatAbility{

	public TM11() {
		super.name = "Bubble Beam";
		super.type = AbilityType.WATER;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 65;
		super.accuracy = (float) 100.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
