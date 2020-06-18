package javaPractice;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		if(5<2)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("failure");
		}
		
		
		for(int i=0;i<10; i=i+2)
		{
			if(i==8)
			{
				System.out.println("I am 8");
			}
			else
			{
				System.out.println("Yessss i am not 8");
			}
		}
		
		//Print 1 to 10
		for(int i=1;i<=10;i++) //for (initialization;condition;increment)
		{
			System.out.println(i);
		}
	}

}
