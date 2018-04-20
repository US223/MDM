package com.teradata.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class LoginPage extends BasePage {

	
	@FindBy(id="username")
	private WebElement unTXB;
	
	@FindBy(name="pwd")
	private WebElement pwTXB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	 
	@FindBy(xpath="//span[contains(.,'Username ')]")
	private WebElement errMSG;
	
	final String xp1="(//nobr[contains(.,'actiTIME ')])[1]";
	@FindBy(xpath=xp1)
	private WebElement actiTIMEVERSION;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void setUserName(String un)
	{
		unTXB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTXB.sendKeys(pw);
	}
	
    public void clickOnLoginButton()
    {
    	loginBTN.click();
    }
    
    public void  verifyErrorIsDisplayed()
    {
    	verifyElementisPresent(errMSG);
    }
	
	public String getVersion()
	{
		return actiTIMEVERSION.getText();
	}

}
