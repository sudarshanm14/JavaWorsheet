/*
	Write a program that will let you enter two numbers. Then it will ask you to enter “1” for add, “2” for
	multiply, “3” for quit.
 */


public class Pr41 {
	
	public static void main (String[] args) {
		int x = IBIO.inputInt("Enter first number: ");
		int y = IBIO.inputInt("Enter second number: ");
		
		System.out.println("Press:	[1]	for addition");
		System.out.println("	[2]	for multiplication");
		System.out.println("	[3]	for quit");
		int num = IBIO.inputInt();
		
		mainLoop: do {
			switch (num) {
				case 1:
					System.out.println("Your number is " + x + y);
					break mainLoop;
				case 2:
					System.out.println("Your number is " + x * y);
					break mainLoop;
			}
		}
		while (num != 3);
		
	}
}

