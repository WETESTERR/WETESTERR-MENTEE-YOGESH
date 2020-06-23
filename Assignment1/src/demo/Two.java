package demo;

public class Two {

	
	public Two methodD ()
	{
		System.out.println("I am method D of class two");
		return this;
	}
	
	public Two methodE ()
	{
		System.out.println("I am method E of class two");
		return this;
	}
	
	public Three methodF ()
	{
		System.out.println("I am method F of class two");
		Three three = new Three();
		return three;
	}


}
