package POM_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//step1:Declaration
		@FindBy(xpath="//span[.='DPG458']")private WebElement userid;
	//step2:initialization
		public KiteHomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//step3: implementation
		public void verifyUserId(String expuserid) {
			
			String actUserid=userid.getText();
			if(actUserid.equals(expuserid)) {
				System.out.println("Home is open, Test case is passed");
			}
			else {
				System.out.println("Home page is not opened, Test case is failed");
			}
}
}
