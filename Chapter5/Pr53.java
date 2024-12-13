/*Pi can be calculated using the formula:
	𝜋/4 = 1 − 1/3 + 1/5 − 1/7 + 1/9 − 1/11 + ...
	Write a program that will add up the sequence discussed above to 10,000 terms. Output 4 times the
	answer to get pi. (3.1414926535900345)
*/


public class Pr53 {
	
	public static void main (String[] args) {
		double numerator = 1;
		double denominator = 1;
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			double term = numerator/denominator;
			sum = sum + term;
			denominator = denominator + 2;
			numerator = numerator * -1;
		}
		System.out.println(sum * 4);
	}
}

