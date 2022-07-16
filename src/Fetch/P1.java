package Fetch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P1 {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Desktop\\vishu.xlsx");
	String data=WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
}
}
