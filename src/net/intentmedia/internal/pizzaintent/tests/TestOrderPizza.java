package net.intentmedia.internal.pizzaintent.tests;

import net.intentmedia.internal.pizzaintent.core.LaunchIntentPizzaTestCases;
import net.intentmedia.internal.pizzaintent.pageobject.IntentPizzaAccountPageObject;
import net.intentmedia.internal.pizzaintent.pageobject.IntentPizzaLoginPageObject;
import net.intentmedia.internal.pizzaintent.pageobject.IntentPizzaNewPizzaOrderPageObject;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.CommonUtil;

public class TestOrderPizza extends LaunchIntentPizzaTestCases {
	
	@Test(priority = -20)
	public void LoginTest(){
		 // go to login page
		 driver.get("http://intent-pizza.internal.intentmedia.net:8080/"); 
		 IntentPizzaLoginPageObject loginPage = new IntentPizzaLoginPageObject(driver);
		 Assert.assertEquals("Intent Pizza" , driver.getTitle());
		 CommonUtil cu = new CommonUtil();
		 loginPage.Login("leondria.barbee@gmail.com", "pizza");
		 cu.WaitForIt(driver);
		 
			
		}
	
	@Test(priority = -19)
	public void AccountPageClickToOrderPizzaTest(){
		 driver.get("http://intent-pizza.internal.intentmedia.net:8080/");
		 IntentPizzaLoginPageObject loginPage = new IntentPizzaLoginPageObject(driver);
		 CommonUtil cu = new CommonUtil();
		 loginPage.Login("leondria.barbee@gmail.com", "pizza");
		 cu.WaitForIt(driver);
		 IntentPizzaAccountPageObject accountPage = new IntentPizzaAccountPageObject (driver);
		 accountPage.clickOrderPizzaLink();
		 cu.WaitForIt(driver);

	}
	
	@Test(priority = -18)
	public void NewPizzaOrderTest(){
		 driver.get("http://intent-pizza.internal.intentmedia.net:8080/");
		 IntentPizzaLoginPageObject loginPage = new IntentPizzaLoginPageObject(driver);
		 CommonUtil cu = new CommonUtil();
		 loginPage.Login("leondria.barbee@gmail.com", "pizza");
		 cu.WaitForIt(driver);
		 IntentPizzaAccountPageObject accountPage = new IntentPizzaAccountPageObject (driver);
		 accountPage.clickOrderPizzaLink();
		 cu.WaitForIt(driver);
		 IntentPizzaNewPizzaOrderPageObject createPizzaPage = new IntentPizzaNewPizzaOrderPageObject(driver);
		 createPizzaPage.CreateNewPizza("Pizza Name", "9x12 in");
		 cu.WaitForIt(driver);
	}

}
