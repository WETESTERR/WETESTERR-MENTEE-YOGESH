package org.test.config;


import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    WebDriver driver = null;
    @Before
    public void beforeScenario(Scenario scenario){
        System.setProperty("webdriver.chrome.driver", "D:\\Work_P\\Learnings\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
