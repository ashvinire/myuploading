package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.MyTripPage;

import junit.framework.Assert;
public class MyTripPageTest extends TestBase {
	
	MyTripPage myTrip;
	
	
	@BeforeTest
	public void setUp() {
		System.out.println("I am in BeforeTest");
		myTrip = new MyTripPage();
		initialization();
		
	}

	
	@Test
	public void verifyMyTrippage() throws InterruptedException {
		
		myTrip.openMyTripPage();
		
		
		String textMyT = myTrip.verifyMyTripText();
		Assert.assertEquals("Who are you?", textMyT);
		Thread.sleep(1000);
		
		Actions dictatorHover = new Actions(driver);
		dictatorHover.moveToElement(driver.findElement(By.xpath("//div[@class='dib br3 pa3 ma2 grow']//div[@class='Tilt br2 shadow-2']//div")))
		.build().perform();
		Thread.sleep(3000);
		
		Actions democratHover = new Actions(driver);
		democratHover.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'tc')]//div[2]//div[1]//div[1]")))
		.build().perform();
		Thread.sleep(3000);
		
		myTrip.verifyDictator();
		Thread.sleep(4000);
		
	
	
	    
	}

	
	@AfterTest
	public void tearDown() {
		closeAndKill();
		
		
	}
}
