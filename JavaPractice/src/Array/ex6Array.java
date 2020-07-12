package Array;

import java.util.Scanner;

public class ex6Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter username: ");
			String username = input.nextLine();
			if(username.equals("alex"))
			{
				System.out.println("Enter passowrd");
				String password = input.nextLine();
				if(password.equals("sunshine"))
				{
					System.out.println("You have successfully logged in!");
				}else
				{
					System.out.println("incorrect");
				}
				break;
			}
		}
	}

}
