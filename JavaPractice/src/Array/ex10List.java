package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex10List {

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
	
		Scanner number = new Scanner(System.in);
		System.out.println("Search for number: ");
		int num = Integer.valueOf(number.nextLine());
		for(int i = 0; i<list.size(); i++)
		{
		if (list.get(i)==num)
		{
			System.out.println(num + " is at index: "+i);
			
		}
		}
	}

}
