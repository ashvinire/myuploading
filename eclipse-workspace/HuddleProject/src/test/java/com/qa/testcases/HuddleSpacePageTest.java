package com.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.pages.HuddleSpacePage;

import jdk.nashorn.internal.runtime.options.Options;
import junit.framework.Assert;

public class HuddleSpacePageTest extends TestBase {
	
	HuddleSpacePage huddleSpacePage;
	
	@BeforeTest
	public void setUp() {
		System.out.println("I am in BeforeTest");
		huddleSpacePage = new HuddleSpacePage();
		initialization();

	}

	@Test
	public void verifyHuddlePage() throws InterruptedException {
		Thread.sleep(1000);
		huddleSpacePage.openHuddleSpacePage();
		Thread.sleep(2000);
		System.out.println("I am out of Test");
		
		String textHuddle = huddleSpacePage.verifyHeading();
		Assert.assertEquals("Huddle Space", textHuddle);
		
		String textHuddle2 = huddleSpacePage.verifySubHeading();
		Assert.assertEquals("Add your interests and start scheduling your trip!", textHuddle2);
		
		String textActivity = huddleSpacePage.verifyActivity();
		Assert.assertEquals("Activity Search", textActivity);
		
		huddleSpacePage.verifyCategory();
		Thread.sleep(1000);
		
		huddleSpacePage.clickSearch();
		Thread.sleep(1000);
		
		Actions dragTheElement = new Actions(driver);
		
		dragTheElement.clickAndHold(driver.findElement(By.xpath("//div[contains(text(),'Blue Angel Cafe')]")))
		.moveToElement(driver.findElement(By.xpath("//th[contains(text(),'Huddle Board')]"))).release().build().perform();
		
		
		Thread.sleep(3000);
		
		/*WebElement table = driver.findElement(By.tagName("//div[contains(@class,'content-column pa4 br3 shadow-2')]//table"));
		List<String> columnNames = table.findElements(By.tagName("th"))   // get table headers
                .stream()
                .map()        // get the text
                .map(String::trim)               // trim - no space
                .collect(Collectors.toList());   // collect to a list
*/		
		List<WebElement> tableElement = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tr/th"));
		int size = tableElement.size();
		System.out.println("size of element :"+size);
		
		for(int i= 0;i<size;i++) {
			
			String element = tableElement.get(i).getText();
			System.out.println(element);
		}
	}

	@AfterTest
	public void tearDown() {
		
		closeAndKill();
	}
		
	
}
