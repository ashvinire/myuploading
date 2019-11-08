package com.qa.testcases;

import java.awt.Point;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;

import junit.framework.Assert;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
	HashMap<String, String> hm = new HashMap<String, String>();

	@BeforeTest
	public void setUp() {
	System.out.println("I am in BeforeTest");
	
		homePage = new HomePage();
		initialization();
		
		hm.put("textWelcomeInHM", "Plan your next trip with us!!");
		hm.put("textAlterInHM", "Need some inspiration?");
        hm.put("textButtonInHM", "Maybe,Somewhere else");
	}


	@Test
	public void verifyHomePage() throws InterruptedException {
		
		homePage.openHomePage();
		
		String textWelcome = homePage.verifyWelcome();
		Assert.assertEquals(hm.get("textWelcomeInHM"), textWelcome);
		Thread.sleep(1000);
		
		String textAlter = homePage.verifyAlter();
		Assert.assertEquals(hm.get("textAlterInHM"), textAlter);
		Thread.sleep(1000);
		
		String textButton = homePage.verifyButton();
		Assert.assertEquals(hm.get("textButtonInHM"), textButton);
		Thread.sleep(1000);
		
		                //hover action
	
		Actions chartHover = new Actions(driver);
		chartHover.moveToElement(driver.findElement(By.xpath("//div[@class='chartjs-size-monitor-expand']")))
		.build().perform();
		Thread.sleep(4000);
		
		//driver.findElement(By.linkText("New York")).click();
		//Thread.sleep(2000);
		
		
		homePage.verifyButtonClick();
		Thread.sleep(2000);
		
		
		
	}

	@AfterTest
	public void tearDown() {
      closeAndKill();
	}

}
