package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@SmokeTest",
        glue = "stepDefinitions",
        plugin = {"pretty","html:target/default-cucumber-reports","json:target/json-reports/cucumber.json"}
)
public class Runner {
}
