package com.huddle.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/home");
		
		WebElement subHeading = driver.findElement(By.xpath("//h3[contains(text(),'Need some inspiration?')]"));
		String textOfWebElement = subHeading.getText();
		
	
		WebElement buttonOfWebElement = driver.findElement(By.xpath("//button[contains(text(),'Maybe,Somewhere else')]"));
		String textOfWebElement2 = buttonOfWebElement.getText();
		
		driver.findElement(By.xpath("//button[contains(text(),'Maybe,Somewhere else')]")).click();
		
		
		
		System.out.println("text present on  button is: "+textOfWebElement);
		System.out.println("-------------------------------------------------");
		System.out.println("text present on  button is: "+textOfWebElement2);
		
		
		Thread.sleep(8000);
		
		driver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
