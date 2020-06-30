package Methods;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first Number: ");
int first = Integer.valueOf(scanner.nextLine());
System.out.println("Enter Second Number: ");
int second = Integer.valueOf(scanner.nextLine());

int summation = sum(first, second);
System.out.println("The Sum is: "+summation);

		
		
		
	}


public static int sum(int first, int second)
{
	return first + second;
}
}
