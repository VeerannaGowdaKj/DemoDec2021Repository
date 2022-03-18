package com.sgtesting.actitests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

public class Tasks extends Initialize{
	
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
	public static void createTask()
	{
		try
		{
			log.info("create task step has started...");
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div[1]/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("time sheet1");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[8]/div/div/div[1]/div[3]/table/tbody/tr[1]/td[5]/div/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]")).click();
			Thread.sleep(2000);
			log.info("create task step has completed successfully...");
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
	public static void deleteTask()
	{
		try
		{	
		log.info("delete task step has started...");
		oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]/div[1]/div[3]/div/div/div[4]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[9]/div/div/div/div[5]/div[1]")).click();
		Thread.sleep(2000);
		log.info("delete task step has completed successfully...");
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
	public static void importTasks()
	{
		try
		{
			log.info("import task step has started...");
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Import tasks from CSV']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			String filename="E:\\ExampleAutomation\\AutoIT\\Sample.csv";
			copyFile(filename);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(500);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(500);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			oBrowser.findElement(By.id("loadTasksFromCSVPopup_commitBtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("closeLoadTasksFromCSVPopupButton")).click();
			Thread.sleep(2000);
			log.info("import task step has completed successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void copyFile(String filepath)
	{
		StringSelection strselection=new StringSelection(filepath);
	//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Clipboard clipboard=toolkit.getSystemClipboard();
		clipboard.setContents(strselection, null);
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
	public static void deleteTasks()
	{
		try
		{
			log.info("delete task step has started...");
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
			Thread.sleep(2000);
			log.info("delete task step has completed successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
