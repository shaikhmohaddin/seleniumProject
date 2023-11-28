package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testScriptHRM {
@Test
public void testLogin()
{
	WebDriver rv = new FirefoxDriver();
	rv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	orangeHrmLoginPage o=new orangeHrmLoginPage(rv);
	o.setLogin("asif", "asif@123");
	o.clickOnLoginButton();
	String msg = o.geterrormsg();
	Reporter.log(msg,true);
	rv.close();
}
}
