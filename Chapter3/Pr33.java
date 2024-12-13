/*
	Change this program so that it will add up the cubes of the digits of the number. So if the input number
	was 345 it would go 3^3 + 4^3 + 5^3
.
 */


public class Pr33 {
	
	public static void main (String[] args) {
		int sum = 0;
		int n = IBIO.inputInt("Enter a number ");
		do { 
			int digit = n % 10; 
			sum = sum + (digit * digit * digit);
			n = n / 10;
		} 
		while ( n != 0);
		IBIO.output("The sum of the digits of the number is " + sum);
	}
}

