package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM48 extends CombatAbility {

	public TM48() {
		super.name = "Rock Slide";
		super.type = AbilityType.GROUND; //?
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 75;
		super.accuracy = (float) 90.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
