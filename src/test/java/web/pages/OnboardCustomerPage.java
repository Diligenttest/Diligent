package web.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestContext.ScenarioContext;

import genericFunctions.ReusableMethods;

public class OnboardCustomerPage {

	public WebDriver driver;
	public Map<String, Object> privateData;
	public Map<String, Object> publicData;
	public Map<String, Object> data = null;

	public OnboardCustomerPage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		privateData = ReusableMethods.readPrivateYamlFile();
		publicData = ReusableMethods.readPublicYamlFile();
	}

	// Common fields Applicable for Customer,Individual and Non Individual
	@FindBy(xpath = "//mat-select[@formcontrolname='ownershipType']")
	public WebElement RelationShipType_Dropdown;

	@FindBy(xpath = "//mat-select[@formcontrolname='entityType']")
	public WebElement EntityType_Dropdown;

	@FindBy(xpath = "//mat-select[@formcontrolname='subEntityType']")
	public WebElement SubEntityType_Dropdown;

	@FindBy(xpath = "//mat-select[@formcontrolname='bookingLocation']")
	public WebElement BookingLocations_Dropdown;

	@FindBy(xpath = "//mat-select[@formcontrolname='relatedPartyIdSelected']")
	public WebElement RelationWithCustomer_Dropdown;

	@FindBy(xpath = "//*[contains(text(),'Country of Incorporation')]/../..//preceding-sibling::mat-select")
	public WebElement CountryOfIncorporation_Dropdown;

	@FindBy(xpath = "//span[contains(text(),'Generate Checklist')]")
	public WebElement GenerateChecklist_Button;

	@FindBy(xpath = "//span[contains(text(),'Generate KYC Profile')]")
	public WebElement GenerateKYC_Button;

	@FindBy(xpath = "//span[contains(text(),' Get Risk Rating ')]")
	public WebElement RiskRating_Button;

	// Customer Tab

	@FindBy(xpath = "//input[@formcontrolname='customerNames']")
	public WebElement CustomerName_TextField;

	@FindBy(xpath = "//input[@formcontrolname='customerEmail']")
	public WebElement CustomerEmail_TextField;

	@FindBy(xpath = "//*[contains(text(),'Risk Rating')]/../..//preceding-sibling::mat-select")
	public WebElement RiskRating_Dropdown;

	@FindBy(xpath = "//*[contains(text(),'Products')]/../..//preceding-sibling::mat-select")
	public WebElement Products_Dropdown;

	@FindBy(xpath = "//*[contains(text(),'Countries of Operations')]/../..//preceding-sibling::mat-select")
	public WebElement CountriesOfOporation_Dropdown;

	@FindBy(xpath = "//mat-select[@formcontrolname='specializedDD']")
	public WebElement IndustryStandard_Dropdown;

	@FindBy(xpath = "//*[text()=' Industry ']/../..//preceding-sibling::mat-select")
	public WebElement Industry_Dropdown;

	public WebElement GenericDropdwon(Object value) {
		return driver.findElement(By.xpath("//mat-option//span[contains(text(),'" + value + "')]"));
	}

	public WebElement GenericCheckbox(Object value) {
		return driver.findElement(By.xpath("//mat-pseudo-checkbox/..//span[contains(text(),'" + value + "')]"));
	}

	// Individual Tab

	@FindBy(xpath = "//input[@formcontrolname='BONames']")
	public WebElement Indivdual_Name_TextField;

	@FindBy(xpath = "//mat-select[@formcontrolname='Nationality']")
	public WebElement Individual_Nationality_Dropdown;

	@FindBy(xpath = "//mat-select[@formcontrolname='Residence']")
	public WebElement Individual_Residence_Dropdown;

	// Non Individual Tab

	@FindBy(xpath = "//input[@formcontrolname='BONonIndNames']")
	public WebElement NonIndivdual_Name_TextField;

	public WebElement NavigationTabs(String value) {
		return driver.findElement(By.xpath("//div[contains(text(),'" + value + "')]"));
	}

	public void commonElements(ScenarioContext scenarioContext, String orgType) throws InterruptedException {		
		if (orgType.equals("Private"))
			data = privateData;
		else
			data = publicData;
		ReusableMethods.click(driver, RelationShipType_Dropdown);
		ReusableMethods.click(driver, GenericDropdwon(data.get("RelationShip Type")));
		ReusableMethods.click(driver, EntityType_Dropdown);
		ReusableMethods.click(driver, GenericDropdwon(data.get("Entity Type")));
		ReusableMethods.click(driver, SubEntityType_Dropdown);
		ReusableMethods.click(driver, GenericDropdwon(data.get("SubEntity Type")));
		ReusableMethods.moveToElement(driver, GenerateChecklist_Button);
		ReusableMethods.Sleep(2);
		ReusableMethods.click(driver, CountryOfIncorporation_Dropdown);
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData("COI")));
	}

	public void enterCustomerIDVChecklist(ScenarioContext scenarioContext, String orgType) throws InterruptedException {	
		if (orgType.equals("Private"))
			data = privateData;
		else
			data = publicData;
		
		Map<String, Object> mandatoryRiskFields = (Map<String, Object>) data.get("Mandatory Risk Fields");

		if (mandatoryRiskFields != null) {
			mandatoryRiskFields.forEach((key, value) -> scenarioContext.addTestData(key.toString(), value.toString()));
		}
		String[] bookingLocations = data.get("Booking Locations").toString().split(",");
		// String[] products = scenarioContext.getTestData("products").split(",");
		ReusableMethods.Sleep(5);
		ReusableMethods.EnterValue(driver, CustomerName_TextField,
				ReusableMethods.generateRandomValues("alphabets", 6));
		ReusableMethods.EnterValue(driver, CustomerEmail_TextField,
				ReusableMethods.generateRandomValues("alphabets", 4) + "@gmail.com");
		commonElements(scenarioContext,orgType);
		ReusableMethods.click(driver, BookingLocations_Dropdown);
		ReusableMethods.SelectCheckbox(GenericCheckbox(bookingLocations[0]));
		ReusableMethods.SelectCheckbox(GenericCheckbox(bookingLocations[1]));
		ReusableMethods.moveToElement(driver, CustomerName_TextField);
//		ReusableMethods.click(driver, Products_Dropdown);
//		ReusableMethods.SelectCheckbox(GenericCheckbox(products[0]));
//		ReusableMethods.SelectCheckbox(GenericCheckbox(products[1]));
//		ReusableMethods.moveToElement(driver, CustomerName_TextField);
		ReusableMethods.Sleep(2);
		ReusableMethods.click(driver, Industry_Dropdown);
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData("Industry")));
//		ReusableMethods.click(driver, CountriesOfOporation_Dropdown);
//		ReusableMethods.SelectCheckbox(GenericCheckbox(scenarioContext.getTestData("COR")));
//		ReusableMethods.moveToElement(driver, CustomerName_TextField);
		ReusableMethods.click(driver, IndustryStandard_Dropdown);
		ReusableMethods.SelectCheckbox(GenericCheckbox("N/A"));
		ReusableMethods.moveToElement(driver, CustomerName_TextField);
		clickRiskRating();

	}

	public void clickRiskRating() {
		ReusableMethods.click(driver, RiskRating_Dropdown);
		ReusableMethods.click(driver, GenericDropdwon("Medium"));
		ReusableMethods.click(driver, RiskRating_Button);
	}

	public void clickGenerateChecklist() {
		ReusableMethods.waitForElementToBeClickable(driver, GenerateChecklist_Button);
		ReusableMethods.click(driver, GenerateChecklist_Button);
	}

	public void clickTabs(String tabName) {
		ReusableMethods.waitForElementToBeDisplayed(NavigationTabs(tabName), 40, driver);
		ReusableMethods.click(driver, NavigationTabs(tabName));
	}

	public void enterIndividualInformation(ScenarioContext scenarioContext) throws InterruptedException {
		ReusableMethods.waitForElementToBeDisplayed(Indivdual_Name_TextField, 30, driver);
		ReusableMethods.Sleep(3);
		ReusableMethods.EnterValue(driver, Indivdual_Name_TextField,
				ReusableMethods.generateRandomValues("alphabets", 6));
		ReusableMethods.Sleep(2);
		ReusableMethods.click(driver, Individual_Nationality_Dropdown);
		ReusableMethods.click(driver, GenericDropdwon("India"));
		ReusableMethods.waitForElementToBeDisplayed(Individual_Residence_Dropdown, 30, driver);
		ReusableMethods.Sleep(2);
		ReusableMethods.click(driver, Individual_Residence_Dropdown);
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData("COR")));
		ReusableMethods.waitForElementToBeDisplayed(RelationWithCustomer_Dropdown, 30, driver);
		ReusableMethods.click(driver, RelationWithCustomer_Dropdown);
		ReusableMethods.SelectCheckbox(GenericCheckbox("Senior Manager"));
		ReusableMethods.moveToElement(driver, Indivdual_Name_TextField);
	}

	public void enterNonIndividualInformation(ScenarioContext scenarioContext,String orgType) throws InterruptedException {
		ReusableMethods.waitForElementToBeDisplayed(NonIndivdual_Name_TextField, 30, driver);
		try {
			ReusableMethods.Sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ReusableMethods.EnterValue(driver, NonIndivdual_Name_TextField,
				ReusableMethods.generateRandomValues("alphabets", 6));
		commonElements(scenarioContext,orgType);
		ReusableMethods.click(driver, RelationWithCustomer_Dropdown);
		ReusableMethods.SelectCheckbox(GenericCheckbox("BO (Non-Individual)"));
		ReusableMethods.moveToElement(driver, NonIndivdual_Name_TextField);
	}

	public void clickGenerateKYC() {
		ReusableMethods.ScrollToElement_JavScript(driver, GenerateKYC_Button);
		ReusableMethods.waitForElementToBeClickable(driver, GenerateKYC_Button);
		ReusableMethods.click(driver, GenerateKYC_Button);
	}

}
