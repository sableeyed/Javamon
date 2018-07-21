package io.valhala.javamon.item;

public class UltraBall extends BallAbstraction {

	private final int buyPrice= 800, sellPrice = 400;
	
	public UltraBall() {
		super("Ultra Ball", Ball.ULTRA_BALL,150);
	}
	
	public String toString() {return super.toString();}

	public int getBuyPrice() {return buyPrice;}

	public int getSellPrice() {return sellPrice;}
	
}
