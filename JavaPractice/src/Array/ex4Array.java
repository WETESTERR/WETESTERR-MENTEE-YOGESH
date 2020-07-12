package Array;

public class ex4Array {
	public static int sumOfNumbersInArray(int[] array)
	{
		int index = 0;
		for(int sum:array)
		
		{
			
			index = index+sum;
		}
		
return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {5, 1, 3, 4, 2};
		System.out.println(numbers);
		System.out.println(sumOfNumbersInArray(numbers));
	}

}
