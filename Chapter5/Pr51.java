/*
	Write a program that will add up the sequence
	1/5 + 1/25 + 1/125 + 1/625 + … for 100 terms. (0.25)
*/


public class Pr51 {
	
	public static void main (String[] args) {
		double term = 1;
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			term = term / 5;
			sum = sum + term;
		}
		System.out.println(sum);
	}
}

