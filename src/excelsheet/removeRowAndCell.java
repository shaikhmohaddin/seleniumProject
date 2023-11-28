package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class removeRowAndCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String path="../NewjavaProject/worksheet2X2.xlsx";
    FileInputStream f= new FileInputStream(path);
    Workbook wb = WorkbookFactory.create(f);
    wb.removeSheetAt(1);
    Sheet sh = wb.getSheet("Sheet1");
    Row tgt_row = sh.getRow(0);
    sh.removeRow(tgt_row);
    FileOutputStream out=new FileOutputStream(path);
    wb.write(out);
}
}
