package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\Work_P\\gitRepo\\WETESTERR-MENTEE-YOGESH\\TestNG_learning\\src\\data.properties");
		prop.load(fis);
		prop.getProperty("browser");
		prop.setProperty("browser", "firefox");
		FileOutputStream fos=new FileOutputStream("D:\\Work_P\\gitRepo\\WETESTERR-MENTEE-YOGESH\\TestNG_learning\\src\\data.properties");
		prop.store(fos, null);
	}

}
