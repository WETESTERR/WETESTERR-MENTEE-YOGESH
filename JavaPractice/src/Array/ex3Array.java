package Array;

public class ex3Array {
public static void listElements(int[] integerArray)
{
	System.out.println("The Elements of Array are: ");
	int index = 0;
	while(index<integerArray.length)
	{
		int number = integerArray[index];
		System.out.print(number + ", ");
		index = index+1;
	}
	
	System.out.print("");
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[] numbers = new int[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;

		listElements(numbers);
	}

}
