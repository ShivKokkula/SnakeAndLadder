package SnakeAndLadder;

public class SnakeAndLadder {
	
	int playerOne = 0;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game");
		SnakeAndLadder sn = new SnakeAndLadder();
		for (int i = 0; i < 100; i++) {
			System.out.println(sn.rollDice());
		}
		
	}
	
	public int rollDice() {
		
		int diceOutCome = (int) ((Math.floor(Math.random() * 10) % 6)+1);
		return diceOutCome;
	}

}
