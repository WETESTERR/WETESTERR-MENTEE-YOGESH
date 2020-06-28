package Loopswithcondition;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		//Problem statement
/*Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.*/

		int i = 1;
		int add = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = Integer.valueOf(scanner.nextLine());
		
	for(i=1; i<=N;i++)
	{
		add = add+i;
		
	}
	
	System.out.println(add);
	}

}
