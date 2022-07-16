package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\eclipse-workspace\\selenium_kphb\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
//create object of pom
LoginPage p=new LoginPage(driver);
p.login("admin","manager");


}
}
