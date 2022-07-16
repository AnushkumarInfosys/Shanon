package Vishwajeet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF 
{
	public static void main(String[] args) throws Throwable
	{
		//fetch deta from excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\"
				+ "Desktop\\Fetching\\Fetching data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		//set the properties
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\"
				+ "Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   //open the application
	   driver.get("https://kite.zerodha.com/");
	   
	   //enter UI from excel sheet
	   String userID = sh.getRow(0).getCell(0).getStringCellValue();
	   driver.findElement(By.id("userid")).sendKeys(userID);

		//enter password from excelsheet
	   String pass = sh.getRow(0).getCell(1).getStringCellValue();
	   driver.findElement(By.id("password")).sendKeys(pass);
	   
	   //click on login button
	   driver.findElement(By.xpath("//button[.='Login ']")).click();
	   
	   Thread.sleep(2000);
	   String expTitle="Kite - Zerodha's fast and elegant flagship trading platform";
	    String actTitle=driver.getTitle();
	    if(actTitle.equals(expTitle)) {
	    	System.out.println("Test case is pass");
	    	System.out.println("successfully opened login2 page");
	    }
	    else {
	    	System.out.println("Test case is faiuled");	
	    }
	   //enter pin from ecxelsheet
	   String PIN = sh.getRow(0).getCell(2).getStringCellValue();
	   driver.findElement(By.id("pin")).sendKeys(PIN);
	   
	 //click on contnue button
	    driver.findElement(By.xpath("//button[.='Continue ']")).click();
	}

}
