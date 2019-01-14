package com.techfundas.demoframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	@Test
	
	
	public void validateLaunch() {
		
		String env= "winChromepath";
		String winChromepath= "C:/Users/Jai/eclipse-workspace/demoframework/src/test/java/resources/chromedriver.exe";
		String linuxChromepath="C:/Users/Jai/eclipse-workspace/demoframework/src/test/java/resources/chromedriver";
		
		if(env.equals("winChromepath")) {
		System.setProperty("webdriver.chrome.driver", winChromepath);
		}else {
		System.setProperty("webdriver.chrome.driver", linuxChromepath);
		}
			
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Jai/eclipse-workspace/demoframework/src/test/java/resources/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.ap7am.com/telugu-videos-1-all-videos.html");
		
		System.out.println("Chrome Browser launched");
	
	}
	
	 
	@AfterClass
	
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
