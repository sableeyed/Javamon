package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM16 extends CombatAbility {

	public TM16() {
		super.name = "Pay Day";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 40;
		super.accuracy = (float) 100.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
