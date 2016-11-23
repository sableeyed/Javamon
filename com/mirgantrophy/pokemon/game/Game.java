/*
 * Version 1 - 11/23/2016
 * Project Description: A simple turn based style game(similar to pokemon)
 * Changelog: N/A
 */
package com.mirgantrophy.pokemon.game;

import java.util.Scanner;
import com.mirgantrophy.pokemon.players.*;

public class Game
{
	
	public static void main(String[] args)
	{
		Scanner playerChoice = new Scanner(System.in);
		PlayerCharacter pc = new PlayerCharacter();
		System.out.println(pc.getHealth());
		
	}

	public static String battleMenu()
	{
		String menu = "1: Pelt" + "\n" +"2: Body Slam" + "\n" + "3: Heal";
		return menu;	
	}
}
