package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Samsung {
	
	@Test
	public void TVSamsung()
	{
		System.out.println("TV- Samsung");
	}
	
	@Test(groups= {"smoke"})
	public void MobileSamsung()
	{
		System.out.println("SmartPhone- Samsung");
	}
	
	@Test
	public void MobileSamsungone()
	{
		System.out.println("SmartPhone- Samsung1");
	}
	@Test
	public void MobileSamsungtwo()
	{
		System.out.println("SmartPhone- Samsung2");
	}
	
	@Test
	public void WashingMachineSamsung()
	{
		System.out.println("Washing Machine- Samsung");
	}
	
	@AfterTest()
	public void afterBrands()
	{
		System.out.println("I RUN AFTER ALL BRAND TESTS");
	}

}
