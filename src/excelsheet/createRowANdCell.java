package excelsheet;

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

public class createRowANdCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String path="../NewjavaProject/worksheet2X2.xlsx";
     FileInputStream f= new FileInputStream(path);
     Workbook wb = WorkbookFactory.create(f);
     Sheet sh = wb.createSheet("Sheet2");
     Row r = sh.createRow(0);
     Cell c = r.createCell(0);
     c.setCellValue("asif123");
     FileOutputStream out=new FileOutputStream(path);
     wb.write(out);
}
}
