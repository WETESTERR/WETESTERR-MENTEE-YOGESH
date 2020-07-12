package List;

import java.util.ArrayList;
import java.util.Scanner;

public class ex11List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner enter = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the Numbers: ");
		
		
		while(true)
		{
			int numbers = Integer.valueOf(enter.nextLine());
			if(numbers==9999)
			{
				break;
			}else
			{
				list.add(numbers);
			}
		}
	
		int smallest = list.get(0);
		for(int i=0; i<list.size(); i++)
		{
			int number = list.get(i);
			if(smallest>number)
			{
				smallest = number;
			}
		}
		System.out.println("Smallest number is : "+ smallest);
		for(int i = 0; i<list.size(); i++)
		{
			if(list.get(i)==smallest)
			{
				System.out.println("found at index: "+ i);
			}
		}
		

		
		
	}

}
