package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;


public class LoginTest {
	@Test
	@Parameters({"email","password"})
	public void login(String email, String password)
	{
		
		WebDriver driver= BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		LoginPage log= PageFactory.initElements(driver, LoginPage.class);
		log.Login(email, password);
		
		HomePage hom= PageFactory.initElements(driver, HomePage.class);
		hom.NavigatingtoAddContact();
		hom.verifypageLogin();
		
		
		driver.close();
		driver.quit();
			
	}

}


