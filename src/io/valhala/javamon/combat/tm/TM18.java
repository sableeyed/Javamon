package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM18 extends CombatAbility {
//priority -5
	public TM18() {
		super.name = "Counter";
		super.type = AbilityType.FIGHTING;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 0;
		super.accuracy = (float) 100.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
