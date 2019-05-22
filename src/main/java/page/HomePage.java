package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
@FindBy(how=How.XPATH, using=".//*[contains(text(),'CRM')]")
WebElement CRM;
@FindBy(how=How.XPATH, using=".//*[contains(text(),'Add Contact')]")
WebElement AddContact;
@FindBy(how=How.NAME,using = "name")
WebElement Custsearch;
	
	public void NavigatingtoAddContact()
	{
		CRM.click();
		AddContact.click();
	}
	public void verifypageLogin()
	{
		boolean b = CRM.isDisplayed();
		boolean c =Custsearch.isDisplayed();
		System.out.println(b);
		System.out.println(c);
		
	}
	
	}
