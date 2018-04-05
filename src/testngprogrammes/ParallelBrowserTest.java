package testngprogrammes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelBrowserTest {
@Test
@Parameters("Browser")
public void startBrowser(String browser) {
	if(browser.equalsIgnoreCase("firefox")) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	}
	else if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "‪‪H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.sbi.co.in");
	}
	else if(browser.equalsIgnoreCase("InternetExplorer")){
		System.setProperty("webdriver.ie.driver","H:\\testing tools videos\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get("http://learn-automation.com/");
	}
	else {
		WebDriver driver=null;
		driver.close();
	}}}
