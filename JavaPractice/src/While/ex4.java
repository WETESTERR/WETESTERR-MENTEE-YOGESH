package While;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// Problem statment:
/*Write a program that reads values from the user until they input a 0. 
 After this, the program prints the total number of inputted values that are negative. 
 The zero that's used to exit the loop should not be included in the total number count. */

		int negative = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Give a number: ");
			int number = Integer.valueOf(scanner.nextLine());
			if(number==0) {
				break;
			}
			if(number<0)
			{
				negative = negative+1;
			}

		}
		System.out.println("Total negative numbers entered: "+negative);
	}

}
