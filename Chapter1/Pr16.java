/*
	The Fibonacci sequence is obtained by adding together the two terms of a sequence to get the next
	term: 3 , 4 , 7 (because 3 + 4 = 7), 11, 18, etc. Write a program that allows you to input the number
	of terms of the Fibonacci sequence that should be calculated and output.
 */


public class Pr16 {
	
	public static void main (String[] args) {
		int terms = IBIO.inputInt("Enter number of terms: ");
		int first = 0;
		int second = 1;
		int next;
		System.out.print(first + " " + second + " ");
		
		for (int i = 1; i <= terms - 1; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(next + " ");
		}
	}
}

