package While;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// Problem statement

/*Write a program that reads numbers from the user until the user inputs a number 0. 
After this the program outputs the sum of the numbers. 
The number zero does not need to be added to the sum, even if it does not change the results.*/
	
	int sum = 0;
	Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.println("Give a Number: ");
		int number = Integer.valueOf(scanner.nextLine());
	
		if(number!=2)
		{
			sum=sum+number;
		}else
		{
			break;
		}
	}
	System.out.println(sum);
	}

}
