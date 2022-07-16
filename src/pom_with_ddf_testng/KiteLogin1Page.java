package pom_with_ddf_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	// step1: declaration
		@FindBy(xpath ="//input[@id='userid']")private WebElement UN;
		@FindBy(xpath="//input[@id='password']")private WebElement pwd;
		@FindBy(xpath="//button[.='Login ']")private WebElement loginBtn;
		
	//step2: initialization
		public KiteLogin1Page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//implementation
		public void inputKitelogin1pageun(String username) {
			 UN.sendKeys(username);
		}
		public void inputKitelogin1pagepwd(String password) {
			pwd.sendKeys(password);
		}
		public void clickLoginBtn() {
			loginBtn.click();
		}
}
