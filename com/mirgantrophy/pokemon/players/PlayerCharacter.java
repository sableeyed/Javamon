package com.mirgantrophy.pokemon.players;


import java.util.Random;
import java.util.Scanner;

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
	
	public int getChoice()
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		return x;
	}
}
