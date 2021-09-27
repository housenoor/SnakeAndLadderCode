package bridgelabzs;

	public class UC4_Snakeladder {
		public static void main(String[] args) {
			System.out.println("Welcome to Snake And Ladder Game.");

			//constants
			int LADDER = 1;
			int SNAKE = 2;
			int NO_PLAY = 0;

			int startPosition = 0;
			int winPosition = 100;
			System.out.println("The player position is " + startPosition);

			while (startPosition < winPosition) {

				//random function to get dice number
				int diceNum = (int) Math.floor(((Math.random() * 10) % 6) + 1); //to get number b/w 1to6
				System.out.println("The Dice  number is = " + diceNum);

				//logic to know whether it snake & ladder & no play

				int option = (int) Math.floor(Math.random() * 10) % 3;
				System.out.println("The option is " + option);

				switch (option) {
				case 1:
					option = LADDER;
					startPosition += diceNum;
					break;
				case 2:
					option = SNAKE;
					startPosition -= diceNum;
					break;
				default:
					option = NO_PLAY;
					startPosition += 0;

					if (startPosition < 0) {
						System.out.println("Restart the game");
						startPosition = 0;
					}
				}


			}
			System.out.println("The player on position: " + winPosition);
			System.out.println("Won the Match");
		}
	}
