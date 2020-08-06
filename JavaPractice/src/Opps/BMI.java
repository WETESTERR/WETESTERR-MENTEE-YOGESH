package Opps;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonHealth Yogesh = new PersonHealth("Yogesh");
		PersonHealth Preeti = new PersonHealth("Preeti");
		
		Yogesh.setHeight(186);
		Yogesh.setWeight(86);
		
		Preeti.setHeight(175);
		Preeti.setWeight(64);
		
		
		System.out.println(Yogesh.getName()+ ", body mass index is " + Yogesh.bodyMassIndex());
	}

}
