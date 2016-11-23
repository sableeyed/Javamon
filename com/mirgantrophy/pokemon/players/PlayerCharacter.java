package com.mirgantrophy.pokemon.players;


import com.mirgantrophy.pokemon.combat.CombatMethods;

public class PlayerCharacter implements CombatMethods
{
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
	public void pelt() 
	{
		
		
	}
	@Override
	public void bodySlam() 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void heal() 
	{
		// TODO Auto-generated method stub
		
	}
}
