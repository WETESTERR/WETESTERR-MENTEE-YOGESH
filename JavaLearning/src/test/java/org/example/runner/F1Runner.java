package org.example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature/f1.feature"},
        glue = {"src.test.java.org.example.steps"},
        strict = true
)
public class F1Runner {
}
