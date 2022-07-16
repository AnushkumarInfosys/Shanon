package Grow_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_ng_keywords {
@Test(invocationCount =10)
public void tc1() {
	Reporter.log("running from tc1",true);
}
@Test(invocationCount = 5)
public void tc2() {
	Reporter.log("running from tc2",true);
	
}
@Test(invocationCount = 2)
public void tc3() {
	Reporter.log("rUNNING FROM TC3",true);
}

}
