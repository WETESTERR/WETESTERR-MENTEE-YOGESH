package List;

import java.util.ArrayList;
import java.util.Scanner;

public class ex12List {

	public static void main(String[] args) {
//The exercise template contains a base that reads numbers from the user and adds them to a list. 
//Reading is stopped once the user enters the number -1.
//	Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.
	//avg of sum of all numbers
		
		Scanner numbers = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the Numbers to List: ");
		
		while(true)
		{
			int number = Integer.valueOf(numbers.nextLine());
			if(number == -1)
			{
				break;
			}else
			{
				list.add(number);
			}
		

		}
		double sum = 0;
		for(Integer n:list)
	//	for(int i=0; i<list.size(); i++)
		{
			
			sum = sum+n;
			
		}
		double avg = sum/list.size();
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
	}

}
