package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM49 extends CombatAbility {

	public TM49() {
		super.name = "Tri Attack";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 80;
		super.accuracy = (float) 100.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
