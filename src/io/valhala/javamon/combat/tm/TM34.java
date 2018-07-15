package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM34 extends CombatAbility {
//broken, priority +1
	public TM34() {
		super.name = "Bide";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 0;
		super.accuracy = (float) 0.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
