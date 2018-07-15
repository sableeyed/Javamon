package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM08 extends CombatAbility {
	
	public TM08() {
		super.name = "Body Slam";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 85;
		super.pp = (int) 15;
		super.accuracy = (float) 100.0;
		super.effect = "?";
	}

}
