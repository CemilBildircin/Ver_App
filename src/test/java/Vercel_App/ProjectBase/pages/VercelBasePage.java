package Vercel_App.ProjectBase.pages;

import Vercel_App.ProjectBase.utilities.BrowserUtils;
import Vercel_App.ProjectBase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;
import java.util.List;

public class VercelBasePage {
    @FindBy(xpath = "//a[@href='ab-test.html' and contains(.,'A/B Testing')]")
    private WebElement ABButton;

    public WebElement getABButton() {
        return ABButton;
    }

    @FindBy(xpath = "//div[@class='example']//following-sibling::h3")
    private WebElement noABtext;

    public WebElement getNoABtext() {
        return noABtext;
    }


    @FindBy(xpath = "//a[@href='add-remove-elements.html']")
    private WebElement addRemove;


    @FindBy(xpath = "//li[@class='list-group-item']")
    private List<WebElement> menuItems;


    @FindBy(linkText = "Autocomplete")
    private WebElement autoComplete;


    @FindBy(linkText = "Basic Auth")
    private WebElement basicAuth;


    @FindBy(linkText = "Broken Images")
    private WebElement brokenImages;


    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDom;


    @FindBy(xpath = "//a[@href='checkboxes.html' and contains(.,'Checkboxes')]")
    private WebElement checkBoxes;


    @FindBy(linkText = "Context Menu")
    private WebElement ContextMenu;


    @FindBy(linkText = "Disappearing Elements")
    private WebElement DisappearingElements;


    @FindBy(linkText = "Drag and Drop")
    private WebElement dragAndDrop;


    @FindBy(linkText = "Dropdown")
    private WebElement dropDown;


    @FindBy(linkText = "Dynamic Content")
    private WebElement dynamicContent;


    @FindBy(linkText = "Dynamic Controls")
    private WebElement dynamicControls;


    @FindBy(linkText = "Dynamic Loading")
    private WebElement dynamicLoading;


    @FindBy(linkText = "Entry Ad")
    private WebElement entryAd;


    @FindBy(linkText = "Exit Intent")
    private WebElement exitIntent;


    @FindBy(linkText = "File Download")
    private WebElement fileDownload;


    @FindBy(linkText = "File Upload")
    private WebElement fileUpload;


    @FindBy(linkText = "Floating Menu")
    private WebElement floatingMenu;


    @FindBy(linkText = "Forgot Password")
    private WebElement forgotPassword;


    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthentication;


    @FindBy(linkText = "Frames")
    private WebElement frames;


    @FindBy(linkText = "Horizontal Slider")
    private WebElement horizontalSlider;


    @FindBy(linkText = "Hovers")
    private WebElement hovers;


    @FindBy(linkText = "Infinite Scroll")
    private WebElement infiniteScroll;


    @FindBy(linkText = "Inputs")
    private WebElement inputs;


    @FindBy(linkText = "JavaScript Alerts")
    private WebElement javaScriptAlerts;


    @FindBy(linkText = "Key Presses")
    private WebElement keyPresses;


    @FindBy(linkText = "Multiple Buttons")
    private WebElement multipleButtons;


    @FindBy(linkText = "Multiple Windows")
    private WebElement multipleWindows;


    @FindBy(linkText = "Nested Frames")
    private WebElement nestedFrames;


    @FindBy(linkText = "Radio Buttons")
    private WebElement radioButtons;


    @FindBy(xpath = "//button[@class='btn btn-primary' and contains(.,'Add Element')]")
    private WebElement addElementButton;


    @FindBy(xpath = "//button[@class='added-manually btn btn-secondary' and contains(.,'Delete')]")
    private WebElement removeElementButton;


    @FindBy(xpath = "//div[@class='autocomplete']/following-sibling::input")
    private WebElement autoCompleteSubmitButton;


    @FindBy(xpath = "//input[@id='myCountry']")
    private WebElement autoCompleteBox;

    @FindBy (xpath = "//div/p[@id='result' and contains(.,'You selected:')]")
    private WebElement selectedCountryMessage;

    @FindBy (xpath = "//div[@id='content' and contains(.,'Checkboxes')]")
    private WebElement checkboxHeader;

    public WebElement getCheckboxHeader() {
        return checkboxHeader;
    }

    @FindBy(xpath = "//input[@name='checkbox1'] ")
    private WebElement checkboxOne;

    @FindBy(xpath = "//input[@name='checkbox2'] ")
    private WebElement checkboxTwo;

    @FindBy (xpath = "//div[@id='column-a']")
    private WebElement dragAndDropElementOne;
    @FindBy (xpath = "//div[@id='column-b']")
    private WebElement dragAndDropElementTwo;

    @FindBy (xpath = "//div[@id='column-a']/header")
    private WebElement dragAndDropVerification;

    @FindBy (xpath = "//div[@id='content']/p/following-sibling::h3")
    private WebElement dropdownPageValidation;

    @FindBy (xpath = "//div[@id='content']/p/following-sibling::h6")
    private WebElement simpleDropdownValidation;

    @FindBy (xpath = "//select[@id='dropdown']")
    private WebElement selectDropdown;

    @FindBy (xpath = "//select[@id='year']")
    private WebElement selectYearDropdown;

    @FindBy (xpath = "//select[@id='month']")
    private WebElement selectMonthDropdown;

    @FindBy (xpath = "//select[@id='day']")
    private WebElement selectDayDropdown;

    @FindBy (xpath = "//div[@id='content']/select[4]/following-sibling::h6")
    private WebElement stateSelectionValidation;

    @FindBy (xpath = "//select[@id='state']")
    private WebElement selectState;

    @FindBy (xpath = "//select[@id='state']/following-sibling::h6")
    private WebElement languageSelectionValidation;

    @FindBy (xpath = "//select[@name='Languages']")
    private  WebElement selectLanguage;

    @FindBy (xpath = "//select[@name='Languages']/following-sibling::h6")
    private WebElement selectWebsiteValidation;

    @FindBy (xpath = "//a[@class='btn btn-secondary dropdown-toggle']")
    private  WebElement selectWebPage;

    @FindBy (xpath = "//div[@class='dropdown-menu']/a")
    private WebElement webpageList;

    public WebElement getWebpageList() {
        return webpageList;
    }

    public WebElement getSelectWebsiteValidation() {
        return selectWebsiteValidation;
    }

    public WebElement getSelectWebPage() {
        return selectWebPage;
    }

    public WebElement getSelectLanguage() {
        return selectLanguage;
    }

    public WebElement getLanguageSelectionValidation() {
        return languageSelectionValidation;
    }

    public WebElement getSelectState() {
        return selectState;
    }

    public WebElement getStateSelectionValidation() {
        return stateSelectionValidation;
    }

    public WebElement getSelectMonthDropdown() {
        return selectMonthDropdown;
    }

    public WebElement getSelectDayDropdown() {
        return selectDayDropdown;
    }

    public WebElement getSelectYearDropdown() {
        return selectYearDropdown;
    }

    public WebElement getSelectDropdown() {
        return selectDropdown;
    }

    public WebElement getSimpleDropdownValidation() {
        return simpleDropdownValidation;
    }

    public WebElement getDropdownPageValidation() {
        return dropdownPageValidation;
    }

    public WebElement getDragAndDropVerification() {
        return dragAndDropVerification;
    }

    public WebElement getDragAndDropElementOne() {
        return dragAndDropElementOne;
    }

    public WebElement getDragAndDropElementTwo() {
        return dragAndDropElementTwo;
    }

    public WebElement getCheckboxOne() {
        return checkboxOne;
    }

    public WebElement getCheckboxTwo() {
        return checkboxTwo;
    }

    public WebElement getSelectedCountryMessage() {
        return selectedCountryMessage;
    }

    public WebElement getAddRemove() {
        return addRemove;
    }

    public List<WebElement> getMenuItems() {
        return menuItems;
    }

    public WebElement getAutoComplete() {
        return autoComplete;
    }

    public WebElement getBasicAuth() {
        return basicAuth;
    }

    public WebElement getBrokenImages() {
        return brokenImages;
    }

    public WebElement getChallengingDom() {
        return challengingDom;
    }

    public WebElement getCheckBoxes() {
        return checkBoxes;
    }

    public WebElement getContextMenu() {
        return ContextMenu;
    }

    public WebElement getDisappearingElements() {
        return DisappearingElements;
    }

    public WebElement getDragAndDrop() {
        return dragAndDrop;
    }

    public WebElement getDropDown() {
        return dropDown;
    }

    public WebElement getDynamicContent() {
        return dynamicContent;
    }

    public WebElement getDynamicControls() {
        return dynamicControls;
    }

    public WebElement getDynamicLoading() {
        return dynamicLoading;
    }

    public WebElement getEntryAd() {
        return entryAd;
    }

    public WebElement getExitIntent() {
        return exitIntent;
    }

    public WebElement getFileDownload() {
        return fileDownload;
    }

    public WebElement getFileUpload() {
        return fileUpload;
    }

    public WebElement getFloatingMenu() {
        return floatingMenu;
    }

    public WebElement getForgotPassword() {
        return forgotPassword;
    }

    public WebElement getFormAuthentication() {
        return formAuthentication;
    }

    public WebElement getFrames() {
        return frames;
    }

    public WebElement getHorizontalSlider() {
        return horizontalSlider;
    }

    public WebElement getHovers() {
        return hovers;
    }

    public WebElement getInfiniteScroll() {
        return infiniteScroll;
    }

    public WebElement getInputs() {
        return inputs;
    }

    public WebElement getJavaScriptAlerts() {
        return javaScriptAlerts;
    }

    public WebElement getKeyPresses() {
        return keyPresses;
    }

    public WebElement getMultipleButtons() {
        return multipleButtons;
    }

    public WebElement getMultipleWindows() {
        return multipleWindows;
    }

    public WebElement getNestedFrames() {
        return nestedFrames;
    }

    public WebElement getRadioButtons() {
        return radioButtons;
    }

    public WebElement getAddElementButton() {
        return addElementButton;
    }

    public WebElement getRemoveElementButton() {
        return removeElementButton;
    }

    public WebElement getAutoCompleteSubmitButton() {
        return autoCompleteSubmitButton;
    }

    public WebElement getAutoCompleteBox() {
        return autoCompleteBox;
    }

    public VercelBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void pageClicker(String pageName) {

        switch (pageName) {

            case ("A/B Testing") -> getABButton().click();
            case ("Add/Remove Elements") -> getAddRemove().click();
            case ("Autocomplete") -> getAutoComplete().click();
            case ("Basic Auth") -> getBasicAuth().click();
            case ("Broken Images") -> getBrokenImages().click();
            case ("Challenging DOM") -> getChallengingDom().click();
            case ("Checkboxes") -> getCheckBoxes().click();
            case ("Context Menu") -> getContextMenu().click();
            case ("Disappearing Elements") -> getDisappearingElements().click();
            case ("Drag and Drop") -> getDragAndDrop().click();
            case ("Dropdown") -> getDropDown().click();
            case ("Dynamic Content") -> getDynamicContent().click();
            case ("Dynamic Controls") -> getDynamicControls().click();
            case ("Dynamic Loading") -> getDynamicLoading().click();
            case ("Entry Ad") -> getEntryAd().click();
            case ("Exit Intent") -> getExitIntent().click();
            case ("File Download") -> getFileDownload().click();
            case ("File Upload") -> getFileUpload().click();
            case ("Floating Menu") -> getFloatingMenu().click();
            case ("Forgot Password") -> getForgotPassword().click();
            case ("Frames") -> getFrames().click();
            case ("Form Authentication") -> getFormAuthentication().click();
            case ("Horizontal Slider") -> getHorizontalSlider().click();
            case ("Hovers") -> getHovers().click();
            case ("Infinite Scroll") -> getInfiniteScroll().click();
            case ("Inputs") -> getInputs().click();
            case ("JavaScript Alerts") -> getJavaScriptAlerts().click();
            case ("Key Presses") -> getKeyPresses().click();
            case ("Multiple Buttons") -> getMultipleButtons().click();
            case ("Nested Frames") -> getNestedFrames().click();
            case ("Multiple Windows") -> getMultipleWindows().click();
            case ("Radio Buttons") -> getRadioButtons().click();

            default -> System.err.println("No such page exists...Check your input");
        }

    }

    public String autoComplete(String country) {

        getAutoCompleteBox().click();
        BrowserUtils.justWait(1000);
        getAutoCompleteBox().sendKeys(country);

        return country;
    }

    public void autoCompleteCountryList(String country) {
        country = "Ga";
        List<WebElement> countryList = Driver.getDriver().findElements(By.xpath("//div[@id='myCountryautocomplete-list']"));
        for (WebElement eachCountry : countryList) {
            String countryText = eachCountry.getText();
            System.out.println(countryText);

            Assert.assertTrue(countryText.startsWith(country));
        }
        Assert.assertFalse("No country options found for input: " + country, countryList.isEmpty());

        for ( WebElement each : countryList ){
            each.click();
            break;
        }
        getAutoCompleteSubmitButton().click();

    }

    public void selectedCountryValidation(String expectedCountry){

        String actualSelectedCountry = getSelectedCountryMessage().getText();
        Assert.assertEquals("Expected and actual result does not match","You selected: "+expectedCountry,actualSelectedCountry);

    }

}
