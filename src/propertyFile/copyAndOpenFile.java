package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class copyAndOpenFile {
public static void main(String[] args) throws IOException {
	//copy file from ROM to RAM
	FileInputStream f=new FileInputStream("../NewjavaProject/file.properties");
	//open property file
	Properties p =new Properties();
	p.load(f);
	String str = p.getProperty("url");
	System.out.println(str);
	//save 
	p.setProperty("FirstName", "Mohaddin");
    FileOutputStream o=new FileOutputStream("../NewjavaProject/file.properties");
    p.save(o, "First Update");
	
}
}
