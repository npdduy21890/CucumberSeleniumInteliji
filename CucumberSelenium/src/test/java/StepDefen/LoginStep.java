package StepDefen;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class LoginStep {
    WebDriver driver;

 @Given ("Open browser and navigate to BC-Ribbon")
    public void open_browser_navigate_to_homepage()  {
    System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//Selenium_Cucumber_JarFile//chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://52.24.54.200/ecard-webapp/login");
     System.out.println("This step go to BC-Ribbon page");
 }

 @When("Input account and password")
    public void input_acc_pass(DataTable dataTable) {
     List<Map<String, String>> data = dataTable.asMaps(String.class , String.class);
     WebElement account = driver.findElement(By.className("email-login"));
     account.sendKeys(data.get(0).get("account"));
     WebElement password = driver.findElement(By.className("password-login"));
     password.sendKeys(data.get(0).get("password"));

     System.out.println("This step input acc and pass");
 }

 @And("Click LOGIN button")
    public void click_login(){
    WebElement lgButton = driver.findElement(By.className("btn-primary"));
    lgButton.click();

     System.out.println("This step click LOGIN button");
 }

 @Then("Login BC-Ribbon")
 public void login_success() {
    driver.get("http://52.24.54.200/ecard-webapp/manager/home");

     System.out.println("This step check login successfully");
 }

@And("Close browser")
    public void close_browser() {
driver.close();


    System.out.println("This step close browser");
}
}
