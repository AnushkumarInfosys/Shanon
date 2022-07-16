package POM_ddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
	public static void main(String[] args) throws Throwable {
		//Excel fetching
		FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\Downloads\\excel\\vishuuu.xlsx");
	Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		
		//set the  sytem properties
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ankush\\\\Downloads\\\\chromedriver_win32 (6)\\\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  //global wait/implicitly wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //open the application
	  driver.get("https://kite.zerodha.com/");
	  //maximize the browser
	  driver.manage().window().maximize();
	  //call 1st pom class
	  KiteLogin1Page login1=new KiteLogin1Page(driver);
	String username=sh.getRow(0).getCell(0).getStringCellValue();//we are fetching username
	  login1.inputKitelogin1pageun(username);
	  //fetch password from excel
	 String password=sh.getRow(0).getCell(1).getStringCellValue();
	 login1.inputKitelogin1pagepwd(password);
	  //click on login button
	 login1.clickLoginBtn();


	//call 2nd pom class
	 KiteLogin2page login2=new KiteLogin2page(driver);
	 //fetch pin from excel sheet
	 String pinvalue=sh.getRow(0).getCell(2).getStringCellValue();
	login2.inputKitelogin2pagepin(pinvalue);
	
	//click on continue buttonn
	login2.clickKitelogin2pagecntbtn();
	
	//call pom 3
	KiteHomePage home=new KiteHomePage(driver);
	//fetch user id from excel
	String expuserid=sh.getRow(0).getCell(0).getStringCellValue();
	home.verifyUserId(expuserid);
	}
}