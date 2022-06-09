package com.selFrameWorkItlearn.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AllCoursesTestNG {
WebDriver driver;
	
	public AllCoursesTestNG(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}
	@FindBy(xpath="//*[@id=\"left-menu\"]/div[1]/li/a") WebElement overView;
	@FindBy(xpath="//*[@id=\"left-menu\"]/div[2]/li/a") WebElement curriculum;
	@FindBy(xpath="//*[@id=\"left-menu\"]/div[3]/li/a") WebElement comboCourses;
	@FindBy(xpath="//*[@id=\"section-8899\"]/ul/li[1]/a") WebElement testNGIntroduction;
	@FindBy(xpath="//*[@id=\"popup-header\"]/div[2]/div/form/div/button") WebElement anyDoubtButton;
	@FindBy(xpath="//*[@id=\"step1\"]/p") WebElement closePopUp;
	@FindBy(xpath="//*[@id=\"popup-header\"]/div[2]/div/form/button") WebElement completeButton;
	@FindBy(xpath="//*[@id=\"section-8899\"]/h4") WebElement testNG;
	
	
	public void testNGIntro()
	{
		curriculum.click();
		testNG.click();
				testNGIntroduction.click();
		System.out.println("The ppt is shown");
		anyDoubtButton.click();
		closePopUp.click();
		System.out.println("closing the any doubt window");
		completeButton.click();
		System.out.println("The mark complete button clicked");
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		Assert.assertEquals("Great!!! you have completed lesson.Keep learning", alert1.getText());	
		System.out.println("popup text is correct");
	}

}
