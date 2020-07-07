package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner names = new Scanner(System.in);
ArrayList<String> list = new ArrayList<>();


while(true)
{
	System.out.println("Enter the Name: ");
	String name = names.nextLine();
	if(name.isEmpty())
	{
		System.out.println("in Total: "+ list.size());
		break;
	}else
	{
		list.add(name);
	}
}
	}

}
