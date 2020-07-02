package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserInteraction {
	
	public void click(WebDriver driver,By element) {
		
		driver.findElement(element).click();
	}
	
	public void enterText(WebDriver driver,By element,String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	public void moveTOelement(WebDriver driver,By element) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(element)).build().perform();
		
	}
	
	public List<WebElement> listofElements(WebDriver driver,By element){
		
		List<WebElement> li = driver.findElements(element);
		
		return li;
		
		
	}
	
	public void javascriptmoveandClick(WebDriver driver,By element) {
		
		WebElement ele = driver.findElement(element);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		
	}
}
