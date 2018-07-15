package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM47 extends CombatAbility {

	public TM47() {
		super.name = "Explosion";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 250;
		super.accuracy = (float) 100;
		super.pp = (int) 5;
		super.effect = "?";
	}
}
