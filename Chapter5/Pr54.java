/*
	𝜋/2 = 1 + 1/3 + 1 × 2/3 × 5 + 1 × 2 × 3/3 × 5 × 7 + 1 × 2 × 3 × 4/3 × 5 × 7 × 9 + ...
	The sequence above is a much quicker way of calculating pi Write a program that will add up the
	sequence above to 100 terms. Output double the answer (3.1415926535897922)
*/


public class Pr54 {
	
	public static void main (String[] args) {
		double numerator = 1;
		double sum = 0;
		double denominator = 1;
		double term = 1;
		for (int i = 1; i <= 100; i++) {
			term = numerator / denominator;
			sum = sum + term;
			numerator = numerator * i;
			denominator = denominator * (2 * i + 1);
		}
		System.out.println(sum * 2);
	}
}

