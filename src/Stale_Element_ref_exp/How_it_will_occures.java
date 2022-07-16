package Stale_Element_ref_exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// why pom classes are designed ??..>>to eleminate StaleElementReferenceException
public class How_it_will_occures {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Ankush\\\\\\\\Downloads\\\\\\\\chromedriver_win32 (6)\\\\\\\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://kite.zerodha.com/");
   WebElement un=driver.findElement(By.id("userid"));//un id is 1010
   driver.navigate().refresh();// ud is 2020
   un.sendKeys("DPG458");
   }//@FindBy
}
