package Practice;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give the first number: ");
		int one = Integer.valueOf(scanner.nextLine());
		System.out.println("Give the second number: ");
		int two = Integer.valueOf(scanner.nextLine());
		System.out.println("Give the third number: ");
		int three = Integer.valueOf(scanner.nextLine());
		
		System.out.println(one+"*"+two+"*"+three+" = "+(one*two*three));
		System.out.println("The average is "+(double)((one+two+three)/3));
		
	}

}
