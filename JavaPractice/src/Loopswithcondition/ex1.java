package Loopswithcondition;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program that reads an integer from the user. 
Next, the program prints numbers from 0 to the number given by the user. 
You can assume that the user always gives a positive number. */

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = Integer.valueOf(scanner.nextLine());
		/*for (int i=0; i<=number; i++)
		{
			System.out.println(i);
			
		}*/
		
		int i = 0;
		while(i<=number) {
			System.out.println(i);
			i++;
		}
	}

}
