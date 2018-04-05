package basicseleniums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("gudu1990");
		driver.findElement(By.name("password")).sendKeys("gudu1990@");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		//Method 1 by xpath
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		String before_xpath=".//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath="]/td[2]/a";
		for(int i=4;i<=7;i++) {
			String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			
			if(name.contains("test2 test2")) {
				driver.findElement(By.xpath(".//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
			}
			
		}
		
		
		
		//driver.close();

	}

}
