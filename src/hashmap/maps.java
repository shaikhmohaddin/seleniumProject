package hashmap;

import java.util.HashMap;

public class maps {
static HashMap<String, String> m;
public static void readDatToMap(String sheetname) {
	m=new HashMap<>();
       Excel.openExcel();
       Excel.identifySheet(sheetname);
	int rowcount= Excel.identifyRowCount();
	for (int rownum = 0;rownum <=rowcount;rownum++) {
		 Excel.identifyRow(rownum);
		 Excel.identifyCell(0);
		String key =  Excel.identifyCellData();
		 Excel.identifyCell(1);
		String value =  Excel.identifyCellData();
		m.put(key, value);
	}
}
	public static String getDataFromMap(String keyname) {
		return m.get(keyname);
	}
	
}
 