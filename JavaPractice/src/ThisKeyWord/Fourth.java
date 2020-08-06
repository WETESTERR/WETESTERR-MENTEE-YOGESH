package ThisKeyWord;

public class Fourth {

	void m1(Fourth f) 
	{
		System.out.println("i am M1");
	}
	
	void m2()
	{
		m1(this);
	}
}
