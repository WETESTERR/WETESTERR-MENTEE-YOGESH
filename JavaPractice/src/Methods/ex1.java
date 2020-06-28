package Methods;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Times:");
		int method = Integer.valueOf(scanner.nextLine());
		
		while(i<method)
		{
			printText();
			i++;
		}
	
	}

	public static void printText()
	{
		System.out.println("in a hole in the ground there lived a method");
	}
}
