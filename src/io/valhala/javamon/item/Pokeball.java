/*
 * Backpack.additem(item e, int quantity)
 * Map.addItem(item e, location a, hidden t/f)
 * Map.getShop().addItem(item e)
 * TODO
 * Catch rates, etc.
 */
package io.valhala.javamon.item;

public class Pokeball extends BallAbstraction {

	private final int buyPrice= 200, sellPrice = 100;
	
	public Pokeball() {
		super("Poké Ball", Ball.POKE_BALL, 255);
	}
	
	public String toString() {return super.toString();}

	public int getBuyPrice() {return buyPrice;}

	public int getSellPrice() {return sellPrice;}

}

