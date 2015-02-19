package net.intentmedia.internal.pizzaintent.tests;

import net.intentmedia.internal.pizzaintent.core.LaunchIntentPizzaTestCases;
import net.intentmedia.internal.pizzaintent.pageobject.IntentPizzaLoginPageObject;

import org.testng.annotations.Test;

import util.CommonUtil;

public class TestOrderPizza extends LaunchIntentPizzaTestCases {
	
	IntentPizzaLoginPageObject loginPage = new IntentPizzaLoginPageObject(driver);
	
	@Test
	public void runtest(){
		 driver.get("http://intent-pizza.internal.intentmedia.net:8080/");
		 loginPage.fieldEmailLogin.sendKeys("leondria.barbee@gmail.com");
		 loginPage.fieldPasswordLogin.sendKeys("pizza");
		 loginPage.buttonLogin.click();
		 
			
		}

}
