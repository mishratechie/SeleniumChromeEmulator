package com.OnlyChromeLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome {

	  public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("--no-sandbox");
		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		  WebDriver webdriver = new ChromeDriver(capabilities);
		        
	              
		  webdriver.get("https://en.wikipedia.org/wiki/Main_Page");
		  System.out.println(webdriver.getTitle());
	      Thread.sleep(2000);
	      webdriver.quit();
	      

	    }

	}