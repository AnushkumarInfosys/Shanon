package Grow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page_Automation {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\eclipse-workspace\\Selenium_Guru\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://kite.zerodha.com/");//it will open the zerodha application
driver.manage().window().maximize();
driver.findElement(By.id("userid")).sendKeys("DPG458");
driver.findElement(By.id("password")).sendKeys("Amol@1234");
driver.findElement(By.xpath("//button[text()='Login ']")).click();
Thread.sleep(4000);
driver.findElement(By.id("pin")).sendKeys("171992");
driver.findElement(By.xpath("//button[.='Continue ']")).click();
Thread.sleep(4000);
String expTitle="Dashboard / Kite";
String actTitle=driver.getTitle();
if(expTitle.equals(actTitle)) {
	System.out.println("Test case is pass");
}
else {
	System.out.println("Test case is fail");
}
System.out.println(actTitle);

}


}

