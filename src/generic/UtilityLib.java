package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityLib {
	
	public static String  getCellValue(String path,String sheet,int r,int c) throws EncryptedDocumentException, InvalidFormatException, IOException
	{	String v=" ";
		try {
	    FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return v;
	}
	
	public static int getRowCount(String path,String sheet)
	{
		int rowCount=0;
		try {
			
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		 rowCount=wb.getSheet(sheet).getLastRowNum();
		}catch(Exception e)
		{
			
		}
		return rowCount;
	}
	
	/*public static void getScreenShot(WebDriver driver,String path)
	{
	try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
		
	}
	catch(Exception e)
	{
		
	}
	}*/
	
	public static String getPropertyValue(String path,String key)
	{
		String v="";
		try {
			
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}catch(Exception e)
		{
			
		}
		
		return v;
	}
	
	
}
