package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AddTripPage;


import junit.framework.Assert;

public class AddTripPageTest extends TestBase  {

      AddTripPage addTrip;
	
	
	@BeforeTest
	public void setUp() {
		System.out.println("I am in BeforeTest");
		addTrip = new AddTripPage();
		initialization();
	}
	
	@Test
	public void verifyAddTrippage() throws InterruptedException {
		
		addTrip.openAddTripPage();
		
		
		String textAddT = addTrip.verifyAddTripText();
		Assert.assertEquals("Yaaaay! Let's do it..", textAddT);
		Thread.sleep(1000);
	
		addTrip.verifyInput();
		Thread.sleep(3000);
		
		
		addTrip.verifyLetsgoButn();
		Thread.sleep(2000);
		
	
	
	    
	}

	
	@AfterTest
	public void tearDown() {
		closeAndKill();
       }
}