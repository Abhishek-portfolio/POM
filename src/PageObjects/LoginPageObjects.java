package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	public static WebElement loginButton(WebDriver driver) {
		return	driver.findElement(By.id("submitBTN"));
		
	}
}