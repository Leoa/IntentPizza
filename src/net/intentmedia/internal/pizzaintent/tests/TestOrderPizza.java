package net.intentmedia.internal.pizzaintent.tests;

import net.intentmedia.internal.pizzaintent.core.LaunchIntentPizzaTestCases;
import org.testng.annotations.Test;

public class TestOrderPizza extends LaunchIntentPizzaTestCases {
	
	@Test
	public void runtest(){
		//driver.navigate().refresh();
		 driver.get("http://intent-pizza.internal.intentmedia.net:8080/");
		 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}

}
