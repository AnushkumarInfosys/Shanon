package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginTest {

	public static void main(String[] args) {
		//Set the system property
		System.setProperty("webdriver.chrome.driver", 
				"./driver/chromedriver.exe");
		//Open the browser 
		WebDriver driver=new ChromeDriver();
		//Enter the test URL
		driver.get("https://demo.actitime.com/login.do");
		
		//Verify Login Page
		String expectedLoginTitle = "actiTIME - Login";
		String actualLoginTitle=driver.getTitle();
		
		if(actualLoginTitle.equals(expectedLoginTitle))
		{
			System.out.println("Login Page is Displayed, PASS");
		}
		else
		{
			System.out.println("Login Page is not Displayed, FAIL");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
