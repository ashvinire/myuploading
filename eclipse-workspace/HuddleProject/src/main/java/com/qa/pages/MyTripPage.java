package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class MyTripPage extends TestBase{
	
	//h1[contains(text(),'Who are you?')]
	//div[@class='dib br3 pa3 ma2 grow']//div[@class='Tilt br2 shadow-2']//div    ----hover,img, click (dictator)
	//div[contains(@class,'tc')]//div[2]//div[1]//div[1]   ---------hover,img,click  (democrat)
	
	private final String textmyTrip_xpath = "//h1[contains(text(),'Who are you?')]";
	private final String dictatormyTrip_xpath = "//div[@class='dib br3 pa3 ma2 grow']//div[@class='Tilt br2 shadow-2']//div";
	private final String democratmyTrip_xpath = "//div[contains(@class,'tc')]//div[2]//div[1]//div[1]";
	
	public void openMyTripPage() {
		driver.get("http://localhost:3000/myTrips");
	}
	
public String verifyMyTripText() {
		
		WebElement elementMyTrip = driver.findElement(By.xpath(textmyTrip_xpath));
		return elementMyTrip.getText();
	}
	
public void verifyDictator() {
	WebElement elementDictator = driver.findElement(By.xpath(dictatormyTrip_xpath));
	elementDictator.click();
}
	
public void verifyDemocrat() {
	WebElement elementDemocrat = driver.findElement(By.xpath(democratmyTrip_xpath));
	elementDemocrat.click();
}	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


