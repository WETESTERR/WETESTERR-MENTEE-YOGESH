package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LG {
@BeforeClass
public void bclass()
{
	System.out.println("LETS START EXECUTING TEST CASES FROM LG BRAND");
}

@AfterClass
public void Aclass()
{
	System.out.println("END OF  EXECUTION OF TEST CASES FROM LG BRAND");
}

	@Test(groups= {"smoke"})
	public void TVLG()
	{
		System.out.println("TV- LG");
	}

	@Test
	public void MobileLG()
	{
		System.out.println("SmartPhone- LG");
	
	}
	
	@Test
	public void WashingMachineLG()
	{
		System.out.println("Washing Machine- LG");
	}
	
	@BeforeTest
	public void BeforeBarnd()
	{
		System.out.println("I RUN BEFORE ALL BRAND TEST");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I RUN LAST IN THE SUITE");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I RUN FIRST IN SUITE");
	}
}
