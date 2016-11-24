package com.mirgantrophy.pokemon.players;


import java.util.Random;

import com.mirgantrophy.pokemon.combat.CombatMethods;

public class PlayerCharacter implements CombatMethods
{
	private Random rand = new Random();
	private int health;
	public PlayerCharacter()
	{
		this.health = 100;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	@Override
	public int pelt() 
	{
		int dmg = rand.nextInt(30);
		return dmg;
	}
	@Override
	public int bodySlam() 
	{
		return 0;
	}
	@Override
	public int heal() 
	{
		return 0;
	}
}
