package Grow_testng;

import org.apache.poi.hemf.record.emfplus.HemfPlusMisc.EmfPlusSetRenderingOrigin;
import org.testng.Reporter;
import org.testng.annotations.Test;
//cedric buist
public class Priority {
@Test(priority = 2)//>>1) test case 2) main method 3) he dont care abt static and nonstatic
public void tc1() {
 Reporter.log("running from tc1",true);
	
}
@Test(priority = 3)
public void tc2() {
	Reporter.log("trunning from tc2",true);
}
@Test(priority = 1)
public void tc3() {
	Reporter.log("running from tc3",true);
}
}
