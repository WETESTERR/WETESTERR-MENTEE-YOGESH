package List;

import java.util.ArrayList;
import java.util.Scanner;

public class ex6List {

	public static void main(String[] args) {
	/* In the exercise template there is a program that reads inputs from the user and adds them to a list. 
	Reading is stopped once the user enters an empty string.
	Modify the program to print both the first and the last values after the reading ends. 
	You may suppose that at least two values are read into the list.*/
	
	
Scanner names = new Scanner(System.in);

ArrayList<String> List = new ArrayList<>();

while(true)
{
	System.out.println("Enter Name: ");
	String name = names.nextLine();
	
	if(name.isEmpty())
	{
		break;
	}else
	{
		List.add(name);
	}
	
}
System.out.println(List.get(0));
System.out.println(List.get(List.size()-1));
	}

}
