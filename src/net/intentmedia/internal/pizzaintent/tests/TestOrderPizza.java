package net.intentmedia.internal.pizzaintent.tests;

import net.intentmedia.internal.pizzaintent.core.LaunchIntentPizzaTestCases;
import net.intentmedia.internal.pizzaintent.pageobject.IntentPizzaLoginPageObject;

import org.testng.annotations.Test;

import util.CommonUtil;

public class TestOrderPizza extends LaunchIntentPizzaTestCases {
	
	
	
	  
	@Test
	public void LoginTest(){
		 driver.get("http://intent-pizza.internal.intentmedia.net:8080/");
		 IntentPizzaLoginPageObject loginPage = new IntentPizzaLoginPageObject(driver);
		 CommonUtil cu = new CommonUtil();
		 cu.WaitForIt(driver);
		 cu.WaitForIt(driver);
		 loginPage.fieldEmailLogin.sendKeys("leondria.barbee@gmail.com");
		 loginPage.fieldPasswordLogin.sendKeys("pizza");
		 loginPage.buttonLogin.click();
		 cu.WaitForIt(driver);
		 cu.WaitForIt(driver);
		 
			
		}

}
