package Array;

import java.util.Scanner;

public class ex1Array {

	public static void main(String[] args) {
/*The exercise template already contains a program, 
that creates an array and prints the values of the array twice. 
Modify the program to do following: After the first printing, 
the program should ask for two indices from the user. 
The values in these two indices should be swapped, 
and in the end the values of the array should be printed once again.*/
		
		
int[] list = new int[5];

Scanner nums = new Scanner(System.in);

System.out.println("Enter Nos:");


	for(int i=0; i<list.length;i++)
	{
		int numbers = Integer.valueOf(nums.nextLine());	
		list[i]=numbers;
	}
	


System.out.println("Give two indices to Swap");
int a = Integer.valueOf(nums.nextLine());
int b = Integer.valueOf(nums.nextLine());

int helper = list[a];
list[a]=list[b];
list[b]=helper;

int index =0;
while(index<list.length)
{
	System.out.println(list[index]);
	index = index+1;
}

	}
}