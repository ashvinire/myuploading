package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.SignInPage;
import com.qa.pages.SignUpPage;

import junit.framework.Assert;

public class SignInPageTest extends TestBase{

	public SignUpPage signUpPage;
	public SignInPage signInPage;
	
	@BeforeTest
	public void setUp() {
		System.out.println("I am in BeforeTest");
		signUpPage = new SignUpPage();
		signInPage = new SignInPage();
		initialization();

	}
	
	@Test
	public void verifySignInPage() throws InterruptedException {
		System.out.println("I am in Test");
		

		signInPage.openSignInPage();
		
		
		String signInText = signInPage.verifySignInText();
		Assert.assertEquals("Sign In", signInText);
		Thread.sleep(1000);
		
		signUpPage.editEmail();
		Thread.sleep(1000);	
		
		signUpPage.editPw();
		Thread.sleep(1000);	
	
}
	
	
	@AfterTest
	public void tearDown() {
      closeAndKill();
	}
}
