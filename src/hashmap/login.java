package hashmap;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	public static void main(String[] args) {
	WebDriver rv=new FirefoxDriver();
	rv.get("https://www.facebook.com/");
	rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	maps.readDatToMap("loginpage");
	String un=maps.getDataFromMap("email");
	rv.findElement(By.xpath(".//input[contains(@id,'email')]")).sendKeys(un);
	String pwd =maps.getDataFromMap("password");
	 rv.findElement(By.xpath(".//input[contains(@id,'pass')]")).sendKeys(pwd);
}
}
