package Array;

import java.util.Scanner;

public class ex2Array {

	public static void main(String[] args) {
/*The exercise template already has an array containing numbers. 
 * Complete the program so that it asks the user for a number to search in the array. 
 * If the array contains the given number, the program tells the index containing the number. If the array doesn't contain the given number, the program will advise that the number wasn't found.
 */

		
		int[] list= new int[5];
		list[0]= 5;
		list[1]= 3;
		list[2]= 6;
		list[3]= 8;
		list[4]= 9;
		
		Scanner numbers = new Scanner(System.in);
		System.out.println("Search for?");
		int number = Integer.valueOf(numbers.nextLine());
		for(int i=0; i<list.length; i++)
		{
			if(list[i]==number)
			{
				System.out.println(number+ " is at index "+i+".");
			}
			
		}
		System.out.println(number + " not found ");
		
		
	}

}
