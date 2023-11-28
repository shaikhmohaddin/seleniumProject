package exlFileAndPropertyFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script extends baseclass {
	@Test
	public void invalid() {
  rv.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(genericXl.getData("loginpage", 0, 0));
 rv.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(genericXl.getData("loginpage", 0, 1));
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