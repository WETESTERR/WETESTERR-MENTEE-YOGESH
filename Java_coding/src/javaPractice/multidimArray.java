package javaPractice;

//printing min number of array matrix 
//printing the max num from min number column
public class multidimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int abc[][]= new int [3][3];
	abc[0][0] = 2;
	abc[0][1] = 4;
	abc[0][2] = 5;
	abc[1][0] = 3;
	abc[1][1] = 0;
	abc[1][2] = 7;
	abc[2][0] = 1;
	abc[2][1] = 2;
	abc[2][2] = 9;
	
	int min =abc[0][0];
	int mincolumn = 0;
	

	
	for (int i=0;i<3;i++)
	{
		for( int j=0;j<3;j++)
		{
			if(abc[i][j]<min)
			{
				min=abc[i][j];
				mincolumn=j; // column of min number
			
			}
	
		}
	}
	int max= abc[0][mincolumn];
	int k = 0;
	while(k<3)
	{
		if(abc[k][mincolumn]>max)
		{
			max=abc[k][mincolumn];
		}
		k++;
	}
	System.out.println(min);
	System.out.println(max);
	
	
	}

}
