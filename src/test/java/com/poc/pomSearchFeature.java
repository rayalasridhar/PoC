package com.poc;

import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import io.selendroid.standalone.SelendroidConfiguration;
public class pomSearchFeature {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
  }

  
  @Given("^I Validate the Web Elements on Home Page$")
  public void i_Validate_the_Web_Elements_on_Home_Page() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
	  WebDriver drvr=new FirefoxDriver();
	  drvr.get("https://www.nationalmerit.org");
	  
      throw new PendingException();
  }

  @When("^I key Text in Search Text Box and Click Search icon$")
  public void i_key_Text_in_Search_Text_Box_and_Click_Search_icon() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }

  @Then("^I verify the displayed results$")
  public void i_verify_the_displayed_results() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }


  public void testRunner() throws Exception {
	  SoapUIProTestCaseRunner runner = new SoapUIProTestCaseRunner();
	  runner.setProjectFile("SoapUIWorkspace/Sample-soapui-project.xml");
	  runner.setPrintReport(true); 
	  runner.run();
	  }
  
  @AfterTest
  public void afterTest() {
  }

}
