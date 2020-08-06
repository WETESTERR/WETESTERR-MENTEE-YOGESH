package Opps;

public class Account {
	
	private double balance;
	
//balance
	public void Account(double initial) {
	this.balance = initial;
}
	
	//withdraw
	public void withdraw(double amount)
	{
		balance = balance-amount;
	}
	
	//deposite
	public void deposite(double amount)
	{
		balance = balance+amount;
	}
	
	//balance
	public double getBalance() {
		return balance;
	}


}
