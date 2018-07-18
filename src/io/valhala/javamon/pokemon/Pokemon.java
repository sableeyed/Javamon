package io.valhala.javamon.pokemon;

import io.valhala.javamon.pokemon.evolution.EvolutionMethod;
import io.valhala.javamon.pokemon.type.Type;

public abstract class Pokemon {
	
	private String name;
	private float hp, attack, defense, speed, special;
	private boolean hasEvolution;
	private int dexNumber;
	private Type type1, type2;
	private EvolutionMethod method;
	
	public Pokemon(String n, float h, float a, float d, float s, float ss, boolean hh, int dd,Type t1, Type t2) {
		this.name = n;
		this.hp = h;
		this.attack = a;
		this.defense = d;
		this.speed = s;
		this.special = ss;
		this.hasEvolution = hh;
		this.dexNumber = dd;
		this.type1 = t1;
		this.type2 = t2;
	}
	
	public Pokemon(String n, float h, float a, float d, float s, float ss, boolean hh, EvolutionMethod method, int dd, Type t1, Type t2) {
		this.name = n;
		this.hp = h;
		this.attack = a;
		this.defense = d;
		this.speed = s;
		this.special = ss;
		this.hasEvolution = hh;
		this.dexNumber = dd;
		this.type1 = t1;
		this.type2 = t2;
		this.method = method;
	}
	
	public String toString() {
		
		if(!(method == null)) {
			return "Name: " + getName() + "\nHP: " + getHp() + "\nAttack: " + getAttack() + "\nDefense: " + getDefense() + 
					"\nSpeed: " + getSpeed() + "\nSpecial: " + getSpecial() + "\nEvolves: " + isHasEvolution() + "\nDex Number: " + getDexNumber() +
					"\nType: "+ getType() +"\nMoE: " + getMethod();
		}
		else {
			return "Name: " + getName() + "\nHP: " + getHp() + "\nAttack: " + getAttack() + "\nDefense: " + getDefense() + 
					"\nSpeed: " + getSpeed() + "\nSpecial: " + getSpecial() + "\nEvolves: " + isHasEvolution() + "\nDex Number: " + getDexNumber() +
					"\nType: "+ getType();
		}
		
	}
	
	public void setType1(Type t) {
		this.type1 = t;
	}
	
	public void setType2(Type t) {
		this.type2 = t;
	}
	
	public String getMethod() {
		return method.toString();
	}
	
	
	public String getType() {
		if(!(type2 == null)) {
			return type1.toString()+"/"+type2.toString();
		}
		else {
			return type1.toString();
		}
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
