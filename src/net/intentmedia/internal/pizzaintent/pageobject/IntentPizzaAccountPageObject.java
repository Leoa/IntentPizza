package net.intentmedia.internal.pizzaintent.pageobject;

import net.intentmedia.internal.pizzaintent.core.LaunchIntentPizzaTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntentPizzaAccountPageObject extends LaunchIntentPizzaTestCases {
	
	
	@FindBy(linkText="Order a pizza")
	public WebElement orderPizzaLink;
	
	@FindBy(linkText="Show ordered pizzas")
	public WebElement showOrderPizzaLink;

	@FindBy(linkText="Edit")
	public WebElement editLink;
	
	@FindBy(xpath="html/body/p[1]")
	public WebElement displayUserName;// contains leondria.barbee@gmail.com
	
	@FindBy(xpath="html/body/img")
	public WebElement displayImage;
	
	public void clickOrderPizzaLink(){
		// IntentPizzaLoginPageObject loginPage = new IntentPizzaLoginPageObject(driver);
		 
		orderPizzaLink.click();	
	}
	
	public void clickShowOrderPizzaLink(){
		showOrderPizzaLink.click();	
	}
	
	public void clickEditLink(){
		editLink.click();	
	}
	
	//init objects on the page
	public IntentPizzaAccountPageObject(WebDriver driver){
			PageFactory.initElements(driver, this);
	}


}
