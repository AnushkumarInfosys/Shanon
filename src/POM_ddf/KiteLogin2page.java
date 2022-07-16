package POM_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2page {
	//step:Declaration
		@FindBy(xpath="//input[@id='pin']")private WebElement pin;
		@FindBy(xpath="//button[.='Continue ']")private WebElement cntbtn;
		
		//step:initialization
		public KiteLogin2page(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//implementation
		public void inputKitelogin2pagepin(String pinvalue) {
			pin.sendKeys(pinvalue);
		}
		public void clickKitelogin2pagecntbtn() {
			cntbtn.click();
		}
}
