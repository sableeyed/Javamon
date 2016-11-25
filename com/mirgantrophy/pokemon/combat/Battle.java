package com.mirgantrophy.pokemon.combat;

import java.util.Random;

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
		/* The battle only needs to last while one player is alive */
		do
		{
			switch(Player.getChoice())
			{
			case 1:
				System.out.println("Choice 1");
				System.out.println("NPC Health: " + NPC.getHealth());
				NPC.setHealth(NPC.getHealth() - Player.pelt());
				System.out.println("NPC Health: " + NPC.getHealth());
				break;
			case 2:
				System.out.println("Choice 2");
				System.out.println("NPC Health: " + NPC.getHealth());
				NPC.setHealth(NPC.getHealth() - Player.bodySlam());
				System.out.println("NPC Health: " + NPC.getHealth());
				break;
			case 3:
				System.out.println("Choice 3");
				System.out.println("Your Health: " + Player.getHealth());
				Player.setHealth(Player.getHealth() + Player.heal());
				System.out.println("Your Health: " + Player.getHealth());
				break;
			default:
				System.out.println("Plz make valid choice");
			}
			
			/* now we need to get the NPC choice */
			
			if(NPC.getHealth() > 40)
			{
				NPC.setHealth(NPC.heal());
			}
			else
			{
				Random rand = new Random(); /* what move should be made? */
				int x = rand.nextInt(1);
				if(x == 0)
				{
					Player.setHealth(NPC.pelt()); /* we still need to make sure we set the player health accordingly */
				}
				else
				{
					Player.setHealth(NPC.bodySlam());
				}
			}
			
		} while(Player.getHealth() > 1 && NPC.getHealth() > 1);
	}
}
