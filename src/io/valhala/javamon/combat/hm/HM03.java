package io.valhala.javamon.combat.hm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class HM03 extends CombatAbility {

	public HM03() {
		super.name = "Surf";
		super.type = AbilityType.WATER;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 90;
		super.accuracy = (float) 100.0;
		super.pp = (int) 15;
		super.effect = "?";
	}
}
