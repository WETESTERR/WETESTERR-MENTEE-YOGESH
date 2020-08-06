package Opps;

public class Animal {
	
	String color;
	int age;

	public void intObj(String c, int a)
	{
		color =c;
		age = a;
	}
	public void display()
	{
		System.out.println(color +" "+ age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal bruno = new Animal();
		bruno.intObj("black", 10);
		bruno.display();
	}

}
