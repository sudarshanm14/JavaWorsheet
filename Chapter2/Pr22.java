/*
	Write a program that will let you enter a number and will reply with EVEN or ODD depending if the
	number you entered was even or odd.
 */


public class Pr22 {
	
	public static void main (String[] args) {
		int x = IBIO.inputInt("Enter a number: ");
		if (x % 2 == 0)
			System.out.println("EVEN");
		if (x % 2 != 0)
			System.out.println("ODD");
	}
}

