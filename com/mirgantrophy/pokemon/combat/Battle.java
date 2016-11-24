package com.mirgantrophy.pokemon.combat;

import com.mirgantrophy.pokemon.players.*;

public class Battle 
{
	public Battle(PlayerCharacter Player, PlayerCharacter NPC)
	{
		System.out.println("Battle Scenario Created");
		System.out.println("Your health: " + Player.getHealth());
		System.out.println("NPC health: " + NPC.getHealth());
	}

}
