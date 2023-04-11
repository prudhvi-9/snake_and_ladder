package snakeAndLadderGame;

import java.util.Random;

public class PlayerRollsDiece {

	/**
	 * This method is created to roll the diece and get a number between 1 to 6.
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int x = random.nextInt(6)+1;

		System.out.println("Diece number is:" +x );
	}

}
