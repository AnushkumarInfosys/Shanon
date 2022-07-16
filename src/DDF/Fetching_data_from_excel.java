package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetching_data_from_excel {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Documents\\Empty_sheet.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("empty");
Row r=sh.getRow(2);
Cell c=r.createCell(2);
c.setCellValue("Pushpa");
FileOutputStream fos=new FileOutputStream("C:\\Users\\Ankush\\OneDrive\\Documents\\Empty_sheet.xlsx");
wb.write(fos);
System.out.println("done");
}
}
