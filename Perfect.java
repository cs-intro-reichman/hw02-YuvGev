/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
	    int input = Integer.parseInt(args[0]);
	    int divisor = input - 1;
	    int sum = 1;
	    String answer = input + " is a perfect number since " + input + " = 1";

	    int i = 0;
	    while ((i <= input) && (divisor > 1)){
		    int k = input % divisor;
		    int div = input / divisor;

		    if (k == 0){
			    str += " + " + div;
			    sum += div;
		    }
		    divisor = divisor - 1;
		    i++;
	    }
	    if (sum == input){
		    System.out.println(answer);
	    } else {
		    System.out.println(input + " is not a perfect number");
	    }
	}
}
