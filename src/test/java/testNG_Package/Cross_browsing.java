package testNG_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browsing {
	
		 WebDriver driver;
		 @BeforeTest
		 @Parameters("browser")
		 public <driver> void setup(String browser)throws Exception{
			 
		    if(browser.equalsIgnoreCase("Fire")) {
			  driver=new FirefoxDriver();
			 }
		    else if (browser.equalsIgnoreCase("Chrome")) {
		    	driver=new ChromeDriver();
		    }
		    else if(browser.equalsIgnoreCase("edge")) {
		    	driver=new EdgeDriver();
		    }
		    else {
		    	throw new Exception ("browser not correct");
		    }
		 }
		    @Test
		    public void run() {
		    driver.get("https://www.browserstack.com/");
		    System.out.println("Title is:"+driver.getTitle());
		    driver.quit();
		 }
		 
		 
		}

