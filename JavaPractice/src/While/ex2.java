package While;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*enter number
if number<0
user is unstable
continue
if number==0
exit
if number>0
number*number*/
		//Problem statment as follows
/*Write a program that asks the user for numbers. 
If the number is negative (smaller than zero), the program prints for user "Unsuitable number" and asks the user for a new number. 
If the number is zero, the program exits the loop. If the number is positive, 
the program prints the number to the power of two.*/

		Scanner scanner = new Scanner(System.in);
while(true) {
	System.out.println("Enter number: ");
	int number = Integer.valueOf(scanner.nextLine());
	if(number<0)
	{
		System.out.println("Unsuitable number");
		continue;
		
	}
	if(number==0)
	{
		break;
	}

	System.out.println(number*number);
}
}
}