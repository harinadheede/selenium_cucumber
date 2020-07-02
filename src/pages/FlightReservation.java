package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FlightReservation {
	
	static WebDriver driver;
	BrowserInteraction interactions = new BrowserInteraction();
	javaUtilities jutility = new javaUtilities();
	static HashMap<String, String> testdata ;

	/**
	 * will set the driver path and launch the respective browser
	 */
	
	public void intialize_Browser() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * will launch the flight reservation url
	 */
	
	public void launch_Url() {
		
		driver.get("http://phptravels.net/");
	}

	/**
	 * will select the source and destination details provided from the excel test data in the application
	 */
	
	public void selectSourceandDestination() throws IOException {
		interactions.click(driver, locators.FlightsLink);
		
		testdata = readExcel.readexceldata();
	

		interactions.click(driver, locators.FromLocationTab);
		interactions.enterText(driver, locators.FromLocationInputBox, testdata.get("source"));
		interactions.click(driver, locators.FromLocationDrpDown);
		
		interactions.click(driver, locators.ToLocationTab);
		interactions.enterText(driver, locators.ToLocationInputBox, testdata.get("destination"));
		interactions.click(driver, locators.ToLocationDrpDown);
		
		interactions.click(driver, locators.DateTab);
		interactions.moveTOelement(driver, locators.submitBtn);
		String sDate = jutility.returnCurrentDate();
		String[] aDate = sDate.split("/");
		By datexpath = By.xpath("//*[@id='datepickers-container']/div[8]/div/div/div[2]/div[@data-date='"+jutility.removeExtraZeros(aDate[1])+"' "
				+ "and @data-month='"+(Integer.parseInt(jutility.removeExtraZeros(aDate[0]))-1)+"' and @data-year='"+aDate[2]+"']");
		
		interactions.click(driver, datexpath);
		interactions.click(driver, locators.submitBtn);
		
	}
	
	/**
	 * will choose the fastest and the cheapest flight
	 */
	
	public void chooseFlight() throws Exception {
				
		List<WebElement> li = interactions.listofElements(driver, locators.rowsFlights);
		List lDurationTime = new ArrayList<Integer>();		
		for(int i=0;i<li.size();i++) {
			String sDuration = li.get(i).getText();
			String sDurationtrim = sDuration.replaceAll("Trip Duration ", "");
			lDurationTime.add(Integer.parseInt(sDurationtrim));						
		}
		Collections.sort(lDurationTime);
		
		int ifastestflightTime = (int) lDurationTime.get(0);
		
		if(jutility.verifymultipleFastestFlights(ifastestflightTime,lDurationTime)) {
			System.out.println("There is only one fastest flight. Hence we cannot go for price validation");
		}else {
			System.out.println("There are multiple fastest flights");
			List<WebElement> durationli = interactions.listofElements(driver, locators.rowsFlights);
			List lPrice = new ArrayList<Integer>();
			
			for(int i=0;i<durationli.size();i++) {
				String sDuration = durationli.get(i).getText();
				String sDurationtrim = sDuration.replaceAll("Trip Duration ", "");
				int iDuration = Integer.parseInt(sDurationtrim);
				if(ifastestflightTime==iDuration) {
					String sPrice = driver.findElement(By.xpath("(//p[@class='theme-search-results-item-price-tag'])["+(i+1)+"]")).getText();
					
					String[] aTrimPrice = sPrice.split(" ");					
					lPrice.add(Integer.parseInt(aTrimPrice[1]));					
				}			
				
			}
			Collections.sort(lPrice);
			
			int icheapestflightPrice = (int) lPrice.get(0);
			System.out.println(icheapestflightPrice);
			if(jutility.verifymultipleFastestFlights(icheapestflightPrice,lPrice)) {
				System.out.println("There is only one flight with the same cheapest price");
				By FlightBookNowbtn = By.xpath("//strong[contains(text(),'USD "+icheapestflightPrice+"')]/parent::p/parent::div/following-sibling::button");
				interactions.javascriptmoveandClick(driver, FlightBookNowbtn);
			}else {
				System.out.println("There are multiple flights with the same cheapest price");
			}
			
			
		}
		
		
		
	}
	
	/**
	 * will close the browser
	 */
	
	public void close_browser() {
		
		driver.close();
	}

}
