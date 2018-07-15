package io.valhala.javamon.combat.tm;

import io.valhala.javamon.combat.AbilityCategory;
import io.valhala.javamon.combat.AbilityType;
import io.valhala.javamon.combat.CombatAbility;

public abstract class TM06 extends CombatAbility {

	public TM06() {
		super.name = "Toxic";
		super.type = AbilityType.POISON;
		super.category = AbilityCategory.STATUS;
		super.pp = (int) 10;
		super.power = (int) 0;
		super.accuracy = (float) 90.0;
		super.effect = "YES";
	}
}
