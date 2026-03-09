package testing_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex07_HandleDisplayWebItems 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
  
	@Test
  public void f() throws Exception
{
		
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
		
//		capture current url
		String pageURL = driver.getCurrentUrl();
		System.out.println("Parabank page URL is -->" +pageURL);
		
		
//		capture Page Title
		String pageTitle = driver.getTitle();
		System.out.println("Parabank page title is -->" +pageTitle);
		
		
//		capture page source
		
		String pageSourceCode = driver.getPageSource();
		System.out.println("Parabank page source is -->" +pageSourceCode);
		
		
		driver.quit();
		
		
		
}
}
