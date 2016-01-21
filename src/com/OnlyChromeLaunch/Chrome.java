package com.OnlyChromeLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome {

	  public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
		  System.setProperty("webdriver.chrome.logfile", "ChromeDriver/chromedriver.log");
		  ChromeOptions options = new ChromeOptions();
		  options.setBinary("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		  options.addArguments("--no-sandbox");
		  options.addArguments("start-maximized");
		  
		  //Complete list of Arguments you can pass is here
		  //http://peter.sh/experiments/chromium-command-line-switches/
		  
		  //All about chrome capabilities
		  //https://sites.google.com/a/chromium.org/chromedriver/capabilities
		 
		  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		  capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		  WebDriver webdriver = new ChromeDriver(capabilities);
		        
	              
		  webdriver.get("https://en.wikipedia.org/wiki/Main_Page");
		  System.out.println(webdriver.getTitle());
	      Thread.sleep(2000);
	      webdriver.quit();
	      

	    }

	}
