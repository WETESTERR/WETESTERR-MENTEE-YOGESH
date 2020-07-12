package Array;

import java.util.Scanner;

public class ex5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
	
		while(true)
		{
			System.out.println("Give a string: ");
			String string = input.nextLine();
		if(string.equals("true"))
		{
			
		System.out.println("You got it right");
		break;
			
		}else
		{
			System.out.println("try again");
		
		}
		
	}

}
}
