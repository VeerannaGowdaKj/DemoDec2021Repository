package com.sgtesting.actitests;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginLogout extends Initialize{
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
	public static void login()
	{
		try
		{
			log.info("Login to acti time as admin started...");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			log.info("Acti time login was successful...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Enter Time-Track", str);
			System.out.println("The login Step has executed successfully..");
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
	public static void logout()
	{
		try
		{
			log.info("Logout has been initiated by the admin...");
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			log.info("The logout has been sucussefully completed....");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", str);
			System.out.println("The logout Step has executed successfully..");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
