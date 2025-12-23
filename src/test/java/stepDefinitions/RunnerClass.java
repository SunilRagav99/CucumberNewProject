package stepDefinitions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true ,dryRun = false,publish = true  ,monochrome = false,plugin = {"pretty","json:target\\output.json"},name = {"Verifying Valid Credentials"},glue= "stepDefinitions",features = "src\\test\\resources\\Feature")
public class RunnerClass {
	
	
	@AfterClass
	public static void afterClass() {		
		Reporting.generateJvmReport("target\\output.json");

}
}
	