package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM07 extends CombatAbility {
	
	public TM07() {
		super.name = "Horn Drill";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.pp = (int) 5;
		super.power = (int) 0;
		super.accuracy = (float) 30.0;
		super.effect = "YES";
	}
}
