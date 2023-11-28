package Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript02 extends BaseTest{
	@Test
	public void invalid() throws FileNotFoundException, IOException{
  p.load(new FileInputStream("../NewjavaProject/simple.properties"));
  rv.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(p.getProperty("invalidun"));
  rv.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(p.getProperty("invalidpass"));
 rv.findElement(By.xpath(".//input[contains(@id,'login-button')]")).click();
 WebElement tgt = rv.findElement(By.xpath(".//h3[contains(text(),'Epic sadface:')]"));
   if (tgt.isDisplayed())
   {
	Reporter.log("un and pass is invalid",true);
   } 
   else 
   {
	Reporter.log("un and pass is valid",true);
    }
}
}
