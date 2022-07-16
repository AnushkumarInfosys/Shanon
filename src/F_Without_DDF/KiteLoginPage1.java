package F_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 {
// step1: declaration
	@FindBy(xpath ="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement pwd;
	@FindBy(xpath="//button[.='Login ']")private WebElement loginBtn;
	
//step2: initialization
	public KiteLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//steps:3 implementation/usage
	public void enterUn() {
		UN.sendKeys("DPG458");
	}
	public void enterPwd() {
		pwd.sendKeys("Amol@1234");
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
}
