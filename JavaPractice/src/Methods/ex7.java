package Methods;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Define a two-parameter method smallest 
 * that returns the smaller of the two numbers passed to it as parameters
 */
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First Number");
	int first = Integer.valueOf(scanner.nextLine());
	System.out.println("Enter Second Number");
	int second = Integer.valueOf(scanner.nextLine());
	int smaller = small(first, second);
	
	System.out.println("The smaller number is "+smaller);
		
	}

	public static int small(int one, int two)
	{
		if(one<two)
		{
			return one;
		}else
			return two;
	}
}
