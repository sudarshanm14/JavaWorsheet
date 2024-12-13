/*
	Write a program that allows the user to enter a number less than 1000. The program will search for
	two numbers that when squared and added together make the number that was input. The program
	has two loops. One loop going from 1 to num and the second loop also goes from 1 to num also. In
	the loop the program will square the numbers and then add them together to see if they are the same
	as the input number. If they are then use the break statement to break out of both loops. Your output
	will be the numbers or state that it is impossible.
*/


public class Pr43 {
	
	public static void main (String[] args) {
		int x = 1;
		int y = 1;
		int sum = 0;
		int n;
		do {
			n = IBIO.inputInt("Enter a number less than 1000: ");
		}
		while (x > 1000);
		
		mainLoop: for (x = 1; x <= n; x++) {
			for (y = 1; y <= n ; y++) {
				sum = (x*x) + (y*y);
				if (sum == n) {
					break mainLoop;
				}
			}
		}
		if (sum == n) {
			System.out.println(x + " and " + y + " sqaured and added together = " + n);
		}
		else {
			System.out.println("Pair of numbers are impossible to find");
		}
	}
}

