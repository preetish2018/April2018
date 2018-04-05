package mytest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise {

	public static  void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/");
		Thread.sleep(4000);
			
		driver.findElement(By.linkText("Tools")).click();
		
		driver.findElement(By.linkText("Send 18GB Data")).click();
		
		
		
//		Runtime.getRuntime().exec("C:\\Users\\Mukesh_50\\Desktop\\My blog\\AutoIT\\fileUpload3.exe"+" "+"C:\\Users\\Mukesh_50\\Downloads\\VerifyTitle.java");
//		 
//		Thread.sleep(2000);
//		 
//		driver.findElement(By.xpath(".//*[@id='1']")).click();
//		 
//		Thread.sleep(2000);
//		 
//		Runtime.getRuntime().exec("C:\\Users\\Mukesh_50\\Desktop\\My blog\\AutoIT\\fileUpload3.exe"+" "+"C:\\Users\\Mukesh_50\\Downloads\\HATHWAY.txt");
		}
		}


