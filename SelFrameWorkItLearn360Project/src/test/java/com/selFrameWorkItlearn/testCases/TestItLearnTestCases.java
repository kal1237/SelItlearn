package com.selFrameWorkItlearn.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selFrameWorkItlearn.pages.AllCourses;
import com.selFrameWorkItlearn.pages.BaseClassItLearn;
import com.selFrameWorkItlearn.pages.LoginPage;

public class TestItLearnTestCases extends BaseClassItLearn{

	@Test(priority=1)
	public void loginItLearn()
	{
		logger=report.createTest("Login to ItLearn Portal");
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		logger.info("Starting Application");
		lp.loginDetails(excel.getStringData("login", 0, 0),excel.getStringData("login", 0, 1));
		logger.pass("Login was successfull");

	}

	@Test(dependsOnMethods="loginItLearn")
	public void allCourses()
	{
		logger=report.createTest("All courses test case 1");
		AllCourses ac1=PageFactory.initElements(driver,AllCourses.class);
		logger.info("Starting Application");
		ac1.allCourses();
		logger.pass("TestCase1 was successfull");
		
	}
@Test(dependsOnMethods="allCourses")
	public void automationTestingWithTestNG()
	{
		System.out.println("clicking on automationTestingWithTestNG");
		logger=report.createTest("All courses test case 2");
		AllCourses ac2=PageFactory.initElements(driver,AllCourses.class);
		logger.info("Starting Application");
		ac2.automationTestingWithTestNG();
		logger.pass("TestCase2 was successfull");
		
	}
}
