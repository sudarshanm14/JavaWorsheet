/*
	Write a program that will add up the sequence
	1*7 + 2*2 - 3*5 + 4*7 + 5*2 - 6*5 + 7*7 + 8*2 - 9*5 + 10*7 + … 1000
	Note that the there are three cases. First calculate the remainder when divided by 3. x%3. If the
	remainder is 0 then the number gets multiplied by -5, if the remainder is 1 then the number is
	multiplied by 7 and if the remainder is 2 then the number is multiplied by 2. (669004)
 */


public class Pr42 {
	
	public static void main (String[] args) {
		int num = 7;
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0) {
				num = i * -5;
				sum = sum + num;
			}
			else if (i % 3 == 1) {
				num = i * 7;
				sum = sum + num;
			}
			else if (i % 3 == 2) {
				num = i * 2;
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}

