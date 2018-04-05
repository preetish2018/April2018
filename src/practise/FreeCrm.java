package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FreeCrm {
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
WebElement task=driver.findElement(By.xpath("//a[contains(text(),'Tasks')]"));
task.click();

WebElement createtask=driver.findElement(By.xpath("//a[contains(text(),'New Task')]"));
createtask.click();
	
	WebElement title=driver.findElement(By.id("title"));
	title.sendKeys("CRMAPP");
	
	WebElement deal=driver.findElement(By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[2]/td[1]"
			+ "/table/tbody/tr[9]/td[2]/input[3]"));
	WebElement save=driver.findElement(By.xpath("//*[@id=\"taskForm\"]/table/tbody/tr[7]/td/input"));
	save.click();
	if(deal.isDisplayed()) {
		System.out.println("sucess");
	}
	
	
	
	
	}
}