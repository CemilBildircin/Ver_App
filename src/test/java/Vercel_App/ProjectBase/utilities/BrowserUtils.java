package Vercel_App.ProjectBase.utilities;

import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;


public class BrowserUtils {


    public static Scenario myScenario;

    public static void takeScreenshot() {
        try {
            myScenario.log("Current url is: " + Driver.getDriver().getCurrentUrl());
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            myScenario.attach(screenshot, "image/png", myScenario.getName());
        } catch (WebDriverException wbd) {
            wbd.getMessage();
        } catch (ClassCastException cce) {
            cce.getMessage();
        }
    }

    /**
     * validates if the driver switched to expected URL title
     *
     * @param driver
     * @param expectedUrl
     * @param expectedTitle Implements assertion
     * @by Cemm
     */

    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl, String expectedTitle) {
        expectedTitle = expectedTitle.toLowerCase();
        expectedUrl = expectedUrl.toLowerCase();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)) {
                break;
            }
        }
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    /**
     * Switch to the new window by the exact title
     * returns to original window if the window given title not found
     *
     * @param driver
     * @param targetTitle
     * @by Cemm
     */

    public static void switchToWindow(WebDriver driver, String targetTitle) {

        String origin = driver.getWindowHandle();
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            if (driver.getTitle().contains(targetTitle)) {
                return;
            }
        }
        driver.switchTo().window(origin);
    }

    /**
     * @param driver
     * @param expectedTitle returns void, assertion is implemented
     * @by Cem
     */
    public static void validateTitle(WebDriver driver, String expectedTitle) {

        assertTrue(driver.getTitle().contains(expectedTitle));
    }

    public static void loopLinkCLick(String nameOfPage) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//a[.='" + nameOfPage + "']"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    /**
     * Moves the mouse to given element
     *
     * @param element on which to hover
     * @by Cem
     */
    public static void hoverOver(WebElement element) {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element).perform();
    }

    /**
     * Scroll to the element
     *
     * @param element
     * @by Cem
     */
    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Clicks on an element using JavaScript Executer
     *
     * @param element
     * @by Cem
     */

    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].click();", element);
    }

    /**
     * Performs double click action on an element
     *
     * @param element
     * @by Cem
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }

    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return element
     * @by Cem
     */

    public static WebElement waitForVisibilityOfElement(WebElement element, int timeToWaitInSec) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));

    }

    /**
     * Waits for provided element to be clickable
     *
     * @param element
     * @param timeToWaitInSec
     * @by Cem
     */

    public static WebElement waitForClickable(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * performs a pause
     *
     * @param seconds
     * @by Cem
     */
    public static void justWait(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * prints Webelement list
     *
     * @param myList
     * @by Cem
     */
    public static void printList(List<WebElement> myList) {

        for (WebElement each : myList) {
            System.out.println(each.getText());
        }

    }

    /**
     * @param elements
     * @return
     */
    public static List<String> getElementsText(List<WebElement> elements) {
        List<String> elementsText = new ArrayList<>();
        for (WebElement element : elements) {
            elementsText.add(element.getText());
        }
        return elementsText;
    }
    public static List<String> getElementsTextWithStream(List<WebElement> elements) {
        return elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public static List<String> getElementsTextWithStream2(List<WebElement> elements) {
        return elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }


    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            LOG.info("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeOutInSeconds));
            wait.until(expectation);
        } catch (Throwable error) {
            LOG.info(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }

    public static void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            try {
                element.isDisplayed();
                break;
            } catch (StaleElementReferenceException st) {
                y++;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (WebDriverException we) {
                y++;
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static final Logger LOG = LogManager.getLogger();
    public static void createFileWithContent(String filePath, String content) {
        File file = new File(filePath);

        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            try {
                fw.write(content);
            } catch (Exception e) {
                LOG.debug("Error during FileWriter append. " + e.getMessage(), e.getCause());
            } finally {
                try {
                    fw.close();
                } catch (Exception e) {
                    LOG.debug("Error during FileWriter close. " + e.getMessage(), e.getCause());
                }
            }

        } catch (IOException e) {
            LOG.debug(e.getMessage(), e.getCause());
        }
    }



}
