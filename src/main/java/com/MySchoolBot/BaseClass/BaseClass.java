package com.MySchoolBot.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.MySchoolBot.utils.TestUtils;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() {
		try {
		prop = new Properties();
		
		File file = new File("G:\\pomframework\\OPMGoogle\\src\\main\\java\\com\\MySchoolBot\\properties\\configure.properties");
		
			FileInputStream fi = new FileInputStream(file);
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void openbrowser() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\pomframework\\OPMGoogle\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "G:\\pomframework\\OPMGoogle\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "G:\\pomframework\\OPMGoogle\\Drivers\\IEDriverserver.exe");

			driver=new InternetExplorerDriver();
		}
		else if(browsername.equals("opera")) {
			System.setProperty("webdriver.opera.driver", "G:\\pomframework\\OPMGoogle\\Drivers\\operadriver.exe");

			driver= new OperaDriver();
		}
		else if(browsername.equals("safarri")) {
			driver=new SafariDriver();
		}
		else {
			System.out.println("Please Enter Browser name in Properties file");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PageTimeLoad, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.implicitywait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
