/*
	Write a program to print out the numbers from 1 to 100 but omit printing all the even numbers. Do
	this by using for (int i = 1; i <= 100; i++)
 */


public class Pr25 {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}

