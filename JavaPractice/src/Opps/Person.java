package Opps;

public class Person {
	private String name;
	private int age;
	
	public Person(String initialName)
	{
		this.age = 29;
		this.name = initialName;
	}
	
	public void printPerson() {
		System.out.println(this.name + " age is " + age +" years old");
	}
	
	public void growOlder() {
		if(this.age<30)
		{
		this.age = this.age+2;
		}
		System.out.println(this.name + " become " + age +" years old now");
	}

}
