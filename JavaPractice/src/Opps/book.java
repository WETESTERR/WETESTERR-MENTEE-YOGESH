package Opps;

import java.util.ArrayList;
import java.util.Scanner;

public class book {

	public static void main(String[] args) {
	Scanner names = new Scanner(System.in);
	ArrayList<booksInfo> book = new ArrayList<>();
	
	while(true)
	{
		System.out.println("Title: ");
		String name = names.nextLine();
		if(name.isEmpty())
		{
			break;
		}
		
		System.out.println("Pages: ");
		int page = Integer.valueOf(names.nextLine());
		System.out.println("Publication Year: ");
		int pub = Integer.valueOf(names.nextLine());
		
		
	book.add(new booksInfo(name, page, pub));
	
	}
	System.out.println("what to print: ");
	String namee = names.nextLine();
	while(true)
	{
		if(namee.equals("names"))
		{
	for(booksInfo data:book)
	{
		System.out.println(data.tit());
		
	}

	}
		else
		{
			for(booksInfo data:book)
			{
				System.out.println(data);
				
			}
		}
		break;
	}

}
}