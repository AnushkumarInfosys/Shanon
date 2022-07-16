package Keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;





public class Fetch_from_property_file {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\Downloads\\Keyworddriven.PROPERTIES");
	Properties pobj=new Properties();
	pobj.load(fis);
	String str=pobj.getProperty("url");
	System.out.println(str);
	String uN=pobj.getProperty("username");
	System.out.println(uN);
	String pwD=pobj.getProperty("password");
	System.out.println(pwD);
	


	}

	

}

