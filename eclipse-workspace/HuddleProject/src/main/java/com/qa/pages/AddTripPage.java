package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class AddTripPage extends TestBase {

	
	private final String textAddTrip_xpath = "//h1[contains(text(),\"Yaaaay! Let's do it..\")]";
	private final String textSubAddTrip_xpath = "//h3[contains(text(),'To start off please give a title to your trip.')]";
	private final String inputAddTrip_xpath = "//input[@placeholder='Trip Title']";
	private final String buttonAddTrip_xpath = "//button[contains(text(),\"Let's Plan\")]";
	
	
	public void openAddTripPage() {
		driver.get("http://localhost:3000/addTrip");
	}
	
	
public String verifyAddTripText() {
		
		WebElement elementAddTrip = driver.findElement(By.xpath(textAddTrip_xpath));
		return elementAddTrip.getText();
	}
	

public String verifyAddTripText2() {
	
	WebElement elementAddTrip2 = driver.findElement(By.xpath(textSubAddTrip_xpath));
	return elementAddTrip2.getText();
}


public void verifyInput() {
	WebElement elementInput = driver.findElement(By.xpath(inputAddTrip_xpath));
	elementInput.sendKeys("The Culture Trip");;
}

public void verifyLetsgoButn() {
	WebElement elementButon = driver.findElement(By.xpath(buttonAddTrip_xpath));
	elementButon.click();
}
	
}
