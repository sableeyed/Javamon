package io.valhala.javamon.combat.hm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class HM02 extends CombatAbility {

	public HM02() {
		super.name = "Fly";
		super.type = AbilityType.FLYING;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 90;
		super.accuracy = (float) 95.0;
		super.pp = (int) 15;
		super.effect = "?";
	}
}
