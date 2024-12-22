package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfileObject {

	public static WebElement myprofile(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/ul/li[3]/a"));
		
	}
	public static WebElement phonenumber(WebDriver driver) {
		return driver.findElement(By.id("Phone"));
	}
	public static WebElement city (WebDriver driver) {
		return driver.findElement(By.id("City"));
	}
	public static WebElement sumbit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/button"));
		
	}
}
