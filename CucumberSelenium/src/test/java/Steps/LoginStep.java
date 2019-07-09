package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStep {
    WebDriver driver;

    @Given("I open browser and navigate to BC-Riboon site")
    public void open_browser_navigate_to_homepage (){
        System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/Selenium_Cucumber_JarFile/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://52.24.54.200/ecard-webapp/login");
        System.out.println("This step open browser");
    }

    @Given("I input valid account and password")
    public void input_valid_data () {
        WebElement account = driver.findElement(By.name("j_username"));
        account.sendKeys("qa.qccheck+20181227@gmail.com");
        WebElement password = driver.findElement(By.name("j_password"));
        password.sendKeys("testtest1234");System.out.println("This step input account and password");
    }

    @Given("I input User Name as \"([^\"]*)\" and Password as \"([^\"]*)\"")
    public void input_invalid_data (){
        WebElement account = driver.findElement(By.name("j_username"));
        account.sendKeys();
        WebElement password = driver.findElement(By.name("j_password"));
        password.sendKeys();
    }

    @When("I click Login button")
    public void click_button () {
        WebElement lgbButton = driver.findElement(By.id("btnLogin"));
        lgbButton.click();
        System.out.println("This step click Login button");
    }

    @Then("Login page successfully")
    public void result () {
        System.out.println("This step open Homepage");
        driver.get("http://52.24.54.200/ecard-webapp/manager/home");
        driver.close();
    }

    @Then("Site show content as \"([^\"]*)\"")
    public void result_failed () {
        System.out.println("This step dont open Homepage");
        driver.get("http://52.24.54.200/ecard-webapp/login?error=true");
        WebElement message = driver.findElement(By.className("alert alert-danger alert-dismissable"));
        message.getText();
        driver.close();
    }
}
