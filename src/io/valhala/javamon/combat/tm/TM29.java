package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM29 extends CombatAbility {

	public TM29() {
		super.name = "Psychic";
		super.type = AbilityType.PSYCHIC;
		super.category = AbilityCategory.SPECIAL;
		super.power = (int) 90;
		super.accuracy = (float) 100.0;
		super.pp = (int) 10;
		super.effect = "?";
	}
}
