package com.sgtesting.actitestlevel2;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Users{
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
	public static void createUser(WebDriver oBrowser)
	{
		try
		{
			log.info("Creating a new user....");
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("demo");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("demoUser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("welcome123");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			log.info("User has created successfully...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - User List", str);
			System.out.println("The create user Step has executed successfully..");
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
	public static void modifyUser(WebDriver oBrowser)
	{
		try
		{
			log.info("Modifying the user step has started the user...");
			oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/input")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/input")).sendKeys("user1@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[1]/div[10]/div[1]/div[2]/table/tbody/tr/td[2]/div[1]")).click();
			Thread.sleep(3000);
			log.info("Modifying the user step has ended the user...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - User List", str);
			System.out.println("The modify user Step has executed successfully..");
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
	public static void deleteUser(WebDriver oBrowser)
	{
		try
		{
			log.info("Deleting the user...");
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(3000);
			log.info("The user was deleted successfully...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - User List", str);
			System.out.println("The delete user Step has executed successfully..");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
