package Com.Crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Contact_Pom {

	public Contact_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement plusbutton;
	
	private @FindBy (name = "accountname")
	WebElement orgname;
	
	private @FindBy(xpath = "//select[@name='industry']")
	WebElement industries;
	
	
	private @FindBy (xpath = "//input[@accesskey='S']")
	WebElement savebutton;
	
	public void plus_button()
	{
     	plusbutton.click();
	}
	public void org_name(String name) 
	{
	  orgname.sendKeys(name);
	}
	
	public void industries(int i)
	{
		industries.click();
		Select sel = new Select(industries);
		sel.selectByIndex(i);
	}
	
	public void save()
	{
		savebutton.click();
	}
}
