package com.cucumber.scenarios.paprika;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.cucumber.scenarios.paprika" }, format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" })
public class PaprikaTest {

}
