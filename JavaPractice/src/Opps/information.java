package Opps;

import java.util.ArrayList;
import java.util.Scanner;

public class information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
ArrayList<PersonalInformationCollection>persons = new ArrayList<>();

while(true)
{
	System.out.println("First Name: ");
	String name = scanner.nextLine();
	
	if(name.isEmpty())
	{
		break;
	}
	System.out.println("Enter the Last Name: ");
	String last = scanner.nextLine();
	System.out.println("Identification number: ");
	int id = Integer.valueOf( scanner.nextLine());
	
	
	persons.add(new PersonalInformationCollection(name, last, id));
}

for(PersonalInformationCollection data:persons)
{
	
	System.out.println(data);
}
	}

}
