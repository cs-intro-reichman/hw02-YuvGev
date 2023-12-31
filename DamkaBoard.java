/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
				int input = Integer.parseInt(args[0]);
        int i = 0;
        while (i < input) {

            int j = 0;
            while (j < input) {
            	if((i % 2) == 0){
            		System.out.print("* ");
            	}else {
            		System.out.print(" *");
            	}
                j++;
            }
            System.out.println();
            i++;
        }
	}
}
