package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class script_01 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("../NewjavaProject/Worksheet.xlsx");
	Workbook wb=WorkbookFactory.create(f);
	 org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
	 Row r = sh.getRow(1);
	 Cell c = r.getCell(2);
	 double data = c.getNumericCellValue();
	// data=c.getStringCellValue();
	System.out.println(data);
	//without verify
	//System.out.println(c);
	//System.out.println(c.toString());
}
}
