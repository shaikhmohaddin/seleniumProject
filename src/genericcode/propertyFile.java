package genericcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyFile {
public static String getData(String keyname){
	Properties p=new Properties();
	try {
		p.load(new FileInputStream(Utility.propertyfilepath));
	} catch (Exception e) {

	}
	return p.getProperty(keyname);
}
}
