/*
	Change the last program so that it only accepts numbers that are greater than 1 and outputs the
	word prime if indeed the number is prime and otherwise outputs the smallest prime that goes into
	the number.
 */


public class Pr32 {
	
	public static void main (String[] args) {
		int i = 2;
		int x;
		do {
			x = IBIO.inputInt("Enter a number: ");
		}
		while (x <= 1);
		do { 
			i++;
		} 
		while (x % i != 0 && i < x);
		if (i == x) {
			IBIO.output("Number is prime");
		}
		else {
			IBIO.output(x + " is divisible by " + i);
		}
	}
}

