package exlFileAndPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseclass {
WebDriver rv;
Properties p=new Properties();
@BeforeClass
public void openBrowser() {
	rv=new FirefoxDriver();
	}
@BeforeMethod
public void openApp() throws FileNotFoundException, IOException
{
	p.load(new FileInputStream(Utility1.propertypath));
	rv.get(p.getProperty("url")); 
	rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@AfterClass
public void closeBrowser()
{
	rv.close();
}
}
