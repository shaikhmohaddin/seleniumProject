package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fbloginpage {
private WebElement forgetepassowrd;
public  fbloginpage (WebDriver rv) {
	forgetepassowrd=rv.findElement(By.xpath(".//a[contains(text(),'Forgotten password?')]"));
}
public void clicOnforget() {
	forgetepassowrd.click();
}	

}
