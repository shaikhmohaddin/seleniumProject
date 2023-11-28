package genericcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class asif2 {
	public  static String data(String keyname) {
		Properties p=new Properties();
		try {
			p.load(new FileInputStream(asif.path));
		}
		 catch (Exception e) 
		{
		}
		return p.getProperty(keyname); 
	}

}
