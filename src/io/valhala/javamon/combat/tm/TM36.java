package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM36 extends CombatAbility {

	public TM36() {
		super.name = "Self-Destruct";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 200;
		super.accuracy = (float) 100.0;
		super.pp = (int) 5;
		super.effect = "?";
	}
}
