package javaPractice;

//this is function overloading eg
//either argument count should be different or argument data type should be different 
public class functionOverloading {

	
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(b);
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionOverloading fo = new functionOverloading();
		fo.getData(1, 2);
		fo.getData(3);
	}

}
