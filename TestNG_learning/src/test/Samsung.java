package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Samsung {
	
	@Test(enabled=false)
	public void TVSamsung()
	{
		System.out.println("TV- Samsung");
	}
	
	@Test(groups= {"smoke"})
	public void MobileSamsung()
	{
		System.out.println("SmartPhone- Samsung");
	}
	
	@Test(dependsOnMethods={"MobileSamsungtwo"})
	public void MobileSamsungone()
	{
		System.out.println("SmartPhone- Samsung1");
	}
	@Test
	public void MobileSamsungtwo()
	{
		System.out.println("SmartPhone- Samsung2");
	}
	
	@Parameters({"URL"})
	@Test
	public void WashingMachineSamsung(String urlname)
	{
		System.out.println("Washing Machine- Samsung");
		System.out.println(urlname);
	}
	
	@AfterTest()
	public void afterBrands()
	{
		System.out.println("I RUN AFTER ALL BRAND TESTS");
	}


}
