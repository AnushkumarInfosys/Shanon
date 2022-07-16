package Grow_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_report {
@Test//main method 
public void Tc1() {
	Reporter.log("iam from tc1",true);
}
@Test//main method
public void tc2() {
	Reporter.log("i am from tc2",true);
	
}
@Test
public void tc3() {
	Reporter.log("i am from tc3",true);
}
}
