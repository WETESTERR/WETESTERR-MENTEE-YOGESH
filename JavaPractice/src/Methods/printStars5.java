package Methods;

public class printStars5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=4; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			for(int l=2; l<=i; l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i=1; i<=2; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=3; k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
