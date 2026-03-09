package testing_operations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ex28_HandleSynchronization 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	
	String url = "https://parabank.parasoft.com/parabank";
	
  @Test
  public void f() throws InterruptedException
  {
	  
	driver = new ChromeDriver();
	driver.get(url);
	
//	Page Load Time
//	Selenium 3
//	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	
//	selenium 4
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	
	WebElement aboutUsPage = driver.findElement(By.linkText("About Us"));
	aboutUsPage.click();
	
//	Implicit wait
//	selenium 3
//	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
//	selenium 4
/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement usernameTextbox = driver.findElement(By.name("username"));
	usernameTextbox.sendKeys("john");
	
	WebElement passwordTextbox = driver.findElement(By.name("password"));
	passwordTextbox.sendKeys("demo");
	  
	*/
	
//	Explicit Wait - Type 1
//	selenium 3
//	WebDriverWait wait = new WebDriverWait(driver,15);
	
	/*
	
//	selenium 4
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	  
	WebElement passwordTextbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
	
	passwordTextbox.sendKeys("demo");  
	
//	Explicit Wait - Type 2
//	Thread.sleep(1000);
//	driver.quit();
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
