package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.base.TestBase;

public class HuddleSpacePage extends TestBase {

	//h1[contains(text(),'Huddle Space')]------title
	//p[contains(text(),'Add your interests and start scheduling your trip!')]--------subtitle
	//div[@class='feed_title'] -----activity search name
	
	//input[@placeholder='category'] ---------input category ....clean...sendkeys
	//button[@class='search_btn']  ----search button
	
	
	
	private final String text1_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/h1[1]";
	private final String text2_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/p[1]";
	private final String text3_xpath = "//div[@class='feed_title']  ";
	private final String text4_xpath = "//input[@placeholder='category']";
	private final String text5_xpath = "//button[@class='search_btn']";
	
	
	
	
	public void openHuddleSpacePage() {
		driver.get("http://localhost:3000/huddleSpace ");
	}
	
	public String verifyHeading() {
		WebElement elementHuddleSpace = driver.findElement(By.xpath(text1_xpath));
		return elementHuddleSpace.getText()	;
		}
	
	public String verifySubHeading() {
		WebElement elementHuddleSpace2 = driver.findElement(By.xpath(text2_xpath));
		return elementHuddleSpace2.getText().trim();
		}
	
	
	public String verifyActivity() {
		WebElement elementActivity = driver.findElement(By.xpath(text3_xpath));
		return elementActivity.getText();
		}
	
	public void verifyCategory() {
		WebElement elementCategory = driver.findElement(By.xpath(text4_xpath));
		elementCategory.clear();
		elementCategory.sendKeys("indian food");
		
	}
	public void clickSearch() {
		
		WebElement elementSubmit = driver.findElement(By.xpath(text5_xpath));
		elementSubmit.click();
	}
	
	}
	
	

