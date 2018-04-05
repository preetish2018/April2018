package basicseleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GeniusXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","H:\\testing tools videos\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
		//driver.findElement(By.xpath("//button[@class='btn']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gudu1990");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gudu1990@");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
	}

}
