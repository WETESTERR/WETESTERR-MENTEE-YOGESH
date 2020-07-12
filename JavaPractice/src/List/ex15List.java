package List;

import java.util.ArrayList;

public class ex15List {
public static void printNumbersInRange(ArrayList<Integer>numbers, int lowerLimit, int upperLimit)
{
//for(int i = 0; i<numbers.size(); i++)
	for(Integer first:numbers)
{
int list =first;
	if(list<lowerLimit)
	{
		continue;
		
	}else if(list<=upperLimit)
		
			{
		System.out.println(first);
			}
}



}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> list = new ArrayList<>();
	
	list.add(3);
	list.add(2);
	list.add(6);
	list.add(-1);
	list.add(5);
	list.add(1);
	
	System.out.println("The numbers in the range [0, 5]");
	printNumbersInRange(list, 0, 5);

	System.out.println("The numbers in the range [3, 10]");
	printNumbersInRange(list, 3, 10);

	}

}
