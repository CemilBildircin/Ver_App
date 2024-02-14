package Vercel_App.ProjectBase.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-reports.html",
                "json:target/json-reports/json-report.json",
                "rerun:target/rerun.txt", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:13"},
        features = "src/test/resources/features/",
        glue = "Vercel_App/ProjectBase/step_definitions",
        dryRun = false,
        tags = "@smoke",
        monochrome = true,
        publish = false // online report in cucumber web.

)
public class CukesRunner {

}

