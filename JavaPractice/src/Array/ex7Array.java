package Array;

import java.util.Scanner;

public class ex7Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    
	    
        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);

            }
            if(text.equals("")){
            	String empty = scanner.nextLine();
                System.out.println(empty);
                break;
            }
        }

	}

}
