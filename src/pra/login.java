package pra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {
public static void main(String[] args) {
	WebDriver rv=new FirefoxDriver();
	rv.get("https://demoapps.qspiders.com/");
	rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	map.readDataToMap("loginpage");
	String un = map.getDataFromMap("email");
	
	rv.findElement(By.id("name")).sendKeys(un);
	String pwd = map.getDataFromMap("password");
rv.findElement(By.id("email")).sendKeys(pwd);
}
}
