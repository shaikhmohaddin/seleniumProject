package Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Testscript01 extends BaseTest {
		@Test
		public void valid() throws FileNotFoundException, IOException{
	  p.load(new FileInputStream("../NewjavaProject/simple.properties"));
	  rv.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(p.getProperty("un"));
      rv.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(p.getProperty("pass"));
	 rv.findElement(By.xpath(".//input[contains(@id,'login-button')]")).click();
			
		}
}
