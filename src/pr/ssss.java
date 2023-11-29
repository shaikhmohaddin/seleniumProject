package pr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ssss {
public static void main(String[] args) throws IllegalStateException, IOException {
	FileInputStream f= new FileInputStream("../NewjavaProject/asif2.xlsx");
	Workbook wb=WorkbookFactory.create(f);
	Sheet sh = wb.getSheet("Sheet1");
	Row r = sh.getRow(0);
	Cell c = r.getCell(0);
	c.setCellValue("mera bharat desh mahan");
	FileOutputStream out=new FileOutputStream("../NewjavaProject/asif2.xlsx");
    wb.write(out);
}
}
