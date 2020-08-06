package ThisKeyWord;

public class Second {

	void display()
	{
		System.out.println("Hello");
	}
	
	void show()
	{
		this.display(); 
		//or only can use display(); 
		display();
	}
}
