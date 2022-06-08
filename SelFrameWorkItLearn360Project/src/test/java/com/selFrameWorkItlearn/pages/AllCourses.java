package com.selFrameWorkItlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AllCourses {
	WebDriver driver;
	
	public AllCourses(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}

	@FindBy(xpath="//*[@id=\"primary_menu\"]/a") WebElement allCourses;
	@FindBy(id="menu-course-menu") WebElement navigationElement;
	@FindBy(xpath="//*[@id=\"nav-menu-item-23203\"]/a/div") WebElement navigationElement1;
	@FindBy(xpath="//*[@id=\"nav-menu-item-34626\"]/a/div/span") WebElement popularCourses;
	@FindBy(xpath="//*[@id=\"nav-menu-item-7397\"]/a/div/span") WebElement softwareTestAcademy;
	@FindBy(xpath="//*[@id=\"nav-menu-item-12355\"]/a/div/span") WebElement automationTestingwithTestNG;
	@FindBy(xpath="//*[@id=\"nav-menu-item-12360\"]/a/div/span")WebElement automationWithSeleniumWebDriver;
	@FindBy(xpath="//*[@id=\"nav-menu-item-23203\"]/a/div/span") WebElement jiraforSoftwareTesters;
	@FindBy(xpath="//*[@id=\"nav-menu-item-30109\"]/a/div/span")WebElement seleniumWebDriverwithPython;
	@FindBy(xpath="//*[@id=\"nav-menu-item-23157\"]/a/div/span")WebElement qAManualTester;
	@FindBy(xpath="//*[@id=\"nav-menu-item-21621\"]/a/div/span") WebElement javaforAutomationTesting;
	@FindBy(xpath="//*[@id=\"nav-menu-item-12348\"]/a/div/span") WebElement jmeterforPerformanceTestingAdvanced;
	@FindBy(xpath="//*[@id=\"nav-menu-item-12349\"]/a/div/span") WebElement SoapUIWebServicesTesting;
	@FindBy(xpath="//*[@id=\"nav-menu-item-19329\"]/a/div/span") WebElement apache_Maven_with_Eclipse;
	@FindBy(xpath="//*[@id=\"nav-menu-item-12352\"]/a/div/span") WebElement automation_Testing_with_Cucumber;
	
	
	
	public void allCourses()
	{
		 System.out.println("All courses");
		 allCourses.click();
		 Actions action=new Actions(driver);
		 action.moveToElement(navigationElement).build().perform();
		 softwareTestAcademy.click();
		 System.out.println("softwareTestAcademy is clicked");
		 Assert.assertEquals("POPULAR COURSES", popularCourses.getText());
		 System.out.println("Expected title is correct");
		 action.moveToElement(navigationElement1).build().perform();
		 automationTestingwithTestNG.click();
		 
		 
		 
}
}
