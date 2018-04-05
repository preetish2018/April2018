package basicseleniums;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleBootStrapDropdown {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.findElement(By.xpath("//button[contains(@class,'multiselect ')]")).click();
	//customize xpath for bootstrap dropdown
	List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
    System.out.println(list.get(i).getText());		
    //to select a particular value
if(list.get(i).getText().equals("Angular")) {
	list.get(i).click();
	break;
}
	}
	
	}

}
