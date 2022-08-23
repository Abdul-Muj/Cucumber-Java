package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	//CacheLookUp can be used to instruct the initElements() method to cache the element 
	//once its located and so that it will not be searched over and over again whenever 
	//calling it from any method
	
	@FindBy(id="name")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver)
	{
		this.driver = driver;		
		AjaxElementLocatorFactory ajaxfactory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajaxfactory, this);
	}
	
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}

}
