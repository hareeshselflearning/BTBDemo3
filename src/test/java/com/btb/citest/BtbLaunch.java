package com.btb.citest;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BtbLaunch {
	
	@Test
	public void btbLaunchDemo() throws MalformedURLException, InterruptedException{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		//driver = new ChromeDriver();
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("browserName", "chrome");
		driver = new RemoteWebDriver(new URL("http://54.234.20.23:4444/wd/hub"),cap);
		driver.get("https://bartleby.com");
		Thread.sleep(10000);
		driver.quit();
	}
}
