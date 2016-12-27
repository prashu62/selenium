package PageObjMain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.HomePage_HRM;

public class Pom_Test_execution {
  @Test
  public void f() {
	  //launch app
	  WebDriver d= new FirefoxDriver();
	  d.get("http://opensource.demo.orangehrmlive.com/");
	  d.manage().window().maximize();
	  HomePage_HRM obj= PageFactory.initElements(d, HomePage_HRM.class);
	  obj.login_type();
	  
  }
}
