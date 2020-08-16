package org.example.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature/Test1.feature"},
        glue = {"org.example.steps"},
        tags = "@regression",
        plugin = {
                "html:target/generated-report/Test1",
                "json:target/json/Test1.json",
                "pretty"
        })
public class Test1Runner {
}
