package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactory.WithoutFindElement;
import PageObjects.LoginPageObjects;
import PageObjects.UpdateProfileObject;

public class UpdateProfileTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\OneDrive\\Desktop\\Selenium Drivers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);	
		
		LoginPageObjects.username(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.loginButton(driver).click();
		

		System.out.println("SuccessfullLogin");
		
		Thread.sleep(3000);
		UpdateProfileObject.myprofile(driver).click();
		UpdateProfileObject.phonenumber(driver).clear();
		UpdateProfileObject.phonenumber(driver).sendKeys("9876543210");
		UpdateProfileObject.city(driver).clear();
		UpdateProfileObject.city(driver).sendKeys("Chennai");
		UpdateProfileObject.sumbit(driver).click();
		
		System.out.println("Profile Updated Successfully");
		
		
//		driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[3]/div[2]/div/div/button")).click();
//		driver.findElement(By.xpath("/html/body/main/div/div/section/div/div/div/div/div/div[2]/form/div/div[3]/div[2]/div/div/button")).click();
//		driver.findElement(By.id("bs-select-1-99"));
//		driver.findElement(By.xpath("//*[@id=\"Phone\"]")).click();
//		driver.findElement(By.id("Phone")).clear();
//		driver.findElement(By.id("Phone")).sendKeys("9876543210");
//		driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[4]/div[1]/div/div/button")).click();
//		driver.findElement(By.id("bs-select-2-99")).click();
//		driver.findElement(By.id("State")).clear();
//		driver.findElement(By.id("State")).sendKeys("TamilNadu");
//		driver.findElement(By.id("City")).clear();
//		driver.findElement(By.id("City")).sendKeys("KingsLanding");
//		driver.findElement(By.id("Address")).clear();
//		driver.findElement(By.id("Address")).sendKeys("123,4th street kingslanding");
//		driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div[6]/button")).click();

	}

}
