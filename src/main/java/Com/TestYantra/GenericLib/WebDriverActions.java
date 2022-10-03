package Com.TestYantra.GenericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverActions extends BaseClassUtilities{
	

	public WebDriverActions(WebDriver driver)
	{
		this.driver=driver;
	}
    public void Maxwindow()
    {
    	driver.manage().window().maximize();
    }
    
    public void EnterUlr(String Url)
    {	
    	driver.get(Url);
    }
    
    public void implicitilyWait(int sec)
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }
}
