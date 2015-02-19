package net.intentmedia.internal.pizzaintent.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.intentmedia.internal.pizzaintent.core.LaunchIntentPizzaTestCases;
import net.intentmedia.internal.pizzaintent.dataobject.IntentPizzaData;

public class IntentPizzaNewPizzaOrderPageObject extends LaunchIntentPizzaTestCases {
	
	@FindBy(id="pizza_name")
	public WebElement fieldPizzaName;
	
	@FindBy(id="pizza_size")
	public WebElement fieldPizzaSize;
	
	@FindBy(name="commit")
	public WebElement buttonCreateNewPizza;
	
	public void CreateNewPizza(String pizzaName, String pizzaSize){
		 // create a new pizza
		IntentPizzaData  ipd = new IntentPizzaData();
		ipd.setPizzaName(pizzaName);
		ipd.setPizzaSize(pizzaSize);
		 
		 fieldPizzaName.sendKeys(pizzaName);
		 fieldPizzaSize.sendKeys(pizzaSize);
		 buttonCreateNewPizza.click();
		 
	}
	
	//init objects on the page
	public IntentPizzaNewPizzaOrderPageObject(WebDriver driver){
			PageFactory.initElements(driver, this);
	}

}
