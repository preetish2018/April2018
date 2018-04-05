package testngprogrammes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestNG {
@Test
public void gmailstart() {
	System.out.println("Gmail started");
}

@Test
public void enteruserid() {
	System.out.println("Enter Userid");
	Assert.assertEquals("gudu","gudu1");//assertion will be true
	//Assert.assertEquals("gudu","gudu1");//assertion fails then the next method also fails so to avoid it we use always run=true
}
@Test(dependsOnMethods= {"enteruserid"},alwaysRun=true)//now it will not skip it of assertion getting failed
public void enterpassword() {
	System.out.println("Enter Password");
}

@Test(dependsOnMethods= {"enteruserid","enterpassword"},alwaysRun=true)
public void clicklogin() {
	System.out.println("loggedin");
}

@Test(dependsOnMethods= {"clicklogin"})
public void browserclose() {
	System.out.println("close browser successfully");
}

}
