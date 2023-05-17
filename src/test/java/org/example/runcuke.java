package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@register", plugin = {"pretty", "html:target/cucumber-html-report.html"})
class Runcuke {

}

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@email", plugin = {"pretty", "html:target/cucumber-html-report.html"})
public class runcuke {

}