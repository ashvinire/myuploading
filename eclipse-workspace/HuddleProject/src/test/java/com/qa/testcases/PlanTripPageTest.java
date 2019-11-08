package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import com.qa.pages.PlanTripPage;

public class PlanTripPageTest extends TestBase {

	PlanTripPage planTripPage;
	
	@BeforeTest
	public void setUp() {
		System.out.println("I am in BeforeTest");
		planTripPage = new PlanTripPage();
		initialization();
	}

	
	@Test
	public void verifyPlanTrippage() throws InterruptedException {
		
		planTripPage.openPlanTripPage();
		Thread.sleep(3000);
		
		planTripPage.verifyPlanTripTitle();
		Thread.sleep(3000);
	
	
		planTripPage.verifyPlanTripDeparting();
		Thread.sleep(3000);
	
	
		planTripPage.verifyPlanTripDestination();
		Thread.sleep(3000);
		
		
		
		
		/*String date = "15 - October - 2019";
		String dateArray[] = date.split(" - ");
		//String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];
		
		Select myBirthDay = new Select((driver.findElement(By.xpath("/span[@class='rdr-MonthAndYear-month']"))));
		myBirthDay.selectByVisibleText(month);
		
		Select hisBirthDay = new Select((driver.findElement(By.xpath("//span[@class='rdr-MonthAndYear-year']"))));
		hisBirthDay.selectByVisibleText(year);
		Thread.sleep(4000);*/
		
		
		
		
		WebElement slider = driver.findElement(By.xpath("//div[@class='rangeslider rangeslider-horizontal']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(100, 100).release().perform();
		slider.click();
		Thread.sleep(4000);
		
		
		planTripPage.verifyinputPlanTripEmail();
		Thread.sleep(4000);
	
		planTripPage.verifybuttonAwesomeLetsgo();
		Thread.sleep(4000);
			
		
		
	}
	
	@AfterTest
	public void tearDown() {
		closeAndKill();
       }
	
	
	
}
