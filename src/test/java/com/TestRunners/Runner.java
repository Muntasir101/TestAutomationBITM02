package com.TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="E:\\Training\\PeopleNTech\\BITM Online 2\\AutomationBITM02\\DynamicAutomation\\com.Feature\\LoginTest.feature", glue= {"com.StepDefinition"},

		plugin= {
				"pretty","html:target/HTMLReport.html",
				"json:target/JsonReport.json",
				"junit:target/JUnitReport.xml"
				
		}
		
		
		)

public class Runner {


}
