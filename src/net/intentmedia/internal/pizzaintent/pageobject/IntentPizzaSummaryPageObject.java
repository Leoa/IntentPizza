package net.intentmedia.internal.pizzaintent.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import net.intentmedia.internal.pizzaintent.core.LaunchIntentPizzaTestCases;
import net.intentmedia.internal.pizzaintent.dataobject.IntentPizzaData;

public class IntentPizzaSummaryPageObject extends LaunchIntentPizzaTestCases{
	
	
	
/*	@FindBy(xpath="/html/body/p")
	public WebElement textPizzaName;*/
	
	/*@FindBy(xpath="/html/body/p[2]")
	public WebElement textPizzaSize;*/
	
	@FindBy(linkText="Order this pizza")
	public WebElement  orderPizzaLink;
	
	public void confirmPizza(){
		 // login
		IntentPizzaData ipd= new IntentPizzaData();
		//textPizzaName.getText().contains("Pizza");
		//textPizzaSize.getText().contains( "12");
		
	}
	
	public void clickOrderPizzaLink(){
		orderPizzaLink.click();	
	}
	
	//init objects on the page
	public IntentPizzaSummaryPageObject(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	

}
