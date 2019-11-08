package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.SignInPage;
import com.qa.pages.SignUpPage;
import junit.framework.Assert;

public class SignUpPageTest extends TestBase {

	public SignUpPage signUpPage;
	//public SignInPage signInPage;

	@BeforeTest
	public void setUp() {
		System.out.println("I am in BeforeTest");
		signUpPage = new SignUpPage();
		//signInPage = new SignInPage();
		initialization();

	}


	@Test
	public void verifySignUpPage() throws InterruptedException {
		System.out.println("I am in Test");
		
		String signUpText = signUpPage.verifySignUp();
		Assert.assertEquals("Sign Up", signUpText);
		Thread.sleep(1000);
		
		
		String fullText = signUpPage.verifyFullName();
		Assert.assertEquals("FULL NAME", fullText);
		Thread.sleep(1000);

		signUpPage.editFullName();
		Thread.sleep(1000);	
		
		
		
		
		
		String emailText = signUpPage.verifyEmail();
		Assert.assertEquals("E-MAIL ADDRESS", emailText);
		Thread.sleep(1000);
		
		signUpPage.editEmail();
		Thread.sleep(1000);	
		
		
		
		String pwText = signUpPage.verifyPw();
		Assert.assertEquals("PASSWORD", pwText);
		Thread.sleep(1000);
		
		signUpPage.editPw();
		Thread.sleep(1000);	
		
		
		
		
		
		
		
		
		signUpPage.verifycheckBox();
		Thread.sleep(1000);	
		
		
		//signUpPage.verifySighUpButton();
		//Thread.sleep(1000);	
		
		signUpPage.clickAlreadyMem();
		Thread.sleep(3000);		
		
		//String signInText = signInPage.verifySignInText();
		//Assert.assertEquals("Sign In", signInText);
		//Thread.sleep(3000);
	}



	@AfterTest
	public void tearDown() {
		
		closeAndKill();
	}

}




















