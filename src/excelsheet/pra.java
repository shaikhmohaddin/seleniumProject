package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class pra {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f= new FileInputStream("../NewjavaProject/Worksheet.xlsx");
	     Sheet data = WorkbookFactory.create(f).getSheet("Sheet1");
	     int ss = data.getLastRowNum();
	    for (int i = 0; i < ss; i++) {
			Cell ss1 = data.getRow(i).getCell(0);
			Cell ss2 = data.getRow(i).getCell(1);
			System.out.println(ss1 +"   "+ss2);
	
			
		}

}
}