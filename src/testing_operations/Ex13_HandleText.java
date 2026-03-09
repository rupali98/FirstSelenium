package testing_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex13_HandleText 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath +"\\drivers\\chromedriver.exe");
	String url = "https://parabank.parasoft.com/parabank/index.htm";
	
  @Test
  public void f() throws InterruptedException
  {
	  driver = new ChromeDriver();
	  driver.get(url);
	  
	  Thread.sleep(1000);
	  
//	  Page text
	  
	  WebElement footerTextElement = driver.findElement(By.className("copyright"));
	  String footerText = footerTextElement.getText();
	  System.out.println(footerText);
	  
	  Thread.sleep(1000);
	  
	  
//	  Page text with tag
	  WebElement textElement = driver.findElement(By.tagName("h2"));
	  String text = textElement.getText();
	  System.out.println(text);
	  
	  Thread.sleep(1000);
	  
//	  User entered text
//	  getAttribute(value)
	  
	  WebElement userText = driver.findElement(By.name("username"));
	  userText.sendKeys("John");
	  String enteredText = userText.getAttribute("value");
	  System.out.println(enteredText);
	  
	  
//	  Link text
	  WebElement textLink = driver.findElement(By.linkText("Forgot login info"));
	  String linkText = textLink.getText();
	  System.out.println(linkText);
	  
//	  All links text
	  List<WebElement> links =driver.findElements(By.tagName("a"));
	  int linksCount = links.size();
	  System.out.println(linksCount);
	  
	  
	  for(int i=0;i<linksCount;i++)
	  {
		  System.out.println(links.get(i).getText());
		  
	  }
	  
//	  OR
	  
//	*  for(WebElement link:links)
//	  {
//		  System.out.println(link.getText());
//	  }
	  
//	 *
	  
	  System.out.println("************************");
	  
//	  getAttribute(href)
	  
	  for(int i=0;i<linksCount;i++)
	  {
		  System.out.println(links.get(i).getAttribute("href"));
	  }
	  
	  Thread.sleep(1000);
	  
	  System.out.println("************************");
	  
	  driver.navigate().to("https://www.facebook.com/");
	  
	  Thread.sleep(1000);
	  
//	  getAttribute(placeholder)
	  
	  WebElement email = driver.findElement(By.name("email"));
	  String placeHolderText =email.getAttribute("placeholder");
	  
	  System.out.println(placeHolderText);
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
	  
	  
	  
  }
}
