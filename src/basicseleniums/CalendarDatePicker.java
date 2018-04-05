package basicseleniums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarDatePicker {
public WebDriver driver=null;
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		WebElement date=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		//recheck it its not happening
        String dateval="27-02-2018";
        selectDateByJS(driver,date,dateval);
	}
public static void selectDateByJS(WebDriver driver,WebElement element,String dateval) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
}
}
