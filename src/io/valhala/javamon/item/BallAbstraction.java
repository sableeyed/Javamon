package io.valhala.javamon.item;

import io.valhala.javamon.combat.Encounter;
import io.valhala.javamon.combat.status.CombatStatus;
import io.valhala.javamon.pokemon.Pokemon;
import io.valhala.javamon.pokemon.skeleton.Abra;

/*
 * https://www.dragonflycave.com/mechanics/gen-i-capturing#algorithm
 */
public abstract class BallAbstraction extends Item {

	private CombatStatus status;
	private final int range;
	private Ball bType;
	private Pokemon wildPokemon;
	private Encounter currentEncounter;
	private int catchRate;
	
	public BallAbstraction(String name, Ball bType, int range) {
		super(name);
		this.bType = bType;
		this.range = range;
	}
	
	public BallAbstraction(String name, Ball bType, int range, CombatStatus status) {
		super(name);
		this.bType = bType;
		this.range = range;
		this.status = status;
	}
	
	public String toString() {return super.toString();}

	public String getbType() {return bType.getBall();}

	public void setbType(Ball bType) {this.bType = bType;}
	
	public int getRange() {return range;}
	
	public void setStatus(CombatStatus status) {this.status = status;}
	
	public String getStatus() {return status.toString();}
	
	private void use() {
		currentEncounter = new Encounter(new Abra());
		//populate the pokemon.. so encounter.getRivalPokemon? Since you can't catch until you are in a battle..
		switch(bType) {
		case GREAT_BALL:
			break;
		case MASTER_BALL:
			break;
		case POKE_BALL:
			break;
		case SAFARI_BALL:
			break;
		case ULTRA_BALL:
			break;
		default:
			break;
		
		}
	}

	public Pokemon getWildPokemon() {
		return wildPokemon;
	}

	public void setWildPokemon(Pokemon wildPokemon) {
		this.wildPokemon = wildPokemon;
	}

	public Encounter getCurrentEncounter() {
		return currentEncounter;
	}

	public void setCurrentEncounter(Encounter currentEncounter) {
		this.currentEncounter = currentEncounter;
	}
	
}
