package snakeAndLadderGame;

public class NumberOfTimesDieceRolled {
	/**
	 * Initializise snake and ladder values
	 */
	int snake[] = { 12, 46, 57, 78 };
	int ladder[] = { 13, 47, 58, 79 };
	int count;

	/**
	 * This method is created to check the player position after every die rolled.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		NumberOfTimesDieceRolled snakeAndLadderGame = new NumberOfTimesDieceRolled();
		snakeAndLadderGame.snakeAndLadder();
	}

	/**
	 * Calculate the number of times dice rolled. Calculate the position after every
	 * die role.
	 */

	public void snakeAndLadder() {
		Player sourabh = new Player();

		while (sourabh.getPostion() != 100) {

			System.out.println("Position = " + sourabh.getPostion());
			count++;
			System.out.println("Dice rolled:" + count);
			player(sourabh);

		}
		System.out.println("Position = " + sourabh.getPostion());
		player(sourabh);

	}

	/**
	 * The Player checks for a Option. To move ahead,move behind or stay in the same
	 * position.
	 */

	public void player(Player sourabh) {
		int position = sourabh.getPostion();
		int randomNum = getRandomNumber(6);
		while (randomNum == 6 && position <= 94) {
			position += randomNum;

			if (isSnake(position)) {
				position -= 5;
				break;
			} else if (isLadder(position)) {
				position += 5;
				randomNum = getRandomNumber(6);
			} else {
				randomNum = getRandomNumber(6);
			}
		}
		/**
		 * If the player position go above 100, then the player stays in the same
		 * previous position till the player gets the exact number that adds to 100.
		 */
		if ((position <= 95 && randomNum == 5) || (position <= 96 && randomNum == 4)
				|| (position <= 97 && randomNum == 3) || (position <= 98 && randomNum == 2)
				|| (position <= 99 && randomNum == 1)) {
			position += randomNum;
			if (isSnake(position)) {
				position -= 5;
			} else if (isLadder(position) && position + 5 <= 100) {
				position += 5;
				randomNum = getRandomNumber(6);
			}
		}

		sourabh.setPostion(position);

	}

	/**
	 * This method is created to check whether the player position is same as the
	 * snake position.
	 * 
	 * @param position
	 * @return
	 */
	public boolean isSnake(int position) {
		for (int i = 0; i < snake.length; i++) {
			if (position == snake[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method is created to check whether the player position is same as the
	 * ladder position.
	 * 
	 * @param position
	 * @return
	 */
	public boolean isLadder(int position) {
		for (int i = 0; i < ladder.length; i++) {
			if (position == ladder[i]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method is created to generate the random values.
	 * 
	 * @param value
	 * @return
	 */
	public int getRandomNumber(int value) {
		return (int) Math.floor(Math.random() * value + 1);
	}
}