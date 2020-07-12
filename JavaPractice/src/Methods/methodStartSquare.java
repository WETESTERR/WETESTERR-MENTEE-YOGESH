package Methods;

public class methodStartSquare {
public static void printSquare(int width, int height)
{
	for (int i=1; i<=height; i++)
	{
		for(int j=1; j<=width; j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printSquare(5,5);
System.out.println("");
printSquare(4,4);
System.out.println("");
printSquare(17,3);
	}

}
