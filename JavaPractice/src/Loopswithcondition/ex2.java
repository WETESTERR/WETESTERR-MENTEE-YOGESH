package Loopswithcondition;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program, which reads an integer from the user. 
 * Then the program prints numbers from that number to 100. 
 * You can assume that the user always gives a number less than 100. 
 * Below are some examples of the expected functionality. */
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int number = Integer.valueOf(scanner.nextLine());
		
		int i = number;
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
	}

}
