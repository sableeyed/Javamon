package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM38 extends CombatAbility {

	public TM38() {
		super.name = "Fire Blast";
		super.type = AbilityType.FIRE;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 110;
		super.accuracy = (float) 85.0;
		super.pp = (int) 5;
		super.effect = "?";
	}
}
