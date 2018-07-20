package io.valhala.javamon.item;

public enum Ball {
	POKE_BALL,
	GREAT_BALL,
	ULTRA_BALL,
	SAFARI_BALL,
	MASTER_BALL;
		
	private String ball;
	
	public void setBall(String ball) {this.ball = ball;}
	
	public String getBall() {return ball.toString();}
}

