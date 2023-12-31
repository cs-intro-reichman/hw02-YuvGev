/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
	int input = Integer.parseInt(args[0]);
	int divisor = input;
	int i = 0;

	while ((i <= input) && (divisor != 0)){
		
		int kInt = input % divisor;

		if (kInt == 0){

			System.out.println(input / divisor);
		}
		
		divisor = divisor - 1;
		i++;

	}
	}
}
