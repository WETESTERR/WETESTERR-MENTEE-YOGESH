package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex13List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner names = new Scanner(System.in);
Scanner find = new Scanner(System.in);
ArrayList<String> list = new ArrayList<>();


while(true)
{
	String name = names.nextLine();
	if(name.isEmpty())
	{
		break;
	}else
	{
		list.add(name);
	}
}

System.out.println("Search for");
String search = find.nextLine();
if(list.contains(search))
{
	System.out.println(search+" was found");;
}else
{
	System.out.println(search+" not found");
}

	}

}
