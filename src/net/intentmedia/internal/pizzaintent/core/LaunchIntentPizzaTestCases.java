package net.intentmedia.internal.pizzaintent.core;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/*
 * Date:2-18-2015
 * Author: Leondria Barbee
 * Description: This script launches 3 browsers to run an automated test simultaneously
 * */
public class LaunchIntentPizzaTestCases {
	
	protected WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeMethod
	public  void launchBrowser(@Optional  String browser){
		System.out.println( "the browser is " +browser);
		if(browser.equalsIgnoreCase("Chrome")){
			File file = new File ("C:\\Users\\Leondria\\Documents\\workspace\\chromeDrver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();			
		}
		
		else if(browser.equalsIgnoreCase("FF")){
			//FF driver no need to call an exe
			driver = new FirefoxDriver();		
		}
		
		else if(browser.equalsIgnoreCase("IE")){
			File file = new File("C:\\Users\\Leondria\\Documents\\workspace\\IEdriver\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
			DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
			//If IE fail to work, please remove this and remove enable protected mode for all the 4 zones from Internet options
			dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);  
			driver= new InternetExplorerDriver(dc);
		}
		
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
		
	}
	
	@AfterMethod
	public void closeBrowser() throws Exception{
		
		driver.close();
		driver.quit();
		
	}

}
