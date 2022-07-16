package Test_Ng;

import org.openxmlformats.schemas.drawingml.x2006.main.STTextFontScalePercentOrPercentString;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_Annotations {
@BeforeClass
public void openBrowser() {
	Reporter.log("open broser",true);
}
@BeforeMethod
public void loginToApp() {
	Reporter.log("login to application",true);
}
@Test
public void verifyuserid1() {
	Reporter.log("verify aser id 1",true);
	
}
@Test
public void verifypagetitle() {
	Reporter.log("verify title of page",true);
}
@AfterMethod
public void logoutApp() {
	Reporter.log("logout the application",true);
}
@AfterClass
public void closetheBrowser() {
	Reporter.log("Close the browser",true);
}
}
