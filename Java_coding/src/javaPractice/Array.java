package javaPractice;

public class Array {

	public static void main(String[] args) {
		
		int a;
		a=4;
		// A container which stores multiple values of same data type

	int b[] = new int[5];//declares array and allocate memory for  5 int value in b
	b[0] = 2;
	b[1] = 4;
	b[2] = 6;
	b[3] = 8;
	b[4] = 10;
	
	
	int c[]= {1,2,3,4,5,6,7,8,9};
	for (int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	
	for (int i=0;i<c.length;i++)
	{
		System.out.println(c[i]);
	}
	}

}
