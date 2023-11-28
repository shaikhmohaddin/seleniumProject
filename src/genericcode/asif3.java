package genericcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class asif3 {
	public static void main(String[] args) {
		//selenium code
		WebDriver rv =new FirefoxDriver();
		rv.get(asif2.data("appurl"));
		rv.findElement(By.xpath(".//input[contains(@id,'user-name')]")).sendKeys(asif2.data("un"));
	    rv.findElement(By.xpath(".//input[contains(@id,'password')]")).sendKeys(asif2.data("pass"));
	    rv.close();
	}
}
