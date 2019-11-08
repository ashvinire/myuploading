package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	private final String textWelcome_xpath = "//h1[contains(text(),'Plan your next trip with us!!')]";
	private final String chart_class = "chartjs-render-monitor";
	private final String alterText_xpath = "//h3[contains(text(),'Need some inspiration?')]";
	private final String button_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/button[1]";
	
	
	public void openHomePage() {
		driver.get("http://localhost:3000/home");
	}
	
	public String verifyWelcome() {
		
		WebElement elementWelcome = driver.findElement(By.xpath(textWelcome_xpath));
		return elementWelcome.getText();
	}
	
	public String verifyAlter() {
		WebElement elementAlter = driver.findElement(By.xpath(alterText_xpath));
		return elementAlter.getText();
	}
	
	public boolean verifyChart() {
		WebElement elementChart = driver.findElement(By.className(chart_class));
		return elementChart.isDisplayed();
	}
	
	public String verifyButton() {
		WebElement elementBtn = driver.findElement(By.xpath(button_xpath));
		return elementBtn.getText();
	
	}
	
	public void verifyButtonClick() {
		WebElement elementAlreadyMem = driver.findElement(By.xpath(button_xpath));
		elementAlreadyMem.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}