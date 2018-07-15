package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM19 extends CombatAbility {
//broken
	public TM19() {
		super.name = "Seismic Toss";
		super.type = AbilityType.FIGHTING;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 0;
		super.accuracy = (float) 100.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
