package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM39 extends CombatAbility {
//broken
	public TM39() {
		super.name = "Swift";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 60;
		super.accuracy = (float) 0.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
