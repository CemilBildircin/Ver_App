package Vercel_App.ProjectBase.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json", //"html:target/cucumber/report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features/",
        glue = "Vercel_App/ProjectBase/step_definitions",
        dryRun = false,
        tags = "@ABButton",
        monochrome = true,
        publish = false // online report in cucumber web.

)
public class CukesRunner {
// mvn test -Dcucumber.filter.tags=@smoke
}

