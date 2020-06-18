package javaPractice;

public class ChildInheritance extends ParentInheritance {

	public void doorDesign()
	{
		System.out.println("New door design code");
	}
	public void engine()
	{
		System.out.println("This is new Gen engine Code");
	}
	
	public void color()
	{
		System.out.println(color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildInheritance CI =new ChildInheritance();
CI.Brakes();
CI.color();
CI.Gear();
CI.engine();
CI.SeatingArrangement();
CI.doorDesign();//this is overrides the child object over parent object of same method name
	}

}
