package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver =  null;
	
@Given("browser is open")
public void browser_is_open()
{
	System.out.println("Inside Step - browser is open");
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
}

@And("user is on google search page")
public void user_is_on_google_Search_page()
{
	System.out.println("Inside Step - user is on google search page");
	
	driver.navigate().to("https://google.com");
}

@When("user enters a text in search box")
public void user_enters_a_text_in_search_box() throws InterruptedException
{
	System.out.println("Inside Step - user enters a text in search box");
	
	driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	
	Thread.sleep(2000);
}

@And("hits enter")
public void hits_enter() throws InterruptedException
{
	System.out.println("Inside Step - hits enter");
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	Thread.sleep(2000);
}

@Then("user is navigated to search results")
public void user_is_navigated_to_search_Results()
{
	System.out.println("Inside Step - user is navigated to search results");
	
	driver.getPageSource().contains("Online Courses");
	
	
	driver.close();
	driver.quit();
}

}
