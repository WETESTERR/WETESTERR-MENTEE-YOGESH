package Loopswithcondition;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// Problem Statement
/*Write a program which prints the integers from 1 to a number given by the user.
Ask the user for the starting point as well.
If the upper limit is larger than the starting point, nothing is printed:*/
		int i = 1;
		
		System.out.println("Where to?");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.valueOf(scanner.nextLine());
		System.out.println("Where from?");
		int from = Integer.valueOf(scanner.nextLine());
		
		for(i=from;i<=number; i++)
		{
			System.out.println(i);
		
		}
	}

}
