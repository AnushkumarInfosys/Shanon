package Test_Ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_Assert {
@Test 
public void t1() {
	Reporter.log("running tc 1",true);
}
@Test
public void tc2() {//boss ek jri verification fail zal na akh tc fail zal(terminate hone mntat)
	String s1="Rahul";
	String s2="pravin";
	Assert.assertEquals(s1,"Rahul","failed both are different ");
	Assert.assertNotEquals(s1,"parsure","both are different");// jri equal nsel tri tu PASS KR	
	Assert.assertEquals(s2,"pravin", "failes tc is fail");
	
	
}
@Test
public void tc3() {
	String s1="abc";
	String s2="abc";
	Assert.assertEquals(s1,s2,"failes if not equals");
}
}
