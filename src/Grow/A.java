package Grow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
public static void main(String[] args) throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\Downloads\\excel\\vishuuu.xlsx");
  Sheet sh=WorkbookFactory.create(fis).getSheet("Sheet1");
  String data=sh.getRow(8).getCell(2).getStringCellValue();
  System.out.println(data);
    
 }
}
