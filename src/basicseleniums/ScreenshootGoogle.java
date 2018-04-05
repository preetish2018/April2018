package basicseleniums;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScreenshootGoogle {
	@Test
	 public void TestJava()
	{
	
	 WebDriver driver=new FirefoxDriver();
	 
	ScreenshootGoogle.captureScreenShot(driver,"openfirefox");
	driver.manage().window().maximize();
	ScreenshootGoogle.captureScreenShot(driver,"maximizewindow");
	
	driver.get("http://www.google.com");
	ScreenshootGoogle.captureScreenShot(driver,"fetchurl");
	}
	//for single screen shot
	/*File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	 
	FileUtils.copyFile(src, new File("C:\\Users\\GUDU\\Desktop\\My eclipse Fundamentals\\error.png"+System.currentTimeMillis()+".png"));
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }*/
	//For multi screen shot reusing methods
	public static void captureScreenShot(WebDriver driver,String filename){
		// Take screenshot and store as a file format             
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);           
		try {
		// now copy the  screenshot to desired location using copyFile method
		 
		FileUtils.copyFile(src, new File("C:/Users/GUDU/Desktop/My eclipse Fundamentals"+System.currentTimeMillis()+".png"));                              } catch (IOException e)
		 
		{
		  System.out.println(e.getMessage()) ;
		 }
}
}