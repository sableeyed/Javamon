package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM27 extends CombatAbility {
//broken
	public TM27() {
		super.name = "Fissure";
		super.type = AbilityType.GROUND;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 0;
		super.accuracy = (float) 30.0;
		super.pp = (int) 5;
		super.effect = "?";
	}
}
