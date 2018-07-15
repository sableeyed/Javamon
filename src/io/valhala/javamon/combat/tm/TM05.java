package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM05 extends CombatAbility {
	
	public TM05() {
		super.name = "Mega Kick";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 120;
		super.pp = (int) 5;
		super.accuracy = (float) 75.0;
		super.effect = "NONE";
	}

}
