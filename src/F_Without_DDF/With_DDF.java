package F_Without_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF {
public static void main(String[] args) throws Throwable {
	//code to fetch data from excelsheet
	FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\Downloads\\excel\\vishuuu.xlsx");
	Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
	//set the system propperties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait global wait
	//enter Userid
	String userid=sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(userid);
	driver.findElement(By.id("userid")).sendKeys(userid);
	//enter password
	String pwd=sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.id("password")).sendKeys(pwd);
	//click on login btn
	driver.findElement(By.xpath("//button[.='Login ']")).click();
	String expTitle="Kite - Zerodha's fast and elegant flagship trading platform";
	String actTitle=driver.getTitle();
	if(expTitle.equals(actTitle)) {
		System.out.println("login 2 page is opemned, test case is pass");
	}
	else {
		System.out.println("login page is not opened and test case is failed");
	}
	// enter the pin 
	Thread.sleep(5000);
	String pin=sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.id("pin")).sendKeys(pin);
	//click on continue btn
	Thread.sleep(10000);
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	Thread.sleep(3000);
	//verify home page
	String expT="Dashboard / Kite";
	String actT=driver.getTitle();
	System.out.println(actT);
	Thread.sleep(4000);
	if(actT.equals(expT)) {
		System.out.println("Home page is opened and test case is pass");
	}
	else {
		System.out.println("Home page is not opened and test case is failed");
	}
	
			
	
	
	
	
	
	
	
}
}
