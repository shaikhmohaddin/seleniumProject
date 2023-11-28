package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exc2X2Format {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("../NewjavaProject/Worksheet.xlsx");
	Sheet sh = WorkbookFactory.create(f).getSheet("Sheet2");
	for (int rownum = 0; rownum <=1; rownum++) {
		Row r = sh.getRow(rownum);
		for (int cellnum = 0; cellnum <=1; cellnum++) {
			Cell c = r.getCell(cellnum);
			System.out.print(c.toString() +"  ");
		}
		System.out.println();
		
	}
	
}
}
