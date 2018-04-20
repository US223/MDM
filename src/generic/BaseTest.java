package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import generic.IAutoConst;
import generic.UtilityLib;

public class BaseTest implements IAutoConst {
	public WebDriver driver;
	
	@BeforeSuite
	public void initApp()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@BeforeMethod
	public void OpenApp()
	{
		String url=UtilityLib.getPropertyValue(CONFIG_PATH, "url");
		 driver=new ChromeDriver();
		driver.get(url);
	}

}
