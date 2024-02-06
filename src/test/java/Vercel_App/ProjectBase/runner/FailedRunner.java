package Vercel_App.ProjectBase.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-reports.html",
                "json:target/json-reports/json-report"},
        features = "@target/rerun.txt/",
        glue = "Vercel_App/ProjectBase/step_definitions",
        monochrome = true,
        publish = false // if true --> creates cucumber report online in cucumber web.

)
public class FailedRunner {
}
