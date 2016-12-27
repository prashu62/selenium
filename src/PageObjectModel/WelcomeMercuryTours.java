package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {
	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	public void signonTest()
	{
		signon.click();
	}
	@FindBy(xpath="html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement register;
	public void registertest()
	{
		register.click();
	}
	@FindBy(linkText="SUPPORT")
	WebElement support;
	public void supporttest()
	{
		support.click();
		
}
@FindBy(linkText="CONTACT")	
WebElement contact;
public void ContactTest() {
	contact.click();
	
}
@FindBy(name="userName")
WebElement un;

@FindBy(name="password")
WebElement pwd;
@FindBy(name="login")
WebElement signin;
public void findAFlight(String u,String p)

{
		
un.sendKeys(u);
		
pwd.sendKeys(p);
		
signin.click();
	}

@FindBy(linkText="your destination")
	
WebElement destinations;
	
public void destinationsTest()
	
{
	
	destinations.click();
	
}
	
	
@FindBy(linkText="featured vacation destinations")

	WebElement vacations;

	public void featuredVacations()
	{
	
	vacations.click();
	
}
	
	
@FindBy(linkText="Register here")
	
WebElement register1;
	
public void registerHere()
	
{
	
	register1.click();
	
}

}













