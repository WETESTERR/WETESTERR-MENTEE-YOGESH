package Methods;

public class printStars4 {
public static void printStars(int value)
{
	for (int i=1; i<=value; i++)
	{
		for(int j=(value-1); j>=i; j--)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i; k++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	for(int l=1; l<=(value-1); l++)
	{
		for(int m=1; m<=l; m++)
		{
			System.out.print(" ");
		}
		for(int n=(value-1); n>=l; n--)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		printStars(6);
	}

}
