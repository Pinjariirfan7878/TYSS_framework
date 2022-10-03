package Com.Object_Repro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	
	@FindBy (xpath="//input[@name='user_name']") private WebElement username;
	@FindBy(xpath="//input[@name='user_password']") private WebElement password;
	@FindBy(xpath="//input[@id='submitButton']") private  WebElement submitButton;
	

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	public void getlogin(String Username,String Password) 
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		submitButton.click();
	}
	
	
	
 }
