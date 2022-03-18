package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitests.Customers;
import com.sgtesting.actitests.Initialize;
import com.sgtesting.actitests.LoginLogout;
import com.sgtesting.actitests.Projects;
import com.sgtesting.actitests.Tasks;
import com.sgtesting.actitests.Users;

public class DriverScript {

	public static void main(String[] args) {
		try
		{
			//create user scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Users.createUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeApplication();

			//Modify User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Users.createUser();
			Users.modifyUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//Create Customer Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//Modify Customer Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Customers.modifyCustomer();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//Create Project Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//Modify Project Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Projects.modifyProject();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//Create Task Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Tasks.createTask();
			Tasks.deleteTask();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeApplication();
			
			//Import Tasks Scenarios
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Tasks.importTasks();
			Tasks.deleteTasks();
			LoginLogout.logout();
			Initialize.closeApplication();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
