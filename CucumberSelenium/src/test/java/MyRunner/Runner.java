package MyRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features/LoginFailed.feature" +
                "Features/Login.feature"} ,
        glue = {"Steps"}

)

public class Runner {
}



