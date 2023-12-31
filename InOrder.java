/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
	    int numGen1 = (int) (Math.random ()*10); 
        System.out.print(numGen1);
        
        int i = 0;
		do{
			int numGen2 = (int) (Math.random ()*10);
			if ( numGen2 >= numGen1){
				System.out.print(" " + numGen2);
				numGen1 = numGen2;
			} else{
				i++;
			}
		} while(i == 0);
	}
}
