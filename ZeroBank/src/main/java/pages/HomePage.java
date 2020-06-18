package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver = new WebDriver();
	//identify the element
	String myMoneyMap = "xyz";

	public void getHomePage()
	{
		
		System.out.println("This is My Home Page");
	}
	
	public void clickOnMyMoneyMap()
	{
		
		WebElement moneyMap = driver.findElement(By.id(myMoneyMap));
	}
}
