package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex7List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner values = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the value: ");
		while(true)
		{
			
			int input = Integer.valueOf(values.nextLine());
			
			if(input==-1)
			{
				break;
			}else
			{
				list.add(input);
				
			}
			

			
		}
		for(int index =0; index<list.size(); index++)
		{
		System.out.println(list.get(index));	
		
		}
	}

}
