package Grow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_ex {
public static void main(String[] args) throws Throwable {
	//set the system properties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    Thread.sleep(3000);
    driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='Frames']")).click();
    Thread.sleep(3000);
    //switch to frame 0
    /**driver.switchTo().frame("packageListFrame");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();*/
    //switch to frame 2
    /**driver.switchTo().frame("classFrame");
    driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chromium']")).click();*/
    //switch to frame 1
    driver.switchTo().frame("packageFrame");
    driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
    
    
    
}
}
