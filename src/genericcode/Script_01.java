package genericcode;

import org.apache.commons.io.input.ReversedLinesFileReaderTestParamFile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {
public static void main(String[] args) {
	//selenium code
	WebDriver rv =new FirefoxDriver();
	rv.get(propertyFile.getData("appurl"));
	rv.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(propertyFile.getData("un"));
    rv.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(propertyFile.getData("pass"));
}
}
