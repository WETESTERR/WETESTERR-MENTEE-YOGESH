package Methods;

public class printStars3 {
public static void printStars(int value)
{
	for(int i=1; i<=value; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(" ");
		}
		for(int k=value; k>=i; k--)
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
