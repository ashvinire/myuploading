package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class PlanTripPage extends TestBase {

	private final String inputPlanTripTitle_xpath = "//input[@placeholder='Trip title']";
	private final String inputPlanTripDeparting_xpath = "//input[@id='departingStation']";
	private final String inputPlanTripDestination_xpath = "//input[@id='destinationStation']";
	
	private final String inputPlanTripCalender_xpath = "//div[@class='rdr-MonthAndYear-innerWrapper']";
	//private final String inputPlanTripSlider_xpath = "//div[@class='rangeslider rangeslider-horizontal']";
	private final String inputPlanTripEmail_xpath = "//input[@placeholder='Email Address']";
	private final String buttonAwesomeLetsgo_xpath = "//button[contains(text(),\"Awesome! Let's go!!\")]";
	
	
	public void openPlanTripPage() {
		driver.get("http://localhost:3000/planTrip");
	}
	
	
	public void verifyPlanTripTitle() {
		WebElement elementInput1 = driver.findElement(By.xpath(inputPlanTripTitle_xpath));
		elementInput1.sendKeys("The Culture Trip");;
	}
	
	public void verifyPlanTripDeparting() {
		WebElement elementInput2 = driver.findElement(By.xpath(inputPlanTripDeparting_xpath));
		elementInput2.sendKeys("San Fransisco Airport");;
	}
	
	
	public void verifyPlanTripDestination() {
		WebElement elementInput3 = driver.findElement(By.xpath(inputPlanTripDestination_xpath));
		elementInput3.sendKeys("Indira Gandhi International Airport");;
	}
	
	public void verifyinputPlanTripEmail() {
		WebElement elementInput4 = driver.findElement(By.xpath(inputPlanTripEmail_xpath));
		elementInput4.sendKeys("xyz@gmail.com");;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void verifybuttonAwesomeLetsgo() {
		WebElement elementInput7 = driver.findElement(By.xpath(buttonAwesomeLetsgo_xpath));
		elementInput7.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
