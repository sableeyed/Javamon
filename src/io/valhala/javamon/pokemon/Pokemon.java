package io.valhala.javamon.pokemon;

public abstract class Pokemon {
	
	private String name;
	private float hp, attack, defense, speed, special;
	private boolean hasEvolution;
	private int dexNumber;
	//private Type type1, type2;
	
	public Pokemon(String n, float h, float a, float d, float s, float ss, boolean hh, int dd) {
		this.name = n;
		this.hp = h;
		this.attack = a;
		this.defense = d;
		this.speed = s;
		this.special = ss;
		this.hasEvolution = hh;
		this.dexNumber = dd;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public float getAttack() {
		return attack;
	}

	public void setAttack(float attack) {
		this.attack = attack;
	}

	public float getDefense() {
		return defense;
	}

	public void setDefense(float defense) {
		this.defense = defense;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getSpecial() {
		return special;
	}

	public void setSpecial(float special) {
		this.special = special;
	}

	public boolean isHasEvolution() {
		return hasEvolution;
	}

	public void setHasEvolution(boolean hasEvolution) {
		this.hasEvolution = hasEvolution;
	}

	public int getDexNumber() {
		return dexNumber;
	}

	public void setDexNumber(int dexNumber) {
		this.dexNumber = dexNumber;
	}
}
