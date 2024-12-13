/*
	Change the program so that it only accepts numbers that are even and are larger than 0 and less
	than 100.
 */


public class Pr31 {
	
	public static void main (String[] args) {
		int x;
		do { 
			x = IBIO.inputInt("Enter an even number between 0 and 100: ");
		} 
		while (x % 2 != 0 || x < 0 || x > 100);
		IBIO.output("Thank You");
	}
}

