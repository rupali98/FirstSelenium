package udm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ex01 
{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String chromeDriverPath = System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
	String fireFoxDriverPath = System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver.exe");
	String edgeDriverPath = System.setProperty(fireFoxDriverPath, projectPath+"\\drivers\\msedgedriver.exe");
	
	String url1 = "https://parabank.parasoft.com/parabank/index.htm";
	
//	Way1 (non return)
	public void launchBrowser1()
	{
		driver = new ChromeDriver();
	}
	
	
//	Way2 (return)
	public WebDriver launchBrowser2()
	{
		driver = new ChromeDriver();
		return driver;
	}
	
//	**********************************************************
	
//	Way1(Non return using if-else)
	
	public void launchBrowser3(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
			driver = new ChromeDriver();
		else if(browser.equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
		else if(browser.equalsIgnoreCase("Edge"))
			driver= new EdgeDriver();
		else
		{
			System.out.println("Browser is not applicable");
		}
		
	}
	
	
//	************************************************************
	
//Way 2 (non return using switch case)
	
	public void launchBrowse4(String browser)
	{
		switch(browser)
		{
		case "CHROME":
			driver = new ChromeDriver();
			break;
			
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		
		case "EDGE":
			driver = new EdgeDriver();
			break;
		
		default:
			System.out.println("Browser is not supported");
		}
	}
	
//	********************************************************
	
	
//	Way1(non return - not preffered)
	
	public void launchApp1()
	{
		driver.get(url1);
	}
	
//	Way2(non return-preferred)
	public void launchApp2(String url2)
	{
		driver.get(url2);
	}
	
	
/*	Way1(non return - not preferred)
	public void pageTitle1()
	{
		driver.getTitle();
	}
*/
	
//	Way2 (return -preferred)
	public String pageTitle2()
	{
		return driver.getTitle();
	}
	
//	Way 1(non return)
	public void clickRegister1()
	{
		WebElement registerLink1  = driver.findElement(By.linkText("Register"));
		registerLink1.click();
	}
	
//Way1(non return)
public void clickRegister2(String linkLocator)
{
	WebElement registerLink2 = driver.findElement(By.linkText(linkLocator));
	registerLink2.click();
}

//Way2(return)
public WebElement clickRegister3()
{
	WebElement registerLink3 = driver.findElement(By.linkText("Register"));
	return registerLink3;
}
	
//Way1(non return)
public void enterUsername()
{
	WebElement usernameTextbox = driver.findElement(By.name("username"));
	usernameTextbox.sendKeys("john");
	
}
	
//Way2(return)
public WebElement enterPassword()
{
	WebElement passwordTextbox = driver.findElement(By.name("password"));
	return passwordTextbox;
}
	
//non return
public void enterFirstname(String fname)
{
	WebElement firstnameTextbox = driver.findElement(By.name("customer.firstName"));
	firstnameTextbox.sendKeys(fname);
}

//non return
public void enterLastname(String nameLocator,String lname)
{
	WebElement firstnameTextbox = driver.findElement(By.name(nameLocator));
	firstnameTextbox.sendKeys(lname);
}
	
//Way1(non return)
public void footerText1()
{
	WebElement footerElement1 = driver.findElement(By.className("copyright"));
	String text1 = footerElement1.getText();
	System.out.println(text1);
}

//Way2(return)
public WebElement footerText2()
{
	WebElement footerElement2 = driver.findElement(By.className("copyright"));
	return footerElement2;
}

//Way3 (return)
public String footerText3()
{
	WebElement footerElement3 = driver.findElement(By.className("copyright"));
	String text2 = footerElement3.getText();
	return text2;
}
	
//Way 4 (return)
public WebElement footerText4()
{
	WebElement footerElement4 = driver.findElement(By.className("copyright"));
	String text3 = footerElement4.getText();
	System.out.println(text3);
	return footerElement4;
}
	
//Admin Page Link
public void clickAdminPage()
{
	WebElement adminPage = driver.findElement(By.linkText("Admin Page"));
	adminPage.click();
}
	
//Way 1(npon return)
public void loanProviderDropdown1()
{
	WebElement dropdownElement1 = driver.findElement(By.id("loanProvider"));
	Select dropdown1 = new Select(dropdownElement1);
	dropdown1.selectByVisibleText("JMS");
}
	
//Way1(non return)
public void loanProviderDropdown12(String option)
{
	WebElement dropdownElement2 = driver.findElement(By.id("loanProvider"));
	Select dropdown2 = new Select(dropdownElement2);
	dropdown2.selectByVisibleText(option);
}
	
//Way2(return)
public Select loanProviderDropdown3()
{
	WebElement dropdownElement3 = driver.findElement(By.id("loanProvider"));
	Select dropdown3 = new Select(dropdownElement3);
	return dropdown3;
}
	
//non return
public void closeBrowser()
{
	driver.quit();
}
	
//Driver
public WebDriver getDriver()
{
	return driver;
}
	
	
	
	
	
  @Test
  public void f() {
  }


}
