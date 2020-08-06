package Opps;

public class PersonHealth {
	
	private String name;
	private int age;
	private int weight;
	private int height;
	
	public PersonHealth(String initialName)
	{
		this.name = initialName;
		this.age = 0;
		this.weight = 0;
		this.height = 0;
	}
	
public void setHeight(int newHeight)
{
	this.height = newHeight;
}
public void setWeight(int newWeight)
{
	this.weight = newWeight;
}
public double bodyMassIndex() {
    double heigthPerHundred = this.height / 100.0;
    return this.weight / (heigthPerHundred * heigthPerHundred);
}
public String getName()
{
	return this.name;
}
}
