package Array;

import java.util.ArrayList;

public class ex14List {
public static void print(ArrayList<String>list)
{
	for(String value:list)
	{
		System.out.println(value);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> strings = new ArrayList<>();
	strings.add("Vihaan");
	strings.add("Yogesh");
	strings.add("More");
	
	print(strings);
		

	}

}
