package net.intentmedia.internal.pizzaintent.pageobject;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntentPizzaOrderConfirmationPageObject {
	
	@FindBy(xpath="//html/body/table")
	public WebElement pastOrderTable;
	
	public void findLastEntry(){
		
		List<WebElement> tableRows=pastOrderTable.findElements(By.tagName("tr"));
	
		Iterator<WebElement> iter = tableRows.iterator();
		
		while(iter.hasNext()){
			WebElement s = iter.next();
			if ( ! iter.hasNext()) {
			    // last iteration
			    System.out.println("=================== "+s.getText()+" ===================");
			}
			
		}
		
	}
	
	//init objects on the page
		public IntentPizzaOrderConfirmationPageObject(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		

}
