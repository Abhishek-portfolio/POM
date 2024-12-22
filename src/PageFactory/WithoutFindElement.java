package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WithoutFindElement {

	// LoginPage 
	@FindBy(how=How.ID,using ="email")
	public static WebElement username;
	
	@FindBy(id = "password")
	public static WebElement password;
	
	@FindBy(id ="submitBTN")
	public static WebElement submit;
	
	//UpdateProfile
	@FindBy(xpath ="/html/body/main/div/div/div/div[2]/ul/li[3]/a")
	public static WebElement myprofile;
	
	
	@FindBy(name = "password")
	public static WebElement passwordprofile;
	
	@FindBy(id ="Phone")
	public static WebElement phonenumber;
	
	@FindBy(id = "City")
	public static WebElement city;
	
	@FindBy(xpath ="//*[@id=\"profile\"]/div/div[6]/button")
	public static WebElement sumbitButton;
}
