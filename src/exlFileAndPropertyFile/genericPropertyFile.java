package exlFileAndPropertyFile;

import java.io.FileInputStream;
import java.util.Properties;

import genericcode.Utility;

public class genericPropertyFile {
	public static String getData(String keyname){
		Properties p=new Properties();
		try {
			p.load(new FileInputStream(Utility1.propertypath));
		} catch (Exception e) {

		}
		return p.getProperty(keyname);
	}
}
