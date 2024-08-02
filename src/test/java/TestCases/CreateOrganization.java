package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClass_Vtiger;
import Com.Crm.Pom.HomePage_Pom;

public class CreateOrganization extends BaseClass_Vtiger {

	@Test
	public void organization ()  throws IOException,InterruptedException{
		HomePage_Pom ref1= new HomePage_Pom(driver);
		ref1.organizationLink();
	
	}
	
}
