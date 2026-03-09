package Testng_other_operations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex07_02_TestException
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
  
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
//		driver = new HtmlUnitDriver();
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
	}
	
	@Test
  public void f() throws InterruptedException
	{
		WebElement adminPageLink = driver.findElement(By.linkText("Admin Page"));
		adminPageLink.click();
		System.out.println(driver.getTitle());
		
		
    }
	
	@Test
	public void test04() throws InterruptedException
	{
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();
		System.out.println(driver.getTitle());
	}
	
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}
	
}
