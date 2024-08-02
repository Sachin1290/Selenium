package Com.Crm.Pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.Crm.JavaUtility.JavaUtility;

public class Organization_Pom {
	 public Organization_Pom(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	
	private @FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement plusbutton;
	
	private @FindBy (name = "accountname")
	WebElement orgname;
	
	
	private @FindBy (xpath = "//input[@accesskey='S']")
	WebElement savebutton;
	
	private @FindBy (className  = "dvHeaderText")
	WebElement header;
	
	private @FindBy(name="industry")
	WebElement industry;
	
	
	public void plus_button()
	{
     	plusbutton.click();
	}
	public void org_name()throws IOException 
	{
	 String name =JavaUtility.randomData("data1");
		orgname.sendKeys(name);
	}
	
	public void save()
	{
		savebutton.click();
	}
	public void indDropdown() {
		
		Select s=new Select(industry);
	s.selectByValue("Banking");
	}
	public void headerText() {
		
	}
}
