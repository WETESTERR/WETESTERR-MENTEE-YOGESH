package Opps;

public class DecreasingCounter {

	int value;
	
	public DecreasingCounter(int initialValue)
	{
		this.value=initialValue;
	}
	
	public void printValue()
	{
		System.out.println("value: " + this.value);
	}
	
	public void decrement()
	{
		this.value=this.value-1;
	}
	
	public void reset() {
		this.value= 0;
	}
}
