package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM10 extends CombatAbility {

	public TM10() {
		super.name = "Double Edge";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 120;
		super.accuracy = (float) 100.0;
		super.pp = (int) 15;
		super.effect = "?";
	}
}
