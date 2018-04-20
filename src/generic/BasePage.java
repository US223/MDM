package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	WebDriver driver;
	
	
	public BasePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void verifyTitle(String eTitle)
	{
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching:"+ eTitle,true);
				
		}
		catch(Exception e)
		{
			Reporter.log(eTitle + " is not matching  ");
		}
	}

	public void verifyElementisPresent(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
