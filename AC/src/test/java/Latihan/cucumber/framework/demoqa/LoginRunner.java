package Latihan.cucumber.framework.demoqa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/features/hrms/Login.feature"},
glue = "Latihan.cucumber.framework.demoqa",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunner.html",
		"json:target/hrms/jsonreport/LoginRunner.json",
		"junit:target/hrms/junitreport/LoginRunner.xml"})
public class LoginRunner extends AbstractTestNGCucumberTests{}