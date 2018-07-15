package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM01 extends CombatAbility {
	
	public TM01() {
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 80;
		super.accuracy = (float) 85.0;
		super.pp = (int) 20;
		super.name = "Mega Punch";
		super.effect = "NONE";
	}

}
