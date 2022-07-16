package Grow_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
@Test(enabled=false)//it will disappear
public void tc1() {
	Reporter.log("from tc1",true);
}
@Test
public void tc2() {
	Reporter.log("from tc2",true);
}
}
