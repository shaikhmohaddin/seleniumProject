package pra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

import hashmap.Utility2;

public class excel {
static FileInputStream f;
static Workbook wb;
static org.apache.poi.ss.usermodel.Sheet sh;
static Row r;
static org.apache.poi.ss.usermodel.Cell c;
public  static void openexcel() {
	try {
		wb=WorkbookFactory.create(new FileInputStream(Utility3.excelpath));
	} catch (Exception e) {
	}}
public static void identifySheet(String sheetname) {
	sh= wb.getSheet(sheetname);
}
public static int  idntifyRowCount() {
	return sh.getLastRowNum();
	}
public static void identifyRow(int rownum) {
	r=sh.getRow(rownum);
	}
public static int identifyCellCount() {
      return r.getLastCellNum();
	}
public static void identifyCell(int cellnum) {
	c=r.getCell(cellnum);
	
}
public static String identifyGetData() {
	return c.toString();
	
}
}
