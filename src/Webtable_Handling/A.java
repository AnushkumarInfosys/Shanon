package Webtable_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\Ankush\\OneDrive\\Documents\\Webtable.html");
	//print Rashmika
	String rashmi = driver.findElement(By.xpath("//table//tr[2]/td[3]")).getText();
	System.out.println(rashmi);
	//print entire table
	String entireetab = driver.findElement(By.xpath("//table")).getText();
	System.out.println(entireetab);
	//print 1st row
	String row1 = driver.findElement(By.xpath("//table//tr")).getText();
	System.out.println(row1);
	//print 2 nd row
	String row2 = driver.findElement(By.xpath("//table//tr[2]")).getText();
	System.out.println(row2);
	//print all rows
	String col3 = driver.findElement(By.xpath("//table//td[3]")).getText();
	System.out.println(col3);
}
}
