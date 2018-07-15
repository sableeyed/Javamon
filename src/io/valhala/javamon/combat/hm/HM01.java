package io.valhala.javamon.combat.hm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class HM01 extends CombatAbility {

	public HM01() {
		super.name = "Cut";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 30;
		super.accuracy = (float) 95.0;
		super.pp = (int) 30;
		super.effect = "?";
	}
}
