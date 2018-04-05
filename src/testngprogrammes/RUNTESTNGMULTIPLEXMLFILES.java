package testngprogrammes;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

//its a comple java class we are using
public class RUNTESTNGMULTIPLEXMLFILES {
public static void main (String[]args) {
	//create object of testng class
	TestNG runner=new TestNG();
	//create list of strings
	List<String>suitexmlfiles=new ArrayList<String>();
	//add xml file which we have executed
	suitexmlfiles.add("C:\\Users\\GUDU\\eclipse-workspace\\Gudu\\testxmlsuites\\crossbrowser.xml");
	suitexmlfiles.add("C:\\Users\\GUDU\\eclipse-workspace\\Gudu\\testxmlsuites\\dependency.xml");
   //setting xmlfile for execution
	runner.setTestSuites(suitexmlfiles);
    //call for run
    runner.run();


}
}
