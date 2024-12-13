/*
	Write a program that displays the first 20 powers of 2. Number and then the power.
 */


public class Pr15 {
	
	public static void main (String[] args) {
		
		int pow = 1;
		int power = 1;
		
		for (int i = 1; i <= 20; i++) {
			pow = pow * 2;
			System.out.println(pow + " = 2^" + power);
			power++;
		}
	}
}

