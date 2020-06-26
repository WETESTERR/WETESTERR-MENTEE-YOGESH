package While;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		/* Write a program that reads values from the user until they input a 0. 
		After this, the program prints the total number of inputted values. 
		The zero that's used to exit the loop should not be included 
		in the total number count.*/
int total = 0;
Scanner scanner = new Scanner(System.in);

while(true) {
	System.out.println("Give a number: ");
	int number = Integer.valueOf(scanner.nextLine());
	if(number==0) {
		break;
	}
	if(number!=0)
	{
		total = total+1;
	}

}
System.out.println("Total numbers entered: "+total);
	}

}
