package testngprogrammes;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DisableATestcase {
@Test(priority=1)
public void openbrowser() {
	System.out.println("Browser opened");
	
}
@Test(priority=3)
public void clickonsubmitbutton() {
	System.out.println("submitted successfully");
	
}

@Test(priority=2)
public void enetervalidcredentials() {
	System.out.println("valid credentials submitted");
	Assert.assertEquals("Gmail","Gmail");
}
//@Test(priority=4,enabled=false)
@Test(priority=4)//for skipping a test case we can write enabled =false or throw new SkipException
public void closebrowser() {
	System.out.println("Browser closed");
	//throw new SkipException("Terminate my browser");
}


}
