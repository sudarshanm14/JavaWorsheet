/*
	Write a program to print out the cubes of numbers from 1 to 10 so that they line up on the right using
	the same idea as above.
 */


public class Pr24 {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i < 10) {
				System.out.println(" " + i * i * i);
			}
			else if (i < 100 && i >= 10) {
				System.out.println(" " + i * i * i);
			}
			else if (i < 1000 && i >= 100) {
				System.out.println("  " + i * i * i);
			}
			else {
				System.out.println(" " + i * i * i);
			}
		}
	}
}

