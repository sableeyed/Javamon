package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM45 extends CombatAbility {

	public TM45() {
		super.name = "Thunder Wave";
		super.type = AbilityType.ELECTRIC;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 0;
		super.accuracy = (float) 90.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
