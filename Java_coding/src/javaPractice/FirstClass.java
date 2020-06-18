package javaPractice;

public class FirstClass {

	
	public void FirstMethod()
	{
	System.out.println("I am firstmethod of FirstClass");	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" I am in First Class");
		FirstClass firstclass = new FirstClass();
		firstclass.FirstMethod();
		SecondClass secondclass = new SecondClass();
		secondclass.SecondMethod();
		
		String a = "JavaPractice";
		System.out.println(a.concat(" on Eclipse"));
		
		System.out.println(a.indexOf("P"));
	System.out.println(a.substring(4, 8));
	System.out.println(a.charAt(3));
		
		
	}

}
