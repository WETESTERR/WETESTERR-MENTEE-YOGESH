package Array;

import java.util.Scanner;

public class ex8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 while (true) {
	            String text = scanner.nextLine();
	            String[] pieces = text.split(" ");
	            if(text.equals("")){
	            	String empty = scanner.nextLine();
	                System.out.println(empty);
	                break;
	            }
	          
	            	System.out.println(pieces[0]);
	           

	        }
}
}