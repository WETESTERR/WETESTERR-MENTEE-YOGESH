package Opps;

import java.util.ArrayList;
import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
ArrayList<word>words = new ArrayList<>();

while(true)
{
	String chars = scanner.nextLine();
	if(chars.equals("this"))
	{
		System.out.println(words.size());
		break;
	}
	words.add(new word(chars));
}

	}

}
