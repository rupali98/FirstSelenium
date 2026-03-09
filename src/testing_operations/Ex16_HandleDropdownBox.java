package testing_operations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ex16_HandleDropdownBox 
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
	  
	  WebElement adminPageLink = driver.findElement(By.linkText("Admin Page"));
	  adminPageLink.click();
	  
	  WebElement dropdownElement = driver.findElement(By.id("loanProvider"));
	  
	  Select dropdown = new Select(dropdownElement);
	  
//	  Find default selected dropdown value
	  System.out.println(dropdown.getFirstSelectedOption().getText());
	  
	  Thread.sleep(1000);
	  
//	  Select the value in dropdown
	  dropdown.selectByVisibleText("JMS");
	  
//	  dropdown.selectByValue("jms");
//	  dropdown.selectByIndex(0);
	  
	  WebElement value = driver.findElement(By.xpath("//*[text()='JMS']"));
	  System.out.println("Is element selected -->"+ value.isSelected());
	  System.out.println("Text of value is -->" +value.getText());
	  
	  Thread.sleep(1000);
	  
//	  Dropdown items count
      
	  List<WebElement> count = dropdown.getOptions();
	  int itemscount = count.size();
	  System.out.println(itemscount);
	  
//	  Dropdown item print
	  for(WebElement option : count)
	  {
		  System.out.println(option.getText());
          
		  if(option.getText().equals("Local"))
		  {
			  option.click();
			  break;
		  }
	  }
	  
	  
//	  OR
	
	  for(int i=0;i<itemscount;i++)
	  {
		  System.out.println(count.get(i).getText());
	  }
	 
	  
	  Thread.sleep(1000);
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
