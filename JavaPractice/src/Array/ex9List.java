package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex9List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numbers = new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<>();
		System.out.println("Enter Numbers: ");
		
		while(true)
		{
			
			int input = Integer.valueOf(numbers.nextLine());
			
			if(input==-1)
			{
				break;
			}else
			{
				list.add(input);
				
			}
			
				
		}
		int greatest = list.get(0);
		for(int i = 0; i < list.size(); i++) {
		    int number = list.get(i);
		    if (greatest < number) {
		        greatest = number;
		    }
		}

		System.out.println("The greatest number: " + greatest);
	}

}
