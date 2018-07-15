package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM24 extends CombatAbility {

	public TM24() {
		super.name = "Thunderbolt";
		super.type = AbilityType.ELECTRIC;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 90;
		super.accuracy = (float) 100.0;
		super.pp = (int) 15;
		super.effect = "?";
	}
}
