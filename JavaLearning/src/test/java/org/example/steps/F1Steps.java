package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F1Steps {
    @Given("This is a given step")
    public void thisIsAGivenStep() {
        System.out.println("Hello");
    }

    @When("something happens")
    public void somethingHappens() {
        System.out.println("Hello");
    }

    @Then("assert for verification")
    public void assertForVerification() {
        System.out.println("Hello");
    }
}
