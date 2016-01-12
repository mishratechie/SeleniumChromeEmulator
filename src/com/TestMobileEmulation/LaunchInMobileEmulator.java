package com.TestMobileEmulation;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchInMobileEmulator {

	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
		 
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Google Nexus 5");

		Map<String, Object> chromeOptions = new HashMap<String, Object>();
		chromeOptions.put("mobileEmulation", mobileEmulation);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		WebDriver driver = new ChromeDriver(capabilities);
		
		
		
		driver.get("https://sites.google.com/a/chromium.org/chromedriver/mobile-emulation");
		driver.quit();
		
		
		
	}
}
