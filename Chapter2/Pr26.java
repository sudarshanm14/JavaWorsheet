/*
	As above write a program to print out the numbers from 1 to 100 but omit printing all the even
	numbers and all the numbers divisible by 3.
 */


public class Pr26 {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				if (i % 3 != 0) {
					System.out.println(i);
				}
			}
		}
	}
}

