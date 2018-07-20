package io.valhala.javamon.item;

public abstract class BallAbstraction extends Item {

	private Ball bType;
	
	public BallAbstraction(String name, Ball bType) {
		super(name);
		this.bType = bType;
	}
	
	public String toString() {return super.toString();}

	public String getbType() {return bType.getBall();}

	public void setbType(Ball bType) {this.bType = bType;}
}
