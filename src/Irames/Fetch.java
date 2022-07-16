package Irames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch {
public static void main(String[] args) throws Throwable, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Desktop\\excel2\\ankita.xlsx");
    Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
    String data=sh.getRow(0).getCell(0).getStringCellValue();
  System.out.println(data);

	
}
}
