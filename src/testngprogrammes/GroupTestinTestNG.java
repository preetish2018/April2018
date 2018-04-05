package testngprogrammes;

import org.testng.annotations.Test;

public class GroupTestinTestNG {
  @Test(groups= {"smoke"})
  public void login() {
  System.out.println("login scenario is passed");
  System.out.println("Smoke Test Executed Successfullly");
  }
  @Test(groups= {"regression"})
  public void logout() {
  System.out.println("logout scenario is passed");
  System.out.println("Regression Test Executed Successfullly");
  }

}
