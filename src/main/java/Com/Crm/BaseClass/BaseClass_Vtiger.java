package Com.Crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Com.Crm.JavaUtility.JavaUtility;
import Com.Crm.Pom.LoginPage_Pom;


public class BaseClass_Vtiger {

public WebDriver driver;
	
	
	
	@BeforeClass
	public void preCondition() throws IOException
	{
		String browser = JavaUtility.credentials("browser");
		String url = JavaUtility.credentials("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeOptions option=new ChromeOptions();
     		option.addArguments("disable-notifications");

			driver=new ChromeDriver(option);
		}
		else if (browser.equalsIgnoreCase("edge")) 
		{
			driver=new EdgeDriver();
		}
		else if (browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException
	{
		LoginPage_Pom ref=new LoginPage_Pom(driver);
		ref.UserName();
		ref. Password();
		ref.loginButton();
	}
	
@AfterMethod
public void logout()
{
      LoginPage_Pom ref2=new LoginPage_Pom(driver);
      ref2.click1();
      ref2.click1();
      
}

@AfterClass
public void postCondition()
{
	driver.quit();
}

}

