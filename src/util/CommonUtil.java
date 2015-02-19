package util;

import java.util.Random;
import java.util.concurrent.TimeUnit;
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
	
	 public int randInt(int min, int max) {

	        // Usually this can be a field rather than a method variable
	        Random rand = new Random();

	        // nextInt is normally exclusive of the top value,
	        // so add 1 to make it inclusive
	        int randomNum = rand.nextInt((max - min) + 1) + min;

	        return randomNum;
	    }
	
	

}
