package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM20 extends CombatAbility {

	public TM20() {
		super.name = "Rage";
		super.type = AbilityType.NORMAL;
		super.category = AbilityCategory.PHYSICAL;
		super.power = (int) 20;
		super.accuracy = (float) 100.0;
		super.pp = (int) 20;
		super.effect = "?";
	}
}
