package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage_HRM {

	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement un;
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement pwd;
	
	@FindBy(id="btnLogin")
	
	@CacheLookup
	WebElement logbtn;
	
	public void login_type() {
		
		un.sendKeys("Admin");
		pwd.sendKeys("admin");
		logbtn.click();
	}
			
		
	}
	
	




