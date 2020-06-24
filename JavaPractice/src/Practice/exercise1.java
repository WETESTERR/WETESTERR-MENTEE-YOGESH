package Practice;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//absolute value
		int four = Integer.valueOf(scanner.nextLine());
		if(four<0)
		{
			System.out.println(four*-1);
		}else
		{
			System.out.println(four);
		}
		//comparing numbers
		int one = Integer.valueOf(scanner.nextLine());
		int two = Integer.valueOf(scanner.nextLine());
		
		if(one>two)
		{
			System.out.println(one+" is greater than " +two);
		}else if (one<two)
		{
			System.out.println(one+ " is smaller than " +two);
		}else
		{
			System.out.println(one+ " is equal to "+ two);
		}
		
		int sq = Integer.valueOf(scanner.nextLine());
		System.out.println(sq*sq);
		

	}
	}


