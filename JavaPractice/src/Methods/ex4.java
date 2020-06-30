package Methods;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Minimum number: ");
int min = Integer.valueOf(scanner.nextLine());
System.out.println("Enter Maximum Number: ");
int max = Integer.valueOf(scanner.nextLine());
printNumbers(min, max);




	}

public static void printNumbers(int min, int max)
{
	while(min<max)
	{
		System.out.println(min);
		min++;
	}
}

}
