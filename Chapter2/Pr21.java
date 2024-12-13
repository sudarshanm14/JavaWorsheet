/*
	Alter the above program so that it will comment if you entered a number less than 50, or a number
	larger than 60.
 */


public class Pr21 {
	
	public static void main (String[] args) {
		int n = IBIO.inputInt("input a number between 50 and 60 ");
		if (n > 60)
			IBIO.output("that number was too big");
		if (n < 50)
			IBIO.output("that number was too small");
	}
}

