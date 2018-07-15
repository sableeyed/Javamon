package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM15 extends CombatAbility {

	public TM15() {
		super.name = "Hyper Beam";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 150;
		super.accuracy = (float) 90.0;
		super.pp = (int) 5;
		super.effect = "?";
	}
}
