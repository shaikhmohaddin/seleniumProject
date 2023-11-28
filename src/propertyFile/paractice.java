package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import genericcode.propertyFile;

public class paractice {
@SuppressWarnings("deprecation") //save
public static void main(String[] args) throws IOException {
	FileInputStream f= new FileInputStream("../NewjavaProject/simple.properties");
	Properties p = new Properties();
	p.load(f);
	String data = p.getProperty("appurl");
	System.out.println(data);
	p.setProperty("name","mohaddin");
	FileOutputStream o=new FileOutputStream("../NewjavaProject/simple.properties");
	p.save(o, "update");
	System.out.println(p.getProperty("name"));
	
}
}
