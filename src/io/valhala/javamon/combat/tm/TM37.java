package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM37 extends CombatAbility {

	public TM37() {
		super.name = "Egg Bomb";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 100;
		super.accuracy = (float) 75.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
