package F_Without_DDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {//ULC
public static void main(String[] args) throws Throwable {
//set the  sytem properties
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Ankush\\\\Downloads\\\\chromedriver_win32 (6)\\\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  //global wait/implicitly wait
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  //open the application
  driver.get("https://kite.zerodha.com/");
  //login 1 page call
  KiteLoginPage1 login1=new KiteLoginPage1(driver);
  login1.enterUn();
  login1.enterPwd();
  login1.clickLoginBtn();
  
  //logion 2 page call
  KiteLoginPage2 login2=new KiteLoginPage2(driver);
  login2.enterPin();
  login2.clickcntBtn();
  
  //home page call
  
  KiteHomePage home=new KiteHomePage(driver);
  home.verifyUserId();
  Thread.sleep(3000);
  driver.close();
   
}
}
