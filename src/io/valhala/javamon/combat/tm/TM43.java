package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM43 extends CombatAbility {

	public TM43() {
		super.name = "Sky Attack";
		super.type = AbilityType.FLYING;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 140;
		super.accuracy = (float) 90.0;
		super.pp = (int) 5;
		super.effect = "?";
	}
}
