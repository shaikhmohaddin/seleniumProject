package propertyFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class saveAndUpdateFile {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {
	Properties p =new Properties();
    p.setProperty("FirstName", "Mohaddin");
    FileOutputStream o=new FileOutputStream("../NewjavaProject/file.properties");
    p.save(o, "First Update");
}
}