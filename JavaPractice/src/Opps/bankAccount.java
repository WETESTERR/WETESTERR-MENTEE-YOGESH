package Opps;

public class bankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account Matthew = new Account();
Account my = new Account();
Matthew.Account(3000.0);
System.out.println("Matthews account's balance is");
System.out.println(Matthew.getBalance());
my.Account(0.0);
System.out.println("My account's balance is");
System.out.println(my.getBalance());
Matthew.withdraw(100.0);
my.deposite(100.0);
System.out.println("Matthews account's new balance is");
System.out.println(Matthew.getBalance());

System.out.println("My account's new balance is");
System.out.println(my.getBalance());

	}

}
