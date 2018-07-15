package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM40 extends CombatAbility {

	public TM40() {
		super.name = "Skull Bash";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 130;
		super.accuracy = (float) 100.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
