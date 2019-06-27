package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Admin//IdeaProjects//CucumberSelenium//Features//login.feature",

        glue = "LoginStep")
public class HomePageRunner {

}
