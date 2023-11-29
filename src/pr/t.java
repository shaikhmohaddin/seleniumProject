package pr;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class t {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f= new FileInputStream("../NewjavaProject/asif2.xlsx");
		Workbook wb=WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("Sheet1");
		int num = sh.getLastRowNum();
		for (int i = 0; i <=num; i++) {
			Row r = sh.getRow(i);
			short num1 = r.getLastCellNum();
		for (int j = 0; j <num1; j++) {
		
		Cell c = r.getCell(j);
	    String data = c.getStringCellValue();
	    System.out.print(data +"    ");
		}
		System.out.println();
		}     
	}

}
