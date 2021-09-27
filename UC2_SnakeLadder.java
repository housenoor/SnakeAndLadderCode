package bridgelabzs;

	public class UC2_SnakeLadder {
		public static void main(String[] args) {
			System.out.println("Welcome to Snake And Ladder Game.");

			int startPosition = 0;
			System.out.println("The player postion is " + startPosition);
			double diceNo = Math.floor(((Math.random() * 10) % 6) + 1); //to get number b/w 1to6
			System.out.println("The Dice  number is = " + diceNo);

    }
}
