package bridgelabzs;

	public class UC3_SnakeLadder {
		public static void main(String[] args) {

			//constants
			int LADDER = 1;
			int SNAKE = 2;

			//variables

			double forwardStep, backwardStep;
			int startPosition = 0;
			System.out.println("The player postion is " + startPosition);

			//logic to get dice number
			double diceNum = Math.floor(((Math.random() * 10) % 6) + 1); //to get number b/w 1to6
			System.out.println("The Dice  number is = " + diceNum);

			//logic to know whether it snake & ladder & no play

			double option = Math.floor(Math.random() * 10) % 3;
			System.out.println("The option is " + option);


			//if condition for result
			if (option == LADDER) {
				forwardStep = (diceNum + startPosition);
				System.out.println("The Player will move forward positions " + forwardStep);
			} else if (option == SNAKE) {
				backwardStep = (diceNum - startPosition);
				System.out.println("The player will  step backword position" + backwardStep);
			} else
				System.out.println("There is No_Play and Player will Stay at the same Place" );
    }

}
