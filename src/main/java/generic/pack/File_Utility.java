package generic.pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility implements IPathConstant {
	
	public String getPropertyKey(String key) throws IOException {
		
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;}

}
