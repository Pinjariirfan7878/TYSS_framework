package Com.TestYantra.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com.Object_Repro.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassUtilities {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void ConnectToDB()
	{
		System.out.println("connected To DataBase");
	}
	
	@AfterSuite
	public void DiscoonecToDB() 
	{
		System.out.println("Disconnected from DataBase");
	}
	
	@BeforeClass
	public void lauchBrowser() throws Exception
	{
		fileutility futil=new fileutility();
		String browser=futil.readDataProperty("Browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
		}
		else
		{
			System.out.println("Please Enter valid Browser Name");
		}
		
		WebDriverActions webaction=new WebDriverActions(driver);
		webaction.Maxwindow();
		webaction.EnterUlr("http://localhost:8888/index.php?action=Login&module=Users");
		webaction.implicitilyWait(20);
		
	}
	
	@AfterClass
	public void close_Browser()
	{
	   //driver.close();
	   
	}
	
	@BeforeMethod
	public void LoginToApp()
	{
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getlogin("admin","admin");
	}
	
    @AfterMethod
	public void Logout()
	{
	
	}
	
	
	
	
	
	
	
	
	
	

}
