package Methods;

public class printStars1 {
public static void printStars(int value)
{
	for(int i=1; i<=value; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	for(int i=1; i<=value; i++)
	{
		for(int j=(value-1); j>=i; j--)
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
