package SnakeAndLadder;

public class SnakeAndLadder {
	
	int playerOne = 0;
	static int currentPosition = 0;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game");
		SnakeAndLadder sn = new SnakeAndLadder();
		
		for (int i = 0; i < 100; i++) {
			sn.getOptionAtcurrentPosition();
		}
		
		int finalPostion = currentPosition;
		System.out.println(finalPostion);
		
	}
	
	public int rollDice() {
		
		int diceOutCome = (int) ((Math.floor(Math.random() * 10) % 6)+1);
		System.out.println("Dice Outcome: " + diceOutCome);
		return diceOutCome;
	}
	
	public void getOptionAtcurrentPosition() {
		int optionMove = (int) (Math.floor(Math.random() * 10) % 3);
		
		switch(optionMove) {
		case 2:
			System.out.println("Ladder");
			currentPosition = currentPosition + rollDice();
			System.out.println("Current position: " + currentPosition);
			break;
		case 1:
			System.out.println("Snake");
			currentPosition = currentPosition - rollDice();
			System.out.println("Current Position: " + currentPosition);
			break;
		default:
			System.out.println("No Play");
			System.out.println("Current Position: " + currentPosition);
			break;
		}
		
	}

}
