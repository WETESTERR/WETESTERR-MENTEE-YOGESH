package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Apple {

	@BeforeMethod
	public void bmethod()
	{
		System.out.println("TEST CASE START");
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("TEST CASE ENDS");
	}
	@Test
	public void TVApple()
	{
		System.out.println("TV- Apple");
	}
	
	@Test
	public void MobileApple()
	{
		System.out.println("SmartPhone- Apple");
	}
	
	@Test(groups= {"smoke"})
	public void WashingMachineApple()
	{
		System.out.println("Washing Machine- Apple");
	}
}
