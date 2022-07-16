package Fetch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_Fetch {
public static void main(String[] args) throws Throwable {
	FileInputStream file=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Desktop\\Fetching\\Fetching data.xlsx");
   Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
   String data =sh.getRow(0).getCell(0).getStringCellValue();
   System.out.println(data);
}
}
