package PageObjMain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjectModel.RegisterMercuryTours1;
import PageObjectModel.RegisterMercuryTours2;
import PageObjectModel.WelcomeMercuryTours;

public class Pom_exec {
	FirefoxDriver d;
  @SuppressWarnings("unused")
@Test
  public void f() throws IOException  {
	  
	  FileInputStream f=new FileInputStream("C:\\Users\\DELL\\workspace\\Frameworks\\src\\com\\frameworks\\Testdata\\Datadriventesting.xlsx");
	  @SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(f);
	  
	XSSFSheet ws=wb.getSheet("Sheet3");
	  d= new FirefoxDriver();
	  d.get("http://newtours.demoaut.com");
		
	  d.manage().window().maximize();
	  //calling functions
	  WelcomeMercuryTours wm=  PageFactory.initElements(d, WelcomeMercuryTours.class);
	  RegisterMercuryTours1 wm1=PageFactory.initElements(d, RegisterMercuryTours1.class);
	  RegisterMercuryTours2 wm2=PageFactory.initElements(d, RegisterMercuryTours2.class);
	  
	  Sleeper.sleepTightInSeconds(3);
	  wm.registertest();
	  Sleeper.sleepTightInSeconds(3);
	Iterator<Row> row=  ws.iterator();
	row.next();
	while(row.hasNext())
	{
		Row r =row.next();
	wm1.contactRefistration(r);
	Sleeper.sleepTightInSeconds(3);
	
	boolean b=wm2.validateRegistration(r.getCell(9).getStringCellValue());
	if(b==true)
	{
		r.createCell(12).setCellValue("passed");
		
	}
	else
	{
		r.createCell(12).setCellValue("fail");
	}
	d.navigate().back();
	Sleeper.sleepTightInSeconds(3);
	}
	FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\workspace\\Frameworks\\src\\com\\frameworks\\Testdata\\fileoutput.xlsx");
	wb.write(fo);
	fo.close();
	  
	  
	  
	  
	  
	  
	  
  }
}
