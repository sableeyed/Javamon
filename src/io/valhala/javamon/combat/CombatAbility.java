package io.valhala.javamon.combat;

// 1/256 certainty
public abstract class CombatAbility {

	protected AbilityCategory category;
	protected AbilityType type;
	protected float power, accuracy;
	protected int pp;
	protected String effect, name;
	
	public CombatAbility() {}
	
	public CombatAbility(AbilityCategory c, AbilityType t, float p, float a, int pp, String e, String n) {
		this.category = c;
		this.type = t;
		this.power = p;
		this.accuracy = a;
		this.pp = pp;
		this.effect = e;
		this.name = n;
	}
	
	public AbilityCategory getCategory() {
		return category;
	}
	public void setCategory(AbilityCategory category) {
		this.category = category;
	}
	public AbilityType getType() {
		return type;
	}
	public void setType(AbilityType type) {
		this.type = type;
	}
	public float getPower() {
		return power;
	}
	public void setPower(float power) {
		this.power = power;
	}
	public float getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}
	public int getPp() {
		return pp;
	}
	public void setPp(int pp) {
		this.pp = pp;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
