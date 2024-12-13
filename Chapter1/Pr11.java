/*
	Change the program so that you enter in a number and then the program will print your name down
	the screen that number of times.
 */


public class Pr11 {
	
	public static void main (String[] args) {
		int x = IBIO.inputInt("Enter a number: ");
		for (int i = 1; i <= x; i++) { 	
			IBIO.output("Sean");
		}
	}
}

