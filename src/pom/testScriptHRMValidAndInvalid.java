package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testScriptHRMValidAndInvalid {
	@Test
	public void testLogin()
	{
		WebDriver rv = new FirefoxDriver();
		rv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		orangeHrmLoginPageInvalidAndValid o=new orangeHrmLoginPageInvalidAndValid(rv);
		
		o.setLogin("asif", "asif@123");
		o.clickOnLoginButton();
		o.setLogin("Admin", "admin123");
		o.clickOnLoginButton();
	}
}
