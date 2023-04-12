package snakeAndLadderGame;

public class PlayerAtPositionZero {

	/**
	 * Initializise snake and ladder values
	 */
	int snake[] = { 12, 46, 57, 78 };
	int ladder[] = { 13, 47, 58, 79 };

	/**
	 * This method is created to check Snake and Ladder game played with single player at start
     * position 0
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		PlayerAtPositionZero snakeAndLadderGame = new PlayerAtPositionZero();
		snakeAndLadderGame.snakeAndLadder();
	}

	public void snakeAndLadder() {
		Player sourabh = new Player();
		while (sourabh.getPostion() != 1) {
			System.out.println("Position = " + sourabh.getPostion());
			break;
		}
	}
}
