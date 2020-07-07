package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3List {

	static int indexOfItemToBePrinted = 2;
	 
    public static void main(String[] args){
        Scanner names = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
 
        while(true)
        {
            System.out.println("input value: ");
            String input = names.nextLine();
            if(input.isEmpty())
            {
                break;
            }else{
                list.add(input);
            }
        }
 
        if(list.isEmpty()){
            System.out.println("List is empty!!");
        }else if((list.size() < (indexOfItemToBePrinted + 1))){
            //print the last element, if there are fewer than three entries on the list.
            System.out.println(list.get(list.size() -1));
        }else{
            System.out.println(list.get(2));
        }
    }
}
