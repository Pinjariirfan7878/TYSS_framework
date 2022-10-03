package Com.TestYantra.GenericLib;

import java.io.FileInputStream;
import java.util.Properties;

public class fileutility {
	
	public String readDataProperty(String key) throws Exception
	{
		FileInputStream fis=new FileInputStream ("../TestYantra/Data/property.properties");

		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
	}

}
