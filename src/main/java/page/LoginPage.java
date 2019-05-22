package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	//findBy 
	@FindBy(how=How.ID,using = "username")
	WebElement username;
	@FindBy(how= How.ID, using = "password")
	WebElement password;
	@FindBy(how=How.NAME,using = "login")
	WebElement loginButton;
	public void Login(String UN, String PWD)
	{
		username.sendKeys(UN);
		password.sendKeys(PWD);
		loginButton.click();
	}
		
	}



