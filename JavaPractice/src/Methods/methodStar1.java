package Methods;

public class methodStar1 {
	public static void printStars(int number) {

		for(int i = 0; i<number; i++)
		{
		System.out.print("*");

		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		printStars(5);
		printStars(4);
		printStars(3);
		printStars(2);
		printStars(1);
	}

}
