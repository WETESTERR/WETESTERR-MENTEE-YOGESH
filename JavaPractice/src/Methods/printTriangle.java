package Methods;

public class printTriangle {
public static void printTriangle(int size)
{
	for (int i =1; i<=size; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printTriangle(5);
	}

}
