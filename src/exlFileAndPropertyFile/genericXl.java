package exlFileAndPropertyFile;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class genericXl {
	static FileInputStream f;
	  
	static Workbook wb;
	public static String getData(String sheetname,int rownum,int cellnum)
	 {
		
			try {
			f=new FileInputStream(Utility1.exlpath);
			} catch (Exception e) {
				}
			try {
				wb=WorkbookFactory.create(f);
			} catch (Exception e) {}
		return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
	 }
	}



