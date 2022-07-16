package Grow_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_on_method {
@Test
public void login() {
	Assert.fail();//intentionally tc fails
	Reporter.log("from tc1",true);
}
@Test(dependsOnMethods = {"login"})
public void logout() {
	Reporter.log("from tc2",true);
}
}
