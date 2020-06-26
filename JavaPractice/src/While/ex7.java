package While;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a program that asks the user for input until the user inputs 0. 
 * After this the program prints the amount of numbers inputed and the sum of the numbers. 
 * The number zero does not need to be added to the sum, 
 * but adding it does not change the results. */
		
		
		
		double numbers = 0;
		double sum = 0;
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Give a Number: ");
			int number = Integer.valueOf(scanner.nextLine());
			if(number==0)
			{
				break;
			}
			if(number!=0)
			{
				numbers = numbers+1;
				sum = number+sum;
				
			}
		}
		double avg = sum/numbers;
		System.out.println("Average of the numbers: "+avg);
		
		}

	}
	

	
