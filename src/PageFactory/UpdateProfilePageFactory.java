package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class UpdateProfilePageFactory {
	public  void UpdateProfilePageFactory() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhishek\\OneDrive\\Desktop\\Selenium Drivers\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		PageFactory.initElements(driver,WithoutFindElement.class);
		
		WithoutFindElement.username.sendKeys("user@phptravels.com");
		WithoutFindElement.password.sendKeys("demouser");
		WithoutFindElement.submit.click();
		
		System.out.println("User Login Successfully ");
		Thread.sleep(3000);
		
		WithoutFindElement.myprofile.click();
		WithoutFindElement.phonenumber.clear();
		WithoutFindElement.phonenumber.sendKeys("9876543210");
		WithoutFindElement.city.clear();
		WithoutFindElement.city.sendKeys("Chennai");
		WithoutFindElement.passwordprofile.sendKeys("demouser");
		WithoutFindElement.sumbitButton.click();
		System.out.println("User Profile Updated Successfully ");
		}
	}