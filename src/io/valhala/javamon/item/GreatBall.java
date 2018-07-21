package io.valhala.javamon.item;

public class GreatBall extends BallAbstraction {

	private final int buyPrice= 600, sellPrice = 300;
	
	public GreatBall() {
		super("Great Ball", Ball.GREAT_BALL,200);
	}
	
	public String toString() {return super.toString();}

	public int getBuyPrice() {return buyPrice;}

	public int getSellPrice() {return sellPrice;}
}
