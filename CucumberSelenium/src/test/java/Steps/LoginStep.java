package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {
    WebDriver driver;
    @Given("I open browser and navigate to BC-Riboon site")
    public void open_browser_navigate_to_homepage(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/Selenium_Cucumber_JarFile/chromedriver.exe");
        driver.manage().window().maximize();
        driver = new ChromeDriver();
        driver.get("http://52.24.54.200/ecard-webapp/login");
        System.out.println("This step open browser");
    }
    @And("I input valid account and password")
    public void input_valid_data () {
        WebElement account = driver.findElement(By.className(""));
        account.sendKeys();
        WebElement password = driver.findElement(By.className());
        password.sendKeys();
        System.out.println("This step input account and password");
    }
    @When("I click Login button")
    public void click_button () {
        WebElement lgbButton = driver.findElement();
        lgbButton.click();
        System.out.println("This step click Login button");
    }
    @Then("Login page successfully")
    public void result () {
        System.out.println("This step open Homepage");
        driver.get("");
    }
}
