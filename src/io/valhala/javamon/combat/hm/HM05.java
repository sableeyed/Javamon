package io.valhala.javamon.combat.hm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class HM05 extends CombatAbility {

	public HM05() {
		super.name = "Flash";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.STATUS;
		super.power = (int) 0;
		super.accuracy = (float) 100.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
