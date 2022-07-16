package F_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage2 {
//step:Declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[.='Continue ']")private WebElement cntbtn;
	
	//step:initialization
	public KiteLoginPage2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//step:implementation
	public void enterPin() {
		pin.sendKeys("171992");
	}
	public void clickcntBtn() {
		cntbtn.click();
		
	}
}
