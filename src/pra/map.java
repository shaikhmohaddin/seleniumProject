package pra;

import java.util.HashMap;


public class map {
static HashMap<String, String> m;
public static void readDataToMap(String sheetname) {
	m=new HashMap<>();
	excel.openexcel();
	excel.identifySheet(sheetname);
	int rowcount = excel.idntifyRowCount();
	for (int rownum = 0; rownum <=rowcount; rownum++) {
		excel.identifyRow(rownum);
		excel.identifyCell(0);
		String key = excel.identifyGetData();
		excel.identifyCell(1);
		String value = excel.identifyGetData();
		m.put(key, value);
	}
	}
public static String getDataFromMap(String keyname) {
	return m.get(keyname);
	
}
}
