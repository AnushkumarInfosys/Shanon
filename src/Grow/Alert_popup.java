package Grow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\eclipse-workspace\\Selenium_Guru\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	// enter customer id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
	//click on submit
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Thread.sleep(4000);
	// switch to alert popup
	String text=driver.switchTo().alert().getText();//print text of popup
	System.out.println(text);
	Thread.sleep(4000);
	//click on ok accept it
	//driver.switchTo().alert().accept();
	//  click on cancel dismiss it
	driver.switchTo().alert().dismiss();
}
}
