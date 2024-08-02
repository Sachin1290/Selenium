package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Crm.BaseClass.BaseClass_Vtiger;
import Com.Crm.Pom.HomePage_Pom;
import Com.Crm.Pom.Organization_Pom;
public class Create_Orgnization extends BaseClass_Vtiger {
	
	
	@Test
	   public void Org() throws IOException {
		HomePage_Pom ref= new HomePage_Pom(driver);
		ref.organizationLink();
		
		Organization_Pom ref2 = new Organization_Pom(driver);
		
		ref2.plus_button();
		ref2.org_name();
		
		ref2.save();
		
	
	}

}
