package Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver rv;
	Properties p=new Properties();
	@Parameters("BrowserName")
	@BeforeClass
	public void openBrowser(String BrowserName)
	{
		if (BrowserName.equals("Firefox")) {
			rv=new FirefoxDriver();
		} else if(BrowserName.equals("Chrome")) {
	     rv=new ChromeDriver();
		}
		else{
			rv=new EdgeDriver();
		}
	}
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException
	{
		 p.load(new FileInputStream("../NewjavaProject/simple.properties"));
		rv.get(p.getProperty("appurl")); 
		rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void testItestResult(ITestResult result)
	{
		String testMethod=result.getName();
		if (result.getStatus()==1) {
				Reporter.log(testMethod+"=====execution is pass",true);
			}
		else {
			Reporter.log(testMethod+"=====execution is fail",true);
		}
		}
	@AfterClass
	public void closeBrowser()
	{
		rv.close();
	}

}
