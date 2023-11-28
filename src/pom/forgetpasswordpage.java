package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgetpasswordpage {
	private WebElement emailid;
	private WebElement serchbutton;
public forgetpasswordpage(WebDriver rv) {
	emailid=rv.findElement(By.xpath(".//input[contains(@id,'identify_email')]"));
	serchbutton=rv.findElement(By.xpath(".//button[contains(@id,'did_submit')]"));
}
public void setforgetpwd(String email) {
	emailid.sendKeys(email);
}
public void clickOnserchbutton() {
	serchbutton.click();
}
}
