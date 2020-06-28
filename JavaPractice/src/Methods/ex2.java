package Methods;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Create the following method in the exercise template: 
 * public static void printFromNumberToOne(int number).
 *  It should print the numbers from the number passed as a parameter down to one. 
 *  Two examples of the method's usage are given below.
 */

		printUntilNumber(5);
		
		

	}
	public static void printUntilNumber(int number)
	{
		int i =0;
		while(i<number)
		{
			System.out.println(number-i);
			i++;
		}
	}
}
