package Irames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
   Thread.sleep(4000);
   driver.manage().window().maximize();
   Thread.sleep(4000);
   /**driver.findElement(By.xpath("//a[text()='Frames']")).click();
   driver.switchTo().frame("packageFrame");
   driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
   
   driver.switchTo().frame("packageListFrame");
   
   driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();*/
   
   
}
}
