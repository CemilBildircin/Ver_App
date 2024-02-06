package Vercel_App.ProjectBase.step_definitions;


import Vercel_App.ProjectBase.utilities.BrowserUtils;
import Vercel_App.ProjectBase.utilities.Driver;
import io.cucumber.java.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    private static final Logger LOG = LogManager.getLogger();

    @Before
    public void setUp(Scenario scenario) {
        Driver.getDriver();
        BrowserUtils.myScenario = scenario;
        LOG.info("..........START AUTOMATION.........");

    }

    @After
    public void tearDown(Scenario scenario) {
        // only takes a screenshot when scenario is failed
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        //  Driver.closeDriver();
        LOG.info("..........END AUTOMATION.........");
    }

    // @AfterStep
    public void screenShot(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());
    }
}
