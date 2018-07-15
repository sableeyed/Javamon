package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM21 extends CombatAbility {
	
	public TM21() {
		super.type = AbilityType.GRASS;
		super.category = AbilityCategory.SPECIAL;
		super.accuracy = (float) 100.0;
		super.power = (int) 40;
		super.pp = (int) 15;
		super.name = "Mega Drain";
		super.effect = "Leeches 50% of the damage dealt.";
	}
	
}
