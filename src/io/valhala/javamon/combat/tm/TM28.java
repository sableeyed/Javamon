package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM28 extends CombatAbility {

	public TM28() {
		super.name = "Dig";
		super.type = AbilityType.GROUND;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 80;
		super.accuracy = (float) 100.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
