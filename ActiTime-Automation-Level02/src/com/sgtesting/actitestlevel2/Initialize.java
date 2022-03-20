package com.sgtesting.actitestlevel2;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Initialize {
	public static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("Step Executed:");
	/**
	 * Testcase ID:
	 * Testcase Name:
	 * Created By:
	 * Reviewed By:
	 * Reviewed Date:
	 * Return Value
	 * Parameters:
	 * Purpose:
	 * Description:
	 */
	public static WebDriver launchBrowser()
	{
		try
		{
			log.info("launching browser started...");
			String strPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", strPath+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			log.info("launching browser successful...");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return oBrowser;
	}
	
	/**
	 * Testcase ID:
	 * Testcase Name:
	 * Created By:
	 * Reviewed By:
	 * Reviewed Date:
	 * Return Value
	 * Parameters:
	 * Purpose:
	 * Description:
	 */
	public static void navigate(WebDriver oBrowser)
	{
		try
		{
			log.info("Navigation of URL started...");
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
			log.info("Acti time URL navigated successfully...");
			
			String Actualstr=oBrowser.getTitle();
			String Expectedstr="actiTIME - Login";
			Assert.assertEquals(Actualstr, Expectedstr);
			System.out.println("The navigation Step has executed successfully..");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Testcase ID:
	 * Testcase Name:
	 * Created By:
	 * Reviewed By:
	 * Reviewed Date:
	 * Return Value
	 * Parameters:
	 * Purpose:
	 * Description:
	 */
	public static void closeApplication(WebDriver oBrowser)
	{
		try
		{
			log.info("Initiated to close the chrome broweser....");
			oBrowser.quit();
			log.info("The chrome browser has successfully closed....");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
