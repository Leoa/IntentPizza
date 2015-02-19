package net.intentmedia.internal.pizzaintent.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IntentPizzaLoginPageObject {
	
	public static final String PAGE_TITLE="Intent Pizza";
	public static final String PAGE_URL="http://www.intent-pizza.internal.intentmedia.net:8080";
	
	
	@FindBy(id="user_session_email")
	public WebElement fieldEmailLogin ;
	
	@FindBy(id="user_session_password")
	public WebElement fieldPasswordLogin;
	
	@FindBy(name="commit")
	public WebElement buttonLogin;
	
	//init objects on the page
	public IntentPizzaLoginPageObject(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

}