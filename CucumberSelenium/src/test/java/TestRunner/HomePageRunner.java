package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/Features/login.feature"},
        glue = {"StepDefen"}

)
public class HomePageRunner {

}
