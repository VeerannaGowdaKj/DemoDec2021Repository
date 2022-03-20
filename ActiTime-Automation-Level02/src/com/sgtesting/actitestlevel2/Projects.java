package com.sgtesting.actitestlevel2;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Projects{
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
	public static void createProject(WebDriver oBrowser)
	{
		try
		{
			log.info("project creation step has started...");
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/div/div/div[1]/input")).sendKeys("Project");
			oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("This is the dell project");
			oBrowser.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(2000);
			log.info("project creation has been successful...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals(str, "actiTIME - Task List");
			System.out.println("The create project step has executed successefully...");
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
	public static void modifyProject(WebDriver oBrowser)
	{
		try
		{
			log.info("modify project step has started...");
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("The new description");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[1]/div[1]")).click();
			Thread.sleep(2000);
			log.info("modify project step has ended...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals(str, "actiTIME - Task List");
			System.out.println("The modify project step has executed successefully...");
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
	public static void deleteProject(WebDriver oBrowser)
	{
		try
		{
			log.info("project deletion step has started...");
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[4]/div[2]/div[1]/div[3]/div/div/div[5]/div[1]/div/span")).click();
			Thread.sleep(2000);
			log.info("project deletion has successful...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals(str, "actiTIME - Task List");
			System.out.println("The deletion of project step has executed successefully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
