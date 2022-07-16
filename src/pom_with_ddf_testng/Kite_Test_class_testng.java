package pom_with_ddf_testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kite_Test_class_testng {
	 KiteLogin1Page login1;
	 KiteLogin2page login2;
	 KiteHomePage home;
	 WebDriver driver;
	 Sheet sh;
@BeforeClass
public void openBrowser() throws Throwable, IOException{
	//Excel fetching
			FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\Downloads\\excel\\vishuuu.xlsx");
		 sh=WorkbookFactory.create(fis).getSheet("Sheet1");
			
			//set the  sytem properties
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ankush\\\\Downloads\\\\chromedriver_win32 (6)\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		  //global wait/implicitly wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  //open the application
		  driver.get("https://kite.zerodha.com/");
		  //maximize the browser
		  driver.manage().window().maximize();
		  login1=new KiteLogin1Page(driver);
			  login2=new KiteLogin2page(driver);
			 home=new KiteHomePage(driver);
}
@BeforeMethod
public void openApp() {
	String username=sh.getRow(0).getCell(0).getStringCellValue();//we are fetching username
	  login1.inputKitelogin1pageun(username);
	  //fetch password from excel
	 String password=sh.getRow(0).getCell(1).getStringCellValue();
	 login1.inputKitelogin1pagepwd(password);
	  //click on login button
	 login1.clickLoginBtn();
	 String pinvalue=sh.getRow(0).getCell(2).getStringCellValue();
		login2.inputKitelogin2pagepin(pinvalue);
		
		//click on continue buttonn
		login2.clickKitelogin2pagecntbtn();
	
}
@Test
public void verifyid() {
	String expuserid=sh.getRow(0).getCell(0).getStringCellValue();
	String actual = home.verifyUserId();
	Assert.assertEquals(expuserid,actual, "-failed:Both are diff");
}
@AfterMethod
public void closedapp()
{
	Reporter.log("closed app",true);
}
@AfterClass
public void closedBrowser()
{
	driver.close();
}

}
