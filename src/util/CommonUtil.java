package util;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import net.intentmedia.internal.pizzaintent.core.LaunchIntentPizzaTestCases;

import org.openqa.selenium.WebDriver;

public class CommonUtil{
	
	public void WaitForIt(WebDriver driver){
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void MaxWindow(WebDriver driver){
		 driver.manage().window().maximize();
	}
	
	public void Refresh(WebDriver driver){
		driver.navigate().refresh();
	}

}
