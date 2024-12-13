/*
	Write a program to count all the numbers from 1 to 1 000 000 which are not divisible by 2 or 3 or 5
	or 7. Output the results (the answer is 228571)
 */


public class Pr28 {
	
	public static void main (String[] args) {
		int x = 0;
		for (int i = 1; i <= 1000000; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				x++;
			}
		}
		System.out.print(x);
	}
}

