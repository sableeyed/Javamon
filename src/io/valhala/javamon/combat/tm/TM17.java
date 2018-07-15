package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM17 extends CombatAbility {

	public TM17() {
		super.name = "Submission";
		super.type = AbilityType.FIGHTING;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 80;
		super.accuracy = (float) 80.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
