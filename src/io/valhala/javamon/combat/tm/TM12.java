package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM12 extends CombatAbility{
	
	public TM12() { 
		super.name = "Water Gun";
		super.type = AbilityType.WATER;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 40;
		super.accuracy = (float) 100.0;
		super.pp = (int) 25;
		super.effect = "?";
	}
}
