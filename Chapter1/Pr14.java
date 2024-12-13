/*
	Write a program that displays the first 100 terms of the triangular sequence. This is the sequence
	that goes 1,3,6,10,15,21,… The rule is that you add on 2, then add on 3, then add on 4, etc.
 */


public class Pr14 {
	
	public static void main (String[] args) {
		int start = 1;
		int increment = 2;
		for (int i = 1; i <= 100; i++) {
			System.out.print(start + " ");
			start = start + increment;
			increment += 1;
		}
	}
}

