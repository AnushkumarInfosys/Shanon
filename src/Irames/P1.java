package Irames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (6)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.w3schools.com/");
}
}
