package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testscript_01 {
@Test
public void testfor()
{
	WebDriver rv=new FirefoxDriver();
	rv.get("https://www.facebook.com/");
	fbloginpage r=new fbloginpage(rv);
	r.clicOnforget();
	forgetpasswordpage f=new forgetpasswordpage(rv);
	f.setforgetpwd("Asif@123");
	f.clickOnserchbutton();
}
}
