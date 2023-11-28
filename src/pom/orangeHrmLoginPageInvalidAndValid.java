package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangeHrmLoginPageInvalidAndValid {
	@FindBy(name="username")
    private WebElement username;
	@FindBy(name="password")
    private WebElement password;
	@FindBy(xpath=".//button[text()=' Login ']")
	private WebElement loginbutton;
	public orangeHrmLoginPageInvalidAndValid(WebDriver rv) {
		PageFactory.initElements(rv, this);
		
	}
	public void setLogin(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
	}
	public void clickOnLoginButton() {
		loginbutton.click();
	}

}
