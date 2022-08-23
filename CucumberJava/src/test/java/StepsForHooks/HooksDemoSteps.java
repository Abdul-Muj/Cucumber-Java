package StepsForHooks;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	WebDriver driver = null;
	
	//@Before(order=1)
	@Before(value = "@smoke", order = 1)
	public void browserSetup()
	{
		System.out.println("I am inside browser set up");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before(order=2)
	public void setup2()
	{
		System.out.println("I am inside setup2 \n");
	}
	
	@After
	public void teardown()
	{
		System.out.println("I am inside tear down");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public  void beforesteps()
	{
		System.out.println("I am inside Before steps function");
	}
	
	@AfterStep
	public  void aftersteps()
	{
		System.out.println("I am inside After steps function");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
		
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
	}

}
