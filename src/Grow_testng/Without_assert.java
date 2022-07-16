package Grow_testng;

public class Without_assert {//without testng
	
public static void main(String[] args) {
	String str1="INDIA";
	String str2="AMERICA";
	if(str1.equals(str2)) {
		System.out.println("pass");
	}
	else {
		System.out.println("Fail");
	}
}
}
