package hashmap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.google.common.collect.Table.Cell;

public class pra1 {
static FileInputStream f;
static Workbook wb;
static org.apache.poi.ss.usermodel.Sheet sh;
static Row r;
static org.apache.poi.ss.usermodel.Cell c;
public void openexcel() {
	try {
		WorkbookFactory.create(new FileInputStream(Utility2.excelpath));
	} catch (Exception e) {
	}
}
 public static void identifysheet(String sheetname)
 {
	 sh= wb.getSheet(sheetname);
 }
 public static int identifyRowCount() {
     return sh.getLastRowNum();	 
	}
 public static void identifyRow(int rownum) {
	 r=sh.getRow(rownum);
	}
 public static int  identifyCellCount() {
	return r.getLastCellNum();
}
 public static void identifyCell(int cellnum) {
	c=r.getCell(cellnum);
}
 public static String identifyCellData() {
	return c.toString();
}
	
}


