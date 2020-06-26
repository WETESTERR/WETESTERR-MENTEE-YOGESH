package While;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Shall we carry on?");
			String input = scanner.nextLine();
			if(input.equals("no"))
			{
				
				break;
			}
		
		}
		System.out.println("I am exiting");
	}

}
