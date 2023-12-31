
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		String gender = "";
		int sum = 0;
		int girls = 0;
		int boys = 0;

		int i = 0;
		while (i == 0){
			int odds  = (int) (Math.random ()*2);
			if (odds == 0){
				gender += "g ";
				girls ++;
			} else{
				gender += "b ";
				boys ++;
			}
			sum ++;
			if ((girls > 0) && (boys > 0)){
				i++;
			}

		}
		System.out.println(gender);
		System.out.println("You made it... and you now have " + sum + " children.");
	}
}
