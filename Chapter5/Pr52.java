/*
	Write a program that it adds up the sequence
	1/1 + 1/4 + 1/9 + 1/16 + 1/25 + … for 100 terms (1.6348839001848923)
*/
public class Pr52 {
	
	public static void main (String[] args) {
		double x;
		double sum = 0;
		int divide = 1;
		for (int i = 1; i <= 100; i++) {
			x= i*i;
			sum = sum + (1/x);
		}
		System.out.println(sum);
	}
}

