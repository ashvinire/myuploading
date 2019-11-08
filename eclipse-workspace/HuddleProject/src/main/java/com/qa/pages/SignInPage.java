package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class SignInPage extends TestBase {
	
	
	
	private final String textSignIn_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/h2[1]";
	
	
	public void openSignInPage() {
		driver.get("http://localhost:3000/sign-in");
	}
	
	
	public String verifySignInText() {
		
		WebElement elementSignIn = driver.findElement(By.xpath(textSignIn_xpath));
		String textSignIn = elementSignIn.getText();
		return textSignIn;
	}

}
