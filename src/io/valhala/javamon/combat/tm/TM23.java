package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM23 extends CombatAbility {
//broken
	public TM23() {
		super.name = "Dragon Rage";
		super.type = AbilityType.DRAGON;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 0;
		super.accuracy = (float) 100.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
