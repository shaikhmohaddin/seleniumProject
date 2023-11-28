package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetchData {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//fetch data from property file
		Properties p=new Properties();
		p.load(new FileInputStream("../NewjavaProject/file.properties"));
		//selenium code
		WebDriver rv=new FirefoxDriver();
		rv.get(p.getProperty("appurl"));
		rv.findElement(By.id("email")).sendKeys(p.getProperty("email"));
		rv.findElement(By.id("pass")).sendKeys(p.getProperty("pass"));
	    rv.close();
	}
}
