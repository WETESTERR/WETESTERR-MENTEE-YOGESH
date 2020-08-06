package Opps;

import java.util.Scanner;

public class filmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Film chipmunks = new Film("Alvin and Chipmunks", 5);
				
		System.out.println("How old are You?");
		
		Scanner value = new Scanner(System.in);
		int age = Integer.valueOf(value.nextLine());
		
		if(age>=chipmunks.ageRating)
		{
			System.out.println("You May watch "+ chipmunks.name);
		}else
		{
			System.out.println("You Cant watch "+ chipmunks.name);
		}
	}

}
