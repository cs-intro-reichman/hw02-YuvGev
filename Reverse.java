/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String str = args[0];
		int strLength = str.length() - 1;
		int location = strLength;

		for (int i = 0; i <= strLength ; i++ ){

			System.out.print(str.charAt(location));
			location--;

		}

		char midChar = str.charAt(strLength / 2);
		System.out.println();
		System.out.println("The middle character is " + midChar);
	}
}
