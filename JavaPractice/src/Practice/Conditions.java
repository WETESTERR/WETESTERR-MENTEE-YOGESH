package Practice;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("give speed:");
		
		Scanner scanner = new Scanner(System.in);
		
		int speed = Integer.valueOf(scanner.nextLine());
		
		if (speed>120)
		{
			System.out.println("speeding ticket!");
		}
		else
		{
			System.out.println("in Limit!");
		}
	}
	

}
