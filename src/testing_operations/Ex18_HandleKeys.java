package testing_operations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ex18_HandleKeys
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
	
	String url1 = "https://the-internet.herokuapp.com/key_presses";
	String url2 = "https://the-internet.herokuapp.com/login";
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
//	  driver.get(url1);
	  driver.get(url2);
	  
	  Thread.sleep(2000);

	  
	  //	  URL1 with using Action class
	  Actions action = new Actions(driver);
	  
//	  perform-->performing one key operation
	  
//	  action.sendKeys(Keys.SPACE).perform();
//	  WebElement ele1 = driver.findElement(By.id("result"));
//	  String text = ele1.getText();
//	  assertEquals(text,"You entered: SPACE");
//	  System.out.println(text);
//	  
//	  
//	  
//	  URL2 -Chord(CTRL+Z) without using actions class
	  
	  WebElement ele2 = driver.findElement(By.id("username"));
	  ele2.sendKeys("myuser");
	  Thread.sleep(1000);
	  
	  ele2.sendKeys(Keys.chord(Keys.CONTROL,"z"));
	  Thread.sleep(1000);
	  driver.quit();
	  
	  
  }
}
