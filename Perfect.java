/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
	int input = Integer.parseInt(args[0]);
	int divisor = input - 1;
	int i = 0;
	int sum = 1;
	String str = input + " is a perfect number since " + input + " = 1";

	while ((i <= input) && (divisor > 1)){
		int kInt = input % divisor;
		int div = input / divisor;

		if (kInt == 0){
			str += " + " + div;
			sum += div;
		}

		divisor = divisor - 1;
		i++;
	}
	if (sum == input){
		System.out.println(str);

	} else {
		System.out.println(input + " is not a perfect number");

	}
	}
}
