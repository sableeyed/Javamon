package com.mirgantrophy.pokemon.combat;

import com.mirgantrophy.pokemon.players.*;

public class Battle 
{
	public boolean inCombat;
	public Battle(PlayerCharacter Player, PlayerCharacter NPC)
	{
		System.out.println("Battle Scenario Created");
	}
	
	public void battle(PlayerCharacter Player, PlayerCharacter NPC)
	{
		while(Player.getHealth() > 1 && NPC.getHealth() > 1)
		{
			System.out.println("Inside battle loop");
		}
	}
	
	public int getChoice(PlayerCharacter Player)
	{
		return Player.getChoice();
	}
}
