package Opps;

public class songMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Song garden = new Song("In the End", 109012);
		
		String name = garden.name;
		int lenght = garden.lenght;
		
		System.out.println("The song "+name+ " has a lenght "+ lenght +" seconds");
	}

}
