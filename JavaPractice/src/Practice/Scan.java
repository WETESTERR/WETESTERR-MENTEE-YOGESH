package Practice;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("I will tell you a story, but I need some information first.");
		String bob = scanner.nextLine();
		System.out.println("What is their job?");
		String builder = scanner.nextLine();
		System.out.println("Here is the story: ");
		System.out.println("Once upon a time there was "+ bob+", who was " +builder);
		System.out.println("On the way to work, "+ bob+" reflected on life.");	
		System.out.println("Perhaps "+ bob +" will not be "+ builder +" forever.");
	}

}
