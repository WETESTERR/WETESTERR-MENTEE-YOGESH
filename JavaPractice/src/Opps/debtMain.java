package Opps;

public class debtMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Debt mortgage = new Debt(120000.0, 1.01);

mortgage.printBlanace();


mortgage.waitOneYear();


int years = 0;

while(years<20)
{
	mortgage.waitOneYear();
	years = years+1;
}

mortgage.printBlanace();
	}
}
