package seleniumgluecode;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
    public static WebDriver driver;
    @Given("User is on the united.com homepage")
    public void user_is_on_the_untied_com_homepage() {
    	System.setProperty("webdriver.chrome.driver","/Users/krishnachaitanyakolla/Desktop/selenium browser drivers and libs/BrowserDrivers/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.united.com/en/us");       
        
    }

    @Given("signin tray is open")
    public void signin_tray_is_open() {
        driver.findElement(By.id("loginButton")).click();
       
    }

    @When("user enters mpid")
    public void user_enters_mpid() {
        driver.findElement(By.id("loginFormModel.login")).sendKeys("cf343243");
        
    }

    @When("password")
    public void password() {
    	driver.findElement(By.id("loginFormModel.password")).sendKeys("ecomm123");
        
    }

    @When("click on signin  button")
    public void click_on_signin_button() {
    	driver.findElement(By.xpath("//button[@type='submit' and contains(@class,'signInButton')] ")).click();
    }

    @Then("validate if user is able to login on to homepage or not")
    public void validate_if_user_is_able_to_login_on_to_homepage_or_not() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
    	/*WebDriverWait wait = new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='QuestionsList[0].AnswerKey']")));*/
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@name='QuestionsList[0].AnswerKey']")).click();
    	
    	Select dropDown = new Select(driver.findElement(By.xpath("//*[@name='QuestionsList[0].AnswerKey']")));
    	List<WebElement> e = dropDown.getOptions();
    	int itemCount = e.size();

    	for(int l = 1; l < itemCount; l++)
    	{
    	    System.out.println(e.get(l).getText());
    	}    	
    	/*System.out.println(Securityoptions1.size());
    	for(int i=0;i<=Securityoptions1.size();i++)
    	{
    		System.out.println(Securityoptions1.get(i));
    	}
        */
    }

    @Then("check more outcomes")
    public void check_more_outcomes() {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Given("user on homepage <user>")
    public void user_on_homepage_user() {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @When("user enters cf343243 ecomm123")
    public void user_enters_cf343243_ecomm123() {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @When("click on signin")
    public void click_on_signin() {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("verify signin success in step")
    public void verify_signin_success_in_step() {
        // Write code here that turns the phrase above into concrete actions
        
    }


}