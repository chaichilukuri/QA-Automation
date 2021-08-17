package com.crm.config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
	

private static WebDriver driver;
	
	public static WebDriver getBrowser(String browserType) {
		
		switch(browserType) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\CHAITU\\Testing\\Tools\\drivers\\chromedriver_V92\\chromedriver.exe");
		    ChromeOptions options = new ChromeOptions();
		    options.setAcceptInsecureCerts(true);
		    driver = new ChromeDriver();
		    break;
		    
		case "edge":
			System.setProperty("webdriver.edge.driver", "D:\\CHAITU\\Testing\\Tools\\drivers\\edgedriver_win64\\msedgedriver.exe");
		    driver = new EdgeDriver();
		    break;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return driver;
	}

}
