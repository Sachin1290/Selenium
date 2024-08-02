package Com.Crm.JavaUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class JavaUtility {

	public static String credentials(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\comp\\Desktop\\Vtiger\\src\\test\\resources\\property.properties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
	}
	public static String randomData(String key) {
		Random r =new Random();

		int num=r.nextInt(1000);
		String data1=String.valueOf("ShriLaptops_"+num);
		return data1;
		
	}

}

