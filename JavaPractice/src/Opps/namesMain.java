package Opps;

import java.util.ArrayList;
import java.util.Scanner;

public class namesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
ArrayList<names> persons = new ArrayList<>();

while(true) {
	
	System.out.println("Enter the name, Empty will end: ");
	String name = scanner.nextLine();
	if(name.isEmpty())
	{
		break;
	}
	System.out.println("Enter the age of the person"+ name+": ");
	
	int age = Integer.valueOf(scanner.nextLine());
	
	persons.add(new names(name, age));
}


System.out.println("Total number of persons: "+persons.size());
System.out.println("Persons: ");

for(names person:persons)
{
	System.out.println(person);
}
	}

}
