package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex8List {

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
		Scanner from = new Scanner(System.in);
		Scanner to = new Scanner(System.in);
		System.out.println("from where? ");
		int start = Integer.valueOf(from.nextLine());
		System.out.println("to Where? ");
	
		int end = Integer.valueOf(to.nextLine());
		
		
		for(int value=start; value<=end; value++)
		{
			System.out.println(list.get(value));
		}
		
	}

}
