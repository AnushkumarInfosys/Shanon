package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")private WebElement untb;
@FindBy(name="pwd")private WebElement pwdtb;
@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;


public LoginPage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
//getters()
/**public WebElement getuntb(){
	return untb;
	
}
//setters()
public void typeuntb(String un){
	untb.sendKeys(un);
	
}
public WebElement getpwdtb(){
	return pwdtb;
}
public void typepwdtb(String pwd){
	pwdtb.sendKeys(pwd);
	
	
}
public WebElement getloginBtn(){
	return loginBtn;
	
}
public void clickLoginBtn(){
	loginBtn.click(); 
}*/
public void login(String un,String pw){
	untb.sendKeys(un);
	pwdtb.sendKeys(pw);
	loginBtn.click();
}

{
	
}


}
