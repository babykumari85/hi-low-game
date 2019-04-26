import java.util.Scanner;
import java.lang.Math;

public class HiLo {

	public static void main(String[] args) {
		// input from keyboard
		Scanner scan = new Scanner(System.in);

		// play again string
		String playAgain = "";

		// game loop

		do {
			// create a random number from 1-100
			// int max = 100;
			// int min = 1;
			// int range = max - min + 1
			int myNumber = (int) (Math.random() * 100 + 1);

			int guess = 0;

			// Keep track of number of tries
			int numberOfTries = 0;

			while (guess != myNumber) {
				System.out.println("Guess a number between 1 and 100.");

				// get the user guess

				guess = scan.nextInt();

				// add one to the number of tries
				numberOfTries = numberOfTries + 1;

				if (guess < myNumber)
					System.out.println(guess + " " + " is too low. " + ", Please Try again.");
				else if (guess > myNumber)
					System.out.println(guess + " " + "is too high. " + ", Please Try again.");
				else
					System.out.println(guess + " is correct! You won. Hurrah!!!!");
			} // end of the while loop for guessing

			if (numberOfTries <= 5)
				System.out.println("Wow you look only " + numberOfTries + " tries ! Good luck!.");

			else if (numberOfTries >= 5)
				System.out.println("Wow you look only " + numberOfTries + " tries ! Good luck!.");

			else
				System.out.println("you look more than " + numberOfTries + " tries ! You can do bettr.");
			// ask for 'y'to play again
			System.out.println("would you like to play again(y/n)?");
			playAgain = scan.next();

		} while (playAgain.equalsIgnoreCase("y"));

		// thanks the user for playing

		System.out.println("thanks for the playing !.");

	}

}
