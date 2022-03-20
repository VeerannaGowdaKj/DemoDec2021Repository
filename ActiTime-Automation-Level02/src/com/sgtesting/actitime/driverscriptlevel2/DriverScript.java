package com.sgtesting.actitime.driverscriptlevel2;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitestlevel2.Customers;
import com.sgtesting.actitestlevel2.Initialize;
import com.sgtesting.actitestlevel2.LoginLogout;
import com.sgtesting.actitestlevel2.Projects;
import com.sgtesting.actitestlevel2.Tasks;
import com.sgtesting.actitestlevel2.Users;

public class DriverScript {
	public static void main(String[] args) {
		WebDriver oBrowser=null;
		try
		{
			//create user scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			Users.createUser(oBrowser);
			Users.deleteUser(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);

			//Modify User Scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			Users.createUser(oBrowser);
			Users.modifyUser(oBrowser);
			Users.deleteUser(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);
			
			//Create Customer Scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			Customers.createCustomer(oBrowser);
			Customers.deleteCustomer(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);
			
			//Modify Customer Scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			Customers.createCustomer(oBrowser);
			Customers.modifyCustomer(oBrowser);
			Customers.deleteCustomer(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);
			
			//Create Project Scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			Customers.createCustomer(oBrowser);
			Projects.createProject(oBrowser);
			Projects.deleteProject(oBrowser);
			Customers.deleteCustomer(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);
			
			//Modify Project Scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			Customers.createCustomer(oBrowser);
			Projects.createProject(oBrowser);
			Projects.modifyProject(oBrowser);
			Projects.deleteProject(oBrowser);
			Customers.deleteCustomer(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);
			
			//Create Task Scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			Customers.createCustomer(oBrowser);
			Projects.createProject(oBrowser);
			Tasks.createTask(oBrowser);
			Tasks.deleteTask(oBrowser);
			Projects.deleteProject(oBrowser);
			Customers.deleteCustomer(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);
			
			//Import Tasks Scenarios
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			Tasks.importTasks(oBrowser);
			Tasks.deleteTasks(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
