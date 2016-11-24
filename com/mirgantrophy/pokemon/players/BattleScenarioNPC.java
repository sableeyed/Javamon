package com.mirgantrophy.pokemon.players;

import java.util.Random;

import com.mirgantrophy.pokemon.combat.CombatMethods;

public class BattleScenarioNPC implements CombatMethods
{
	private int health;
	Random rand = new Random();
	public BattleScenarioNPC()
	{
		this.health = 100;
	}
	@Override
	public int pelt() 
	{
		int dmg = rand.nextInt(13) + 8;
		return dmg;
	}
	@Override
	public int bodySlam() 
	{
		int dmg = rand.nextInt(25) + 10;
		return dmg;
	}
	@Override
	public int heal() 
	{
		int dmg = rand.nextInt(5) + 10;
		return dmg;
	}
	
}
