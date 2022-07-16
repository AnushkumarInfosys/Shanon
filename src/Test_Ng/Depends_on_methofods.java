package Test_Ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_on_methofods {
@Test

public void login() {//it will fail
	Assert.fail();
	Reporter.log("running from tc1",true);
}
@Test(dependsOnMethods = {"login"})
public void logout() {//it will skip
	Reporter.log("running from tc 2",true);
}
}
