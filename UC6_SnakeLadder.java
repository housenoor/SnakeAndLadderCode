	package bridgelabzs;

	public class UC6_SnakeLadder {
		public static void main(String[] args) {
			
			//constants
			int LADDER = 1;
			int SNAKE = 2;
			int NO_PLAY = 0;

			//variable decleration
			int startPosition = 0;
			int newPosition = 0;
			int winPosition = 100;
			int count=0;

			while (startPosition < winPosition) {

				//random function to get dice number
				int diceNum = (int) Math.floor(((Math.random() * 10) % 6) + 1); //to get number b/w 1to6
				System.out.println("The Dice  number is = " + diceNum);
				//logic to know whether it snake & ladder & no play
				int option = (int) Math.floor(Math.random() * 10) % 3;
				System.out.println("The option is " + option);
				count++;

				switch (option) {
				case 1:
					option = LADDER;
					newPosition += diceNum;
					break;
				case 2:
					option = SNAKE;
					newPosition -= diceNum;
					break;
				default:
					option = NO_PLAY;
					newPosition += 0;
				}
				startPosition = startPosition + newPosition; //calculating the position of the dice

				if (startPosition < 0) {
					System.out.println("Restart the game");
					startPosition = 0;
				}
				if (startPosition > 100) {
					startPosition = newPosition;
				}

				System.out.println("You are now at " + startPosition + "th" + " position");
			}
			System.out.println("\nCongratulations.. you won! the Game \t after rolling the Die " + count+"position");
		}
	}