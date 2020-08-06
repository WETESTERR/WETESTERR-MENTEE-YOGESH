package Opps;

public class names {
private String name;
private int age;
private int weight;
private int height;

public names (String name, int age)
{
	this.name = name;
	this.age = age;
	this.weight = 0;
	this.height = 0;
}
public String toString()
{
	return this.name +","+ "age is "+ this.age +" years";
}
}
