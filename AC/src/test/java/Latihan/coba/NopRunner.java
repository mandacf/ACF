package Latihan.coba;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/features/test/coba/SkenarionNopCom.feature"},
glue = "coba",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunner.html",
		"json:target/hrms/jsonreport/LoginRunner.json",
		"junit:target/hrms/junitreport/LoginRunner.xml"})
public class NopRunner extends AbstractTestNGCucumberTests{}
