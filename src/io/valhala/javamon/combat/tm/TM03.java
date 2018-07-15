package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM03 extends CombatAbility {
	
	public TM03() {
		super.name = "Swords Dance";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.STATUS;
		super.pp = (int) 20;
		super.power = (int) 0;
		super.accuracy = (float) 0.0;
		super.effect = "YES";
	}
}
