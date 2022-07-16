package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\eclipse-workspace\\Selenium_Guru\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	Thread.sleep(4000);
	//driver.switchTo().alert().dismiss();
	driver.switchTo().alert().accept();
	
}
}
