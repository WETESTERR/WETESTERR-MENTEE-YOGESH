package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex4List {
	static int limit = 2;	
	public static void main(String[] args) {
/*In the exercise template there is a program that reads integers from the user and adds them to a list. 
 * This ends when the user enters 0. The program then prints the first value on the list.
 Modify the program so that instead of the first value, 
 the program prints the sum of the second and third numbers. 
 The program is allowed to malfunction if there are fewer than three entries on the list,
  so you don't need to prepare for such an event at all.*/

			
		
Scanner values = new Scanner(System.in);
ArrayList<Integer> list = new ArrayList<>();

while(true)
{
	System.out.println("Enter the value: ");
	int input = Integer.valueOf(values.nextLine());
	
	if(input==0)
	{
		break;
	}else
	{
		list.add(input);
	}
	
}
if(list.isEmpty())
{
	System.out.println("value entered is zero");
}else if (list.size()<=limit) 
{
	System.out.println(list.get(list.size()-1));
}else
{
int a = list.get(1);
int b = list.get(2);
int sum = a+b;
System.out.println(sum);
}

	}
}


