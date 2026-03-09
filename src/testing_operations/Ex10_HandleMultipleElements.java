package testing_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex10_HandleMultipleElements 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  
	  WebElement registerPageLink = driver.findElement(By.linkText("Register"));
	  registerPageLink.click();
	  
	  Thread.sleep(1000);
	  
	  List<WebElement> textBoxList = driver.findElements(By.className("input"));
	  int textBoxCount = textBoxList.size();
	  System.out.println(textBoxCount);
	  
	  textBoxList.get(4).sendKeys("myadd");
	  Thread.sleep(2000);

	  textBoxList.get(5).sendKeys("mycity");
	  Thread.sleep(5000);
	  
	  driver.quit();
  }
}


