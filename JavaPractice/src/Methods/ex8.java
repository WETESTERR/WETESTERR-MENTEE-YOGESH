package Methods;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Define a method called greatest that takes three numbers and returns the greatest of them. 
 * If there are multiple greatest values, returning one of them is enough. 
 * Printing will take place in the main program. */
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		int first = Integer.valueOf(scanner.nextLine());
		System.out.println("Enter Second Number");
		int second = Integer.valueOf(scanner.nextLine());
		System.out.println("Enter third Number");
		int third = Integer.valueOf(scanner.nextLine());
		int greater = greatest(first, second, third);
		
		System.out.println("The smaller number is "+greater);
			
		}


	public static int greatest(int number1,int number2, int number3)
	{
		if(number1>number2)
		{
			return number1;
		}else if(number2>number1)
		{
			return number2;
		}else
			return number3;
		
		
	}
}
