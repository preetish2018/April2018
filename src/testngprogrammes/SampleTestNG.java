package testngprogrammes;

import org.testng.annotations.Test;

public class SampleTestNG {
@Test(invocationCount=3)
public void sampledatatest1() {
	System.out.println("$$$$$$$print my sample data Test1$$$$$$$");
	}

@Test
public void sampledatatest2() {
	System.out.println("$$$$$$$print my sample data Test2$$$$$$$");
	}
@Test
public void sampledata3() {
	System.out.println("$$$$$$$print my sample data Test3$$$$$$$");
	}



}
