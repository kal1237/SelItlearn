package com.selFrameWorkItlearn.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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

	public void allCourses()
	{
		
	}
	
	public void softwareTestingAcademy()
	{
		
	}
}
