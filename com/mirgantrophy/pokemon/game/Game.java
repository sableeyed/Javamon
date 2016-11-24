/*
 * Version 1 - 11/23/2016
 * Project Description: A simple turn based style game(similar to pokemon)
 * Changelog: N/A
 */
package com.mirgantrophy.pokemon.game;

import com.mirgantrophy.pokemon.combat.Battle;
import com.mirgantrophy.pokemon.players.*;

public class Game
{
	
	public static void main(String[] args)
	{
		PlayerCharacter pc = new PlayerCharacter();
		PlayerCharacter npc = new PlayerCharacter();
		Battle bScenario = new Battle(pc, npc);
		System.out.println(pc.pelt());
	}
}
