package Test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enable {
@Test

public void tc1() {
	Reporter.log("running from tc1",true);
}
@Test(timeOut = 8000)//8 sec time lagat asel tr to wait kru shkto(8000>>it will fails/10000>>it will pass
public void tc2() throws InterruptedException {
	Thread.sleep(9000);
	
	Reporter.log("running from tc 2",true);

}

@Test(enabled = false)//it will not consisder the method
public void tc3() {
	Reporter.log("running from tc3",true);
}
@Test
public void tc4() {
	Reporter.log("running from tc 4",true);
}
}
