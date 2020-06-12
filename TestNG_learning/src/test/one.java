package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class one {
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I RUN LAST IN THE SUITE");
	}
	
	@Test
	public void ElectricHeater() 
	{
		System.out.println("Electric Heather- Local brand");
	}
	
	@Test(groups= {"smoke"})
	public void ElectricCooker() 
	{
		System.out.println("Electric Cooker- Prastige Cooker");
	}

	@BeforeTest()
	public void beforeTestEquipment()
	{
		System.out.println("I RUN BEFORE ALL EQUIPMENT TESTS");
	}
	
	@AfterTest()
	public void AfterTestEquipment()
	{
		System.out.println("I RUN AFTER ALL EQUIPMENT TESTS");
	}
}
