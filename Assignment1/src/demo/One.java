package demo;

public class One {

	
	public One methodA ()
	{
		System.out.println("I am method A of class one");
		return this;
	}
	
	public One methodB ()
	{
		System.out.println("I am method B of class one");
		return new One();
	}
	
	public Two methodC ()
	{
		System.out.println("I am method C of class one");
		Two two = new Two();
		return two;
	}

}
