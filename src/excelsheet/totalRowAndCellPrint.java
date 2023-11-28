package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class totalRowAndCellPrint {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("../NewjavaProject/Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(f).getSheet("Sheet1");
		int totalrow = sh.getLastRowNum();

		for (int rownum = 0; rownum <=totalrow; rownum++) {
			Row r = sh.getRow(rownum);
			short totalcell = r.getLastCellNum();
		
			for (int cellnum = 0; cellnum <totalcell; cellnum++) {
				String data = r.getCell(cellnum).toString();
				System.out.print(data +"  ");
			}
			System.out.println();
			
		}
		
	}
}
