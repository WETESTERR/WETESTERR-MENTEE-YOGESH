package Opps;

public class Agent {

	String first;
	String last;
	
	public Agent(String j, String b)
	{
		this.first= j;
		this.last = b;
	}
	
	public String toString()
	{
		return "My Name is "  +  this.last +" "+this.first+" " +  this.last;
	
	}
}
