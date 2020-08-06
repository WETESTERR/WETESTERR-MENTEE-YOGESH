package Opps;

public class Debt {

	double value;
	double interest;
	
	public Debt(double initialBalance, double initialInterestRate)
	{
		this.value= initialBalance;
		this.interest = initialInterestRate;
	}
	public void printBlanace() {
		System.out.println(value);
	}
	
	public void waitOneYear() {
		
		System.out.println(value*interest);
	}

}
