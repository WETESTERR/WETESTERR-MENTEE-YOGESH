package org.test.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankSteps {
    WebDriver driver = null;
    @Given("user is on home page of bank")
    public void user_is_on_home_page_of_bank() {
        System.setProperty("webdriver.chrome.driver", "D:\\Work_P\\Learnings\\Selenium\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("http://zero.webappsecurity.com/index.html");
    }

    @When("user title of page is Zero - Personal Banking - Loans - Credit Cards")
    public void user_title_of_page_is_zero_personal_banking_loans_credit_cards () {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Zero - Personal Banking - Loans - Credit Cards",title);

    }
    @Then("user clicks on signin button")
    public void user_clicks_on_signin_button() {
        driver.findElement(By.id("signin_button")).click();
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Zero - Log in", title);
    }
    @Then("user enters login and password")
    public void user_enters_login_and_password() {
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");

    }
    @Then("user click on Sign in button")
    public void user_click_on_sign_in_button() {
        driver.findElement(By.name("submit")).click();
    }
    @Then("user gets his or her account summary")
    public void user_gets_his_or_her_account_summary() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Zero - Account Summary", title);
    }

}
