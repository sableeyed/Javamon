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
			do /*we need to make sure the player chooses a valid move */
			{
				System.out.print("What move will you make? ");
				if(Player.getChoice() == 1)
				{
					System.out.println("proper logic");
				}
			} while(Player.getChoice() < 1 || Player.getChoice() > 3);
			
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
					NPC.pelt(); /* we still need to make sure we set the player health accordingly */
				}
				else
				{
					NPC.bodySlam();
				}
			}
			
		} while(Player.getHealth() > 1 && NPC.getHealth() > 1);
	}
	
	/* Do i even need this method? getChoice() is public, so I don't think I do? */
	public int getChoice(PlayerCharacter Player)
	{
		return Player.getChoice();
	} 
}
