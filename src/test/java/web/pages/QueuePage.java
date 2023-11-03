package web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericFunctions.Constant;
import genericFunctions.ReusableMethods;

public class QueuePage {

	public WebDriver driver;

	public QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@ng-reflect-router-link,'queue')]//span[text()='Corporate']")
	public WebElement Corpoate_SubTab;

	@FindBy(xpath = "//div[@class='mat-tab-label-content']")
	public List<WebElement> CorporateQueue_Tabs;

	@FindBy(xpath = "//mat-table//mat-header-cell")
	public List<WebElement> OnboardCustomer_TableHeaders;

	@FindBy(xpath = "(//mat-cell[contains(@class,'MY_QUEUE_LABEL_APPLICATION')])[1]")
	public WebElement ApplicationID;

	@FindBy(xpath = "//a[contains(@class,'mat-tab-link mat')]//following-sibling::div")
	public List<WebElement> Onboarding_Tabs;

	@FindBy(xpath = "//span[contains(text(),'Maker Comments')]")
	public WebElement Makers_Button;

	// ***********Internal Information Fields************************
	@FindBy(xpath = "//input[@placeholder='Core Banking ID']")
	public WebElement CoreBanking_ID_TextField;

	@FindBy(xpath = "//input[@placeholder='Customer Sourced Through']")
	public WebElement CustomerSourcedThrough_TextField;

	@FindBy(xpath = "//input[@placeholder='Business Segment']")
	public WebElement BusinessSegment_TextField;

	@FindBy(xpath = "//input[@placeholder='RM Name']")
	public WebElement RMName_TextField;

	@FindBy(xpath = "//input[@placeholder='Date of Customer Visit']")
	public WebElement DateofCustomerVisit_TextField;

	@FindBy(xpath = "//input[@placeholder='Transparency']")
	public WebElement Transparency_TextField;

	// ***********Entity Information Fields************************

	@FindBy(xpath = "//div[contains(text(),'Entity Information')]")
	public WebElement EntityInformation_Tab;

	@FindBy(xpath = "//input[@placeholder='Legal Name']")
	public WebElement LegalName_TextField;

	@FindBy(xpath = "//input[@placeholder='Former Name (if any)']")
	public WebElement FormerName_TextField;

	@FindBy(xpath = "//mat-select[@aria-label='Country of Incorporation']")
	public WebElement CountryOfCorporation_Dropdown;

	@FindBy(xpath = "//input[@placeholder='Date of Incorporation']")
	public WebElement DateOfIncorporation_TextField;

	@FindBy(xpath = "//div[contains(text(),'Registered Address')]//mat-label")
	public List<WebElement> AddressFields;

	// ***********Bussiness Information Fields************************

	@FindBy(xpath = "//a[contains(text(),'Business Information')]")
	public WebElement BussinessInformation_Link;

	@FindBy(xpath = "//p[contains(text(),'Nature of Business')]")
	public WebElement NatureOfBussiness_Header;

	@FindBy(xpath = "//div[@class='mat-form-field-infix']//mat-select//span")
	public List<WebElement> BussinessInformation_Dropdowns;

	// ***********Product Information Fields************************

	@FindBy(xpath = "//a[contains(text(),'Product Information')]")
	public WebElement ProductInformation_Link;

	@FindBy(xpath = "//textarea[@placeholder='Purpose of Account Opening']")
	public WebElement PurposeOfAccountOpening_TextArea;

	@FindBy(xpath = "//mat-select[@aria-label='Products Required']")
	public WebElement ProductsRequired_Dropdown;

	// ***********Contact Information Fields************************

	@FindBy(xpath = "//a[contains(text(),'Contact Information')]")
	public WebElement ContactInformation_Link;

	@FindBy(xpath = "//div[contains(text(),'Principal Office address (if different from Registered address)')]")
	public WebElement PrincipleOfficeAddress_Header;

	@FindBy(xpath = "//div[@class='mat-form-field-wrapper']//mat-label")
	public List<WebElement> ContactInformation_AddressFields;
	
	// ***********Other Information************************
	@FindBy(xpath = "//a[contains(text(),'Other Information')]")
	public WebElement OtherInformation_Link;
	
	@FindBy(xpath = "//textarea[@placeholder='Mandatory Document']")
	public WebElement MandatoryDocument_TextArea;

	// ************************************************************

	@FindBy(xpath = "//span[contains(text(),'Save & Proceed')]")
	public WebElement Save_Proceed_Button;

	@FindBy(xpath = "//span[contains(text(),'Cancel ')]")
	public WebElement Cancel_Button;

	public void validateQueueUrl(String url) {
		ReusableMethods.waitForElementToBeDisplayed(Cancel_Button, 10, driver);
		Assert.assertEquals(url, ReusableMethods.getCurrentURL(driver));
	}

	public void validateCorporateMyQueueHeaders(List<String> expectedValues) throws Exception {
		ReusableMethods.compareList(CorporateQueue_Tabs, expectedValues);
	}

	public void validateOnboardCustomerTableHeaders(List<String> expectedValues) throws Exception {
		ReusableMethods.compareList(OnboardCustomer_TableHeaders, Constant.ONBOARDCUSTOMERHEADERS);
	}

	public void clickCorporate_Queue() {
		ReusableMethods.click(driver, Corpoate_SubTab);
	}

	public void clickAnyExistingApplicationID() {
		ReusableMethods.waitForElementToBeDisplayed(Cancel_Button, 10, driver);
		ReusableMethods.click(driver, ApplicationID);
	}

	public void validateOnboardingTabs() throws Exception {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.compareList(Onboarding_Tabs, Constant.ONBOARDINGTABS);
	}

	public void validateInternalInformation_Fields() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(CoreBanking_ID_TextField), "Core Banking ID field is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(CustomerSourcedThrough_TextField),
				"Customer source through field is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(BusinessSegment_TextField), "Bussiness Segment field is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(RMName_TextField), "RM Name field is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(DateofCustomerVisit_TextField),
				"Date of Customer visit field is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(Transparency_TextField), "Transparency field is missing");
	}

	public void validateOnboarding_Buttons() {
		Assert.assertTrue(ReusableMethods.isDisplayed(Makers_Button), "Maker Button is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(Save_Proceed_Button), "Save Button is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(Cancel_Button), "Cancel Button is missing");

	}

	public void clickEntityInformationButton() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, EntityInformation_Tab);
	}

	public void validateCII_Fields() throws Exception {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(LegalName_TextField), "Legal Name field is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(FormerName_TextField), "FormerName field is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(DateOfIncorporation_TextField),
				"Date of incorporation field is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(CountryOfCorporation_Dropdown),
				"Country of InCorportation field is missing");
		ReusableMethods.compareList(AddressFields, Constant.ADDRESSFIELDS);
	}

	public void validateBA_Fields() throws Exception {
		ReusableMethods.waitForElementToBeDisplayed(BussinessInformation_Link, 10, driver);
		ReusableMethods.click(driver, BussinessInformation_Link);
		ReusableMethods.waitForElementToBeDisplayed(NatureOfBussiness_Header, 10, driver);
		ReusableMethods.compareList(BussinessInformation_Dropdowns, Constant.BUSSINESSINFORMATIONDROPDOWNS);
	}

	public void validatePA_Fields() {
		ReusableMethods.waitForElementToBeDisplayed(ProductInformation_Link, 10, driver);
		ReusableMethods.click(driver, ProductInformation_Link);
		ReusableMethods.waitForElementToBeDisplayed(PurposeOfAccountOpening_TextArea, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(PurposeOfAccountOpening_TextArea),
				"Purpose of account opening area is missing");
		Assert.assertTrue(ReusableMethods.isDisplayed(ProductsRequired_Dropdown), "Products required is missing");
	}

	public void validateCA_Fields() throws Exception {
		ReusableMethods.waitForElementToBeDisplayed(ContactInformation_Link, 10, driver);
		ReusableMethods.click(driver, ContactInformation_Link);
		ReusableMethods.waitForElementToBeDisplayed(PrincipleOfficeAddress_Header, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(PrincipleOfficeAddress_Header),
				"Prinicipal of office address is missing");
		ReusableMethods.compareList(ContactInformation_AddressFields, Constant.CONTACTINFORMATION_ADDRESSFIELDS);
	}

	public void validateOtherInformation_Fields()
	{
		ReusableMethods.waitForElementToBeDisplayed(OtherInformation_Link, 10, driver);
		ReusableMethods.click(driver, OtherInformation_Link);
		Assert.assertTrue(ReusableMethods.isDisplayed(MandatoryDocument_TextArea),
				"Mandatory Document Text area is missing");
	}
}
