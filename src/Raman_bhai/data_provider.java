package Raman_bhai;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider 
{
	@Test(dataProvider="getvalue")
	public void test01(String x,String y)
	{
		System.out.println(x);
		System.out.println(y);
	}
	@DataProvider
	public Object[][] getvalue()
	{
		Object [][] rv = new Object[3][2];
		rv[0][0]= "admin";
		rv[0][1] = "admin1";
		rv[1][0] = "admin2";
		rv[1][1] = "admin1";
		rv[2][0] = "admin1";
		rv[2][1] = "admin1";
		return rv;
	}
	

}
