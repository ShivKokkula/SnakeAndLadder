package SnakeAndLadder;

public class SnakeAndLadder {
	
	int playerOne = 0;
	static final int IS_LADDER = 2;
	static final int IS_SNAKE = 1;
	static int currentPosition = 0;
	static final int winnigPosition = 100;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game");
		SnakeAndLadder sn = new SnakeAndLadder();
		
		while (currentPosition < winnigPosition) {
			sn.getOptionAtcurrentPosition();
		}
		
		
	}
	
	public int rollDice() {
		
		int diceOutCome = (int) ((Math.floor(Math.random() * 10) % 6)+1);
		System.out.println("Dice Outcome: " + diceOutCome);
		return diceOutCome;
	}
	
	public void getOptionAtcurrentPosition() {
		int optionMove = (int) (Math.floor(Math.random() * 10) % 3);
		
		switch(optionMove) {
		case IS_LADDER:
			System.out.println("Ladder");
			currentPosition = currentPosition + rollDice();
			if (currentPosition > 100) {
				currentPosition = 100;
			}
			System.out.println("Current position: " + currentPosition);
			break;
		case IS_SNAKE:
			System.out.println("Snake");
			currentPosition = currentPosition - rollDice();
			if (currentPosition < 0) {
				currentPosition = 0;
			}
			System.out.println("Current Position: " + currentPosition);
			break;
		default:
			System.out.println("No Play");
			System.out.println("Current Position: " + currentPosition);
			break;
		}
		
		
		
	}

}
