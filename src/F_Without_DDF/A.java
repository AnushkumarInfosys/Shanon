package F_Without_DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	//set the properties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   //open the application
   driver.get("https://kite.zerodha.com/");
   //enter the UN
   driver.findElement(By.id("userid")).sendKeys("DPG458");
   //enter the password
   driver.findElement(By.id("password")).sendKeys("Amol@1234");
   //click on login button
   driver.findElement(By.xpath("//button[.='Login ']")).click();
   //verification of login2 page
   String expTitle="Kite - Zerodha's fast and elegant flagship trading platform";
    String actTitle=driver.getTitle();
    if(actTitle.equals(expTitle)) {
    	System.out.println("Test case is pass");
    	System.out.println("successfully opened login2 page");
    }
    else {
    	System.out.println("Test case is faiuled");
    	
    }
    //enter the pin
    Thread.sleep(3000);
    driver.findElement(By.id("pin")).sendKeys("171992");
    //click on contnue button
    driver.findElement(By.xpath("//button[.='Continue ']")).click();
    //verification of home page
    Thread.sleep(3000);
    String ExpTitle="Dashboard / Kite";
    String ActTitle=driver.getTitle();  
    if(ActTitle.equals(ExpTitle)) {
    	System.out.println("Test case is pass, home page is opened");
    }
    else {
    	System.out.println("Tesdt case is failed and home is not displayed");
    }
   //logout
   /* driver.findElement(By.xpath("//span[text()='DPG458']")).click();
    driver.findElement(By.xpath("//a[.=' Logout']")).click();
    //verify logout page
    String exptitle="Kite - Zerodha's fast and elegant flagship trading platform";
 String acttitle=driver.getTitle();
 if(acttitle.equals(exptitle)) {
	 System.out.println("logout is done, test is pass");
 }
 else {
	 System.out.println("logout is not done,test case is failed");*/    
 }   		
}

