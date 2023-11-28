package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class script_02 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("../NewjavaProject/Worksheet.xlsx");
		Cell c = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(2);
		if (c.getCellType()==CellType.STRING) {
		String data = c.getStringCellValue();
		System.out.println(data);
		} else {
             double data = c.getNumericCellValue();
             System.out.println(data);
		}
}
}
