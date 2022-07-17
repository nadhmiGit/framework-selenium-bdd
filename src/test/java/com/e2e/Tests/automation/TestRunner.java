package com.e2e.Tests.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/specs/features"},
		plugin = {"pretty", "html:target/cucumber-html-report"},
		snippets = SnippetType.CAMELCASE,
		tags = {("@accueil")}
		)

public class TestRunner {

}
