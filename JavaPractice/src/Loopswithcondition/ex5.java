package Loopswithcondition;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum = 0;

Scanner scanner = new Scanner (System.in);
System.out.println("First number?");
int first = Integer.valueOf(scanner.nextLine());
System.out.println("Last number?");
int last = Integer.valueOf(scanner.nextLine());
int i = first;
while(i<=last)
{
	sum = sum+i;
}
System.out.println(sum);
	}

}
