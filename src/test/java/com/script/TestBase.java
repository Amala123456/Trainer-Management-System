package com.script;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class TestBase {
		WebDriver driver;
	    public static Properties prop = null;
	    String driverPath = "E:\\Automation\\eclipse-workspace\\TrainerManagementSystem\\src\\test\\resources\\chromedriver.exe";
      public static void Testbase() {
	        try {
	            prop = new Properties();
	            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources" + "/config.properties");
	            prop.load(ip);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    } 
	 @BeforeTest
	 public void onSetup() {
	    Testbase(); 
	    String browserName = prop.getProperty("browser");

	    if (browserName.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", driverPath);
	        driver = new ChromeDriver();

	    }
	    else if (browserName.equals("firefox")) {
	    	//geckodriver
	    	System.setProperty("webdriver.gecko.driver", driverPath);
	        driver = new FirefoxDriver();
	    }
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
	    driver.manage().window().maximize();   
	}
	
	@AfterTest
	public void quitBrowser() throws IOException {
	
	   driver.close();
	}


}
