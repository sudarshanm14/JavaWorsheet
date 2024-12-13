/*
	Write a program that allows you to input the number of steps, the starting point and the increment
	and then prints out your sequence. So for example step = 4, start = 3, increment = 2. Then the
	sequence will be 3 5 7 9.
 */


public class Pr12 {
	
	public static void main (String[] args) {
		int step = IBIO.inputInt("Enter number of steps: ");
		int increment = IBIO.inputInt("Enter increment: ");
		int start = IBIO.inputInt("Enter start: ");
		
		for (int i = 1; i <= step; i++) {
			System.out.print(start + " ");
			start = start + increment;
		}
	}
}

