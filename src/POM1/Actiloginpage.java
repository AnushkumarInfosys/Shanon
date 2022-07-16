package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Actiloginpage {
@FindBy(id="username")private WebElement un;
@FindBy(name="pwd")private WebElement pwd;
@FindBy(xpath="//div[text()='Login']")private WebElement loginbtn;


public Actiloginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getun() {
	return un;
}


public void typeun(String un) {
	//un.sendKeys();
}
	



}
