package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	
	@Test
	@Parameters({"email","password","Name","Company","EmailContact","Phone","address","city","state","zipcode","country"})
	
		public void AddContact(String email,String password,String Name, String Company, String EmailContact, String Phone,
				String address, String city, String state, String zipcode,String country)
		{
		WebDriver driver= BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		LoginPage log= PageFactory.initElements(driver, LoginPage.class);
		log.Login(email, password);
		
		HomePage hom= PageFactory.initElements(driver, HomePage.class);
		hom.NavigatingtoAddContact();
		hom.verifypageLogin();
		
		AddContactPage adcp = PageFactory.initElements(driver, AddContactPage.class);
		adcp.FillingUpAddressForm(Name,Company,EmailContact,Phone,address,city,state,zipcode,country);
		driver.close();
		driver.quit();
		
	}
	
}
