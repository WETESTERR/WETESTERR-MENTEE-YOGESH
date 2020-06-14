package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters ({"URL"})
	@Test
	public void tryme(String urlname)
	{
		System.out.println(urlname);
	}
	
	@Test(dataProvider="dProvider")
	public void Dp(String username, String password)
	{
		System.out.println("Login Details");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] dProvider()
	{
		//prime user details--1st customer
		//General user details-2nd customer
		//new user details-- 3rd customer
		Object [][]data=new Object[3][2];
		data [0][0]="primeuser";
		data [0][1]="primepass";
		data [1][0]="generaluser";
		data [1][1]="generalpass";
		data [2][0]="newuser";
		data [2][1]="newpass";
		return data;
		
		
		
	}

}
