package Methods;

public class printStars2 {
public static void printStars(int value)
{
	for(int i =1; i<=value; i++)
	{
		for(int j=3; j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		printStars(4);
		
	}

}
