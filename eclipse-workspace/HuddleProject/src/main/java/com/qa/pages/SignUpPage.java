package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;


//class
public class SignUpPage extends TestBase {
	private final String textSignUp_xpath = "//h2[contains(text(),'Sign Up')]";
	private final String alreadyMember_xpath = "//a[@class='FormField__Link']";
	//input[@id='name'] ------full name enter
	//input[@id='email'] -------email enter
	//input[@id='password']  -----pw enter
	//input[@name='hasAgreed'] ------check agreement box
	//button[@class='FormField__Button mr-20'] ------sigh uip button
	
	
	private final String fullName_xpath = "//input[@id='name']";
	private final String emailspace_xpath = "//input[@id='email']";
	private final String checkbox_xpath = "//input[@name='hasAgreed']";
	private final String signUpbutton_xpath = "//button[@class='FormField__Button mr-20']";
	private final String pw_xpath = "//input[@id='password']";
	
	
	
	public void openHomePage() {
		driver.get("http://localhost:3000/");
	}
	
	
    public String verifySignUp() {
		
		WebElement elementSignUp = driver.findElement(By.xpath(textSignUp_xpath));		
		String textSignUp = elementSignUp.getText();
		return textSignUp;
	}
    
    
    
    
public String verifyFullName() {
		
		WebElement elementFullname = driver.findElement(By.xpath("//label[contains(text(),'Full Name')]"));		
		String textFullname = elementFullname.getText();
		return textFullname;
	}

public void editFullName() {
	
	WebElement elementEditFullname = driver.findElement(By.xpath(fullName_xpath));		
	elementEditFullname.sendKeys("David Cena");
}






public String verifyEmail() {
	
	WebElement elementEmail = driver.findElement(By.xpath("//label[contains(text(),'E-Mail Address')]"));		
	String textEmail = elementEmail.getText();
	return textEmail;
}
    
public void editEmail() {
	
	WebElement elementEditEmail = driver.findElement(By.xpath(emailspace_xpath));		
	elementEditEmail.sendKeys("xyz@gmail.com");
}







public String verifyPw() {
	
	WebElement elementPw = driver.findElement(By.xpath("//label[contains(text(),'Password')]"));		
	String textPw = elementPw.getText();
	return textPw;
}
    
public void editPw() {
	
	WebElement elementEditEmail = driver.findElement(By.xpath(pw_xpath));		
	elementEditEmail.sendKeys("lovecoding");
}








public void verifycheckBox() {
	
	WebElement elementCheck = driver.findElement(By.xpath(checkbox_xpath));
	elementCheck.click();
}
    
    
public void verifySighUpButton() {
	
	WebElement elementSighupButton = driver.findElement(By.xpath(signUpbutton_xpath));
	elementSighupButton.click();
}


	public void clickAlreadyMem() {
		
		WebElement elementAlreadyMem = driver.findElement(By.xpath(alreadyMember_xpath));
		elementAlreadyMem.click();
	}



	

}
