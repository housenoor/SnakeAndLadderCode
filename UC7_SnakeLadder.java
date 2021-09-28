	package bridgelabzs;

	public class UC7_SnakeLadder {
		public class snakeAndLadder {
			
			//declering constant variables
		}
		public static final int LADDER = 1;
		public static final int SNAKE = 2;
		public static final int NO_PLAY = 0;

		public static void main(String[] args) {
			System.out.println("Welcome to Snake And Ladder Game.");
			
			//variable decleration
			
			int player1Position=0;
			int player2Position=0;
			int newPosition = 0;
			int currentPlayer=1;
			int count1 = 0;
			int count2=0;
			int option;

			//delcaring while loop condition for player1 & player2 Turns
			while (true) {
				//Logic for Player 1
				if (currentPlayer == 1) {
					System.out.println("Now Player-1's turn");
					count1++;
					//random function to get dice number
					int diceNum = (int) Math.floor((Math.random() * 6) + 1);
					System.out.println("The Die number is = " +diceNum);
					//logic to know whether it snake & ladder & no play
	                option = (int) Math.floor((Math.random() * 3));
	                System.out.println("The Option is =" +option);

					switch (option) {
					case NO_PLAY:
						newPosition = 0;
						break;
					case LADDER:
						newPosition = diceNum;
						break;
					case SNAKE:
						newPosition = -diceNum;
						break;
					}
					 player1Position = player2Position + newPosition;
		                if (player1Position < 0) {
		                    player1Position = 0;
		                }
					if (player1Position > 100) {
						player1Position = newPosition;
					}
					System.out.println("now Player-1 at " + player1Position + "th" + " Position");
					if (player1Position == 100) {
						break;
					}
				}
				else {
					//logic for player 2
					count2++;
					System.out.println("Now Player-2's turn");
					int DieRolled = (int) (Math.random() * 6) + 1;
					option = (int) (Math.random() * 3);

					switch (option){
					case NO_PLAY:
						newPosition = 0;
						break;
					case LADDER:
						newPosition = DieRolled;
						break;
					case SNAKE:
						newPosition = -DieRolled;
						break;
					}
					player2Position = player2Position + newPosition;
					if (player2Position < 0) {
						player2Position = 0;
					}
					if (player2Position > 100) {
						player2Position = newPosition;
					}
					System.out.println("Now Player-2 at " + player2Position + "th" + " Position");
						if (player2Position == 100) {
							break;
						}
				}
				if (option==1) {
						System.out.println("You got Ladder. Now play again.");
				}
				else {
					if (currentPlayer==1) {
						currentPlayer = 2;
					}
					else  {
						currentPlayer = 1;
					}
				}
			}
			if (player1Position==100) {
				System.out.println("\nCongratulation Player-1 you won! \n after die Rolled"+ count1+" times.");
			} else {
				System.out.println("\nCongratulation Player-2 you won! \n after die Rolled"+ count2+" times.");
			}

		}

	}
