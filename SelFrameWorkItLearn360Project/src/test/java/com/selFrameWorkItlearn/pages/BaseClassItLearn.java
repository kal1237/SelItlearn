package com.selFrameWorkItlearn.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.selFrameWorkItlearn.utility.BrowserFactory;
import com.selFrameWorkItlearn.utility.ConfigDataProviderItlearn;
import com.selFrameWorkItlearn.utility.ExcelDataProviderItlearn;

public class BaseClassItLearn {
	
	
	
	public WebDriver driver;
	public ConfigDataProviderItlearn config;
	public ExcelDataProviderItlearn excel;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite()
	{
		
		config=new ConfigDataProviderItlearn();
		excel=new ExcelDataProviderItlearn();
		ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/report.html"));
		report=new ExtentReports();
		report.attachReporter(extent);
	}
	@BeforeClass
	public void setUp()
	
	{
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getappURL());
		
	}
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	@AfterMethod
	public void tearDownMethod()
	{
		report.flush();   
	}

}
