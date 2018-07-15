package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM14 extends CombatAbility {

	public TM14() {
		super.name = "Blizzard";
		super.type = AbilityType.ICE;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 110;
		super.accuracy = (float) 70.0;
		super.pp = (int) 5;
		super.effect = "?";
	}
}
