package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class locators {
	
	static By FlightsLink = By.xpath("//a[@data-name='flights']");
	
	static By FromLocationTab =  By.xpath("//div[@id='s2id_location_from']");
	static By FromLocationInputBox = By.xpath("//input[@id='location_from']");
	static By FromLocationDrpDown = By.xpath("(//div[@class='select2-result-label']/span)[1]");
	
	static By ToLocationTab =  By.xpath("//div[@id='s2id_location_to']");
	static By ToLocationInputBox = By.xpath("//div[@id='select2-drop']/div/input");
	static By ToLocationDrpDown = By.xpath("(//div[@class='select2-result-label']/span)[1]");
	
	
	static By DateTab =  By.xpath("//input[@id='FlightsDateStart']");
	
	static By submitBtn = By.xpath(("(//button[@class='btn-primary btn btn-block' and @type='submit'])[1]"));
	
	static By rowsFlights = By.xpath("//div[@class='theme-search-results-item-flight-section-path-fly-time']");
	
	
	

}
