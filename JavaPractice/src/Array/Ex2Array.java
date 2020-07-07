package Array;

import java.util.ArrayList;

public class Ex2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<>();
		
		names.add("Tom");
		names.add("Emma");
		names.add("Alex");
		names.add("Mary");
		
		int value = names.size();
		System.out.println("In Total: "+value);
		
		int index = 0;
		
		while(index<names.size()) {
			System.out.println(names.get(index));
			index = index+1;
		}
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		
		int ind = nums.size()-1;
		while(ind>=0) {
			int numb = nums.get(ind);
			System.out.println(numb);
			ind = ind-1;
		}
		
		
	}

}
