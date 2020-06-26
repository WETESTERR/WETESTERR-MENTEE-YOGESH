package While;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// Problem statment
		
		/*Write a program, according to the preceding example, 
		that asks the user to input values until they input the value 4.*/
		
Scanner scanner = new Scanner(System.in);

while(true)
{
	System.out.println("Give a number:");
	int number = Integer.valueOf(scanner.nextLine());
	if(number==4)
	{
		break;
	}
	
}
System.out.println("you have entered 4");
	}

	
}
