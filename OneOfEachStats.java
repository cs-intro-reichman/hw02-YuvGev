import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int input = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
        int child2 = 0;
	    int child3 = 0;
		int child4 = 0;
	    double totalSum = 0;

		for (int t = 0; t < input; t++){   // this is loop for the number of families.
		    int sum = 0;
		    int girls = 0;   // girls boolean.
		    int boys = 0;    // boys boolean.

		    int i = 0;
		    while (i == 0){    // this is the "boolean" loop for each family.
			    double odds = generator.nextDouble();
			    if (odds >= 0.5){
				    girls ++;
			    } else{
				    boys ++;
			    }
			    sum ++;

			    if ((girls > 0) && (boys > 0)){    // checking if the boolean is true.

				    if (sum == 2){                 // adding the stats.
					    child2++;
				    }
				    if (sum == 3){
					    child3++;
				    }
				    if (sum >= 4){
					    child4++;
				    }
				    totalSum += sum;
				    i++;              // resets the loop for the next family.
				}
			}
		}
		double avrg = (totalSum / input);
		int common = Math.max(Math.max(child2, child3), Math.max(child3, child4));

		System.out.println("Average: " + avrg +" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + child2);
		System.out.println("Number of families with 3 children: " + child3);
		System.out.println("Number of families with 4 or more children: " + child4);

		if (common == child2){
			System.out.println("The most common number of children is 2.");
		} else {
			if (common ==child3){
			    System.out.println("The most common number of children is 3.");
			} else {
				System.out.println("The most common number of children is 4 or more.");
			}
		}	    
	}
}
