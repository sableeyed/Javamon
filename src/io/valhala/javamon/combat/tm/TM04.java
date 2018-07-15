package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM04 extends CombatAbility {
	//Priority
	public TM04() {
		super.name = "Whirlwind";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.STATUS;
		super.power = (int) 0;
		super.pp = (int) 20;
		super.accuracy = (float) 0.0;
		super.effect = "YES";
	}
}
