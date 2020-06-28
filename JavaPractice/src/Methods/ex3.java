package Methods;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		division(2,10);


	}

	
	public static void division (int numerator, int denominator)
	{
		
		for(int i=numerator; i<=denominator; i++)
		{
			if(i%3==0)
			{
		System.out.println(i);
			}
			}
	}
}
