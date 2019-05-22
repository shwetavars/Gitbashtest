package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage {
	WebDriver driver;
	public AddContactPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
@FindBy(how=How.ID,using ="account")
WebElement FullName;
@FindBy(how=How.ID,using ="company")
WebElement Company;
@FindBy(how=How.ID,using ="email")
WebElement Email;
@FindBy(how=How.ID,using ="phone")
WebElement phone;
@FindBy(how=How.ID,using ="address")
WebElement address;
@FindBy(how=How.ID,using ="city")
WebElement city;
@FindBy(how=How.ID,using ="state")
WebElement state;
@FindBy(how=How.ID,using ="zip")
WebElement zip;

@FindBy(how=How.ID,using ="select2-country-container")
WebElement Country;
@FindBy(how=How.XPATH,using ="html/body/span/span/span[1]/input")
WebElement CountryTextBox;

@FindBy(how=How.ID,using ="submit")
WebElement submit;

public void FillingUpAddressForm(String name,String comp,String email,String ph,
		String add ,String ci,String st,String zip1, String Ctrybox)
{
	FullName.sendKeys(name);
	Company.sendKeys(comp);
	Email.sendKeys(email);
	phone.sendKeys(ph);
	address.sendKeys(add);
	city.sendKeys(ci);
	state.sendKeys(st);
	zip.sendKeys(zip1);
	Country.click();
	CountryTextBox.sendKeys(Ctrybox);
	CountryTextBox.sendKeys(Keys.ENTER);
	submit.click();
}

}
