package com.runner;

import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = { "pretty", "html:target/html report/cucumber-pretty", "json:target/cucumber.json" }, 
		//future = cucumber maven report
		//why ? for report
		features = {"./Features/ZooplaLogin.feature" }, // feature location
		glue = { "com.stepdef" },// step def code location
		monochrome = true, // read console easily or remove ? mark
		dryRun= false, //why ?=>  to check feature file is correctly written or not , 
		//when => after finish the feature file and before step def code
		strict = true ,
		//why? will check all feature steps has corresponding Automation code there or not
		//When? = after developing step def code
		tags= {"@Smoke"}// only smoke test will run
)

public class ZooplaLoginRunner extends AbstractTestNGCucumberTests {//add testng
	//Hook = any testng annotaion inside runner file
	@BeforeTest
	public void setup() {
		//code = setup browser
		
	}

}
