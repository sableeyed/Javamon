package io.valhala.javamon.combat.hm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class HM04 extends CombatAbility {

	public HM04() {
		super.name = "Strength";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 80;
		super.accuracy = (float) 100.0;
		super.pp = (int) 15;
		super.effect = "?";
	}
}
