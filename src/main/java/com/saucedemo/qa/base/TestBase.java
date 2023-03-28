package com.saucedemo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.saucedemo.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  TestBase() {
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream ("C:\\Users\\mohan\\eclipse-workspace\\numpytest\\src\\main\\java\\com\\saucedemo\\qa\\config\\config.properties");
			prop.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		 
		}
		
	}

	public static void intialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
        	driver=new ChromeDriver(options);
			//String url = prop.getProperty("url");
		/*}else if(browserName.equals("FF"));{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\eclipse-workspace\\numpytest\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();*/
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}
	
	
}