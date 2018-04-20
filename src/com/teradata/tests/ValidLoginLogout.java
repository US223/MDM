package com.teradata.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.teradata.pages.EnterTimeTrackPage;
import com.teradata.pages.LoginPage;

import generic.BaseTest;
import generic.UtilityLib;

public class ValidLoginLogout extends BaseTest {

	

	

	@Test(priority=1)
		
	public void testLoginLogout() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		String un=UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
		System.out.println(un);
		String pw=UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
		String hp=UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 2);
		String lp=UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 3);
		LoginPage l=new LoginPage(driver);
		
		//enter username
		l.setUserName(un);
		
		//enter password
		l.setPassword(pw);
		//click on login button
		l.clickOnLoginButton();
		
	/*	//verify homepage is displayed
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.verifyTitle(hp);
		//click logout
		e.clickOnLogoutButton();
		//verify that login page is displayed
		l.verifyTitle(lp);
*/
	}
}
