package Practice;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 9000;
		double fl = 0.1;
		String name = "Zetor";
		
		System.out.println("Chicken:");
		System.out.println(number);
		System.out.println("Bacon (kg):");
		System.out.println(fl);
		System.out.println("Tractor:");
		System.out.println(name);
		System.out.println();
		System.out.println("And finally, a summary:");
		System.out.println(number);
		System.out.println(fl);
		System.out.println(name);
		
		number = 500;
		System.out.println(number);


		//Reading String
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give a string:");
		String string = scanner.nextLine();
		
		//Reading int
		System.out.println("Give an integer:");
		int num = Integer.valueOf(scanner.nextLine());
		
		//Reading double
		System.out.println("Give a double:");
		double dob = Double.valueOf(scanner.nextLine());
		
		//Reading Boolean
		System.out.println("Give a boolean:");
		boolean bo = Boolean.valueOf(scanner.hasNextLine());
		
		System.out.println("You gave the String "+string);
		System.out.println("You gave the integer "+num);
		System.out.println("You gave the double "+dob);
		System.out.println("You gave the boolean " +bo);
		
		
		
		
	}

}
