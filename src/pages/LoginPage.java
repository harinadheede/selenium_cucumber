package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	 WebDriver driver;
	
	/*
	 * 
	 */
	public void set_txt_UserName(String userName){
		System.out.println("set_txt_UserName");	
		driver.findElement(By.name("userName")).sendKeys(userName);
	}	
	
	/*
	 * 
	 */
	public void set_txt_Password(String password){
		System.out.println("set_txt_Password");		
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	/*
	 * 
	 */
	public void click_SignIn(){
		System.out.println("click_SignIn");		
		driver.findElement(By.name("login")).click();
	}	
	
	/*
	 * 
	 */
	public boolean verifyPage_HomePage(){
		System.out.println("verifyPage_HomePage");		
		return true;
	}
	
	/*
	 * 
	 */
	public void launch_Browser(){
		System.out.println("navigateTo_LoginPage");	
		initializeWebDriver();
	}
	
	/*
	 * 
	 */
	public boolean navigateTo_LoginPage(){
		System.out.println("navigateTo_LoginPage");			
		navigateToURL("http://newtours.demoaut.com/");
		return true;
	}
	
	/*
	 * 
	 */
	public boolean navigateTo_HomePage(){
		System.out.println("navigateTo_HomePage");	
		return true;
	}
	
	/***********************************************************/
	/*
	 * 
	 */
	private void initializeWebDriver(){		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.manage().window().maximize();
	}
	
	/*
	 * navigateToURL
	 */
	private void navigateToURL(String URL){
		driver.navigate().to(URL);
		
	}
	
	
}
