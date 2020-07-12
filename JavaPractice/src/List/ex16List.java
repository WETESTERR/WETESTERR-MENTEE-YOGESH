package List;

import java.util.ArrayList;

public class ex16List {
	public static int sum(ArrayList<Integer> numbers)
	{
		int add = 0;
		for (Integer sum:numbers)
			
		{
			
			add = add+sum;
			
		}
		
		return add;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(3);
numbers.add(2);
numbers.add(6);
numbers.add(-1);
System.out.println(sum(numbers));

numbers.add(5);
numbers.add(1);
System.out.println(sum(numbers));



	}
	
}
