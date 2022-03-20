package com.sgtesting.actitestlevel2;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Customers{
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
	public static void createCustomer(WebDriver oBrowser)
	{
		try
		{
			log.info("Customer craetion has started...");
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Customer");
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("The Customer to old");
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(3000);
			log.info("Customer craetion has completed successfully...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Task List", str);
			System.out.println("The create customer step has executed successfully..");
			Thread.sleep(2000);
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
	public static void modifyCustomer(WebDriver oBrowser)
	{
		try
		{
			log.info("Customer modification has started...");
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("The new Description");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[1]/div[1]")).click();
			Thread.sleep(2000);
			log.info("Customer modification has completed successfully...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Task List", str);
			System.out.println("The modify customer step has executed successfully..");	
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
	public static void deleteCustomer(WebDriver oBrowser)
	{
		try
		{
			log.info("Delete Customer has started...");
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(3000);
			log.info("Customer has deleted successfully...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Task List", str);
			System.out.println("The delete customer step has executed successfully..");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
