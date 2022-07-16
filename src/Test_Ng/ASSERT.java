package Test_Ng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Disadvantage>>if 2 verifications are there in 1 tc if 1st verifin failed then 2 nd verification wont run
public class ASSERT {
@Test
public void m1() {

	String s1="India";
	String s2="America";
	/*if(s1.equals(s2)) {//boss it will more take time and more length of code
		
		Reporter.log("tc is pass",true);
	}
	else {
		Reporter.log("tc is failed",true);
	}*/
	Assert.assertEquals(s1,s2,"-failed ,they are not simimllar");
}
}
