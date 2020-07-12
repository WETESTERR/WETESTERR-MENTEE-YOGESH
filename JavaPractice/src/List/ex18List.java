package List;

import java.util.ArrayList;

public class ex18List {
public static void removeLast(ArrayList<String>Strings)
{
	
	if(Strings.size() ==0)
	{
		return;
	}
	Strings.remove(Strings.size()-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strings = new ArrayList<>();

		strings.add("First");
		strings.add("Second");
		strings.add("Third");

		System.out.println(strings);

		removeLast(strings);
		removeLast(strings);

		System.out.println(strings);
	}

}
