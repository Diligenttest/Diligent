package web.pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TestContext.ScenarioContext;

import genericFunctions.Constant;
import genericFunctions.FieldNames;
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
	@FindBy(xpath = "//div[contains(text(),'Internal Information')]")
	public WebElement InternalInformation_Tab;
	
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
	
	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	public WebElement CalenderOpen_Button;
	
	@FindBy(xpath = "//td[contains(@class,'calendar-body-active')]")
	public WebElement SelectDate;

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

	// *********************Connected Party & Screening***************************************
	
	@FindBy(xpath = "//div[contains(text(),'Connected Party & Screening')]")
	public WebElement ConnectedParty_Screening_Tab;
	
	@FindBy(xpath = "//mat-card[@class='mat-card mat-focus-indicator']//mat-label")
	public List<WebElement> BO_Labels;
	
	@FindBy(xpath = "//a[contains(text(),'Beneficial Owner Identification')]")
	public WebElement BeneficialOwnerIdentification_Link;
	
	@FindBy(xpath = "//a[contains(text(),'Customer & Connected Parties')]")
	public WebElement CustomerConnected_Parties_link;
	
	@FindBy(xpath = "//input[@formcontrolname='boName']")
	public WebElement CustomerName_Link;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='coiListId']")
	public WebElement CountryOfCorpation_Drpdown;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='ownerTypeId']")
	public WebElement RelationShipType_Drpdown;
	
	@FindBy(xpath = "//input[@placeholder='Registration Number']")
	public WebElement Registration_TextField;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='multipleBookingLocations']")
	public WebElement BookingLocation_Dropdown;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='riskRatingId']")
	public WebElement RiskRating_Dropdown;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='unwrappingSource']")
	public WebElement UnwrappingSource_Dropdown;
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content']//a[contains(text(),'Customer')])[2]")
	public WebElement Customer_Tab;
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content']//a[contains(text(),'Individual')])[1]")
	public WebElement Individual_Tab;
	
	@FindBy(xpath = "//div[@class='mat-tab-label-content']//a[contains(text(),'Non-Individual')]")
	public WebElement NonIndividual_Tab;
	
	//**************************Customer Tab Field****************************
	
	@FindBy(xpath = "//span[@class='mat-content']/mat-panel-title")
	public WebElement CustomerName_Label;
	
	@FindBy(xpath = "(//span[@class='mat-content']//label[@class='mat-checkbox-layout'])[1]")
	public WebElement NameScreening_Label_And_Checkbox;
	
	@FindBy(xpath = "//button//span[contains(text(),'Name Screening')]")
	public WebElement NameScreening_Button;
	
	//**************************Individual Tab Field****************************
	@FindBy(xpath = "//input[@ng-reflect-name='custName']")
	public WebElement Individual_CustomerName_Field;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-name='nationalitySelect']")
	public WebElement Individual_Nationality_Dropdown;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-name='corSelect']")
	public WebElement Individual_CountryOfResidence_Dropdown;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-name='bookingLoc']")
	public WebElement Individual_BookingLocations_Dropdown;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-name='relationshipWithCustomer']")
	public WebElement Individual_RelationWithCustomer_Dropdown;
	
	@FindBy(xpath = "//span[contains(text(),'Get Fields')]/parent::button")
	public WebElement Individual_GetFields_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Remove Related Party')]/parent::button")
	public WebElement Individual_RemoveRelatedParty_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Name Screening')]/parent::button")
	public WebElement Individual_NameScreening_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Add Related Party')]/parent::button")
	public WebElement Individual_AddParty_Button;
	
	//**************************Non Individual Tab Field****************************
	@FindBy(xpath = "//mat-select[@ng-reflect-name='relationshipWithCustomer']")
	public WebElement Relationshipwithcustomer_Dropdown;
	
	@FindBy(xpath = "//input[@placeholder='Legal Name']")
	public WebElement NonIndividual_LegalName_TextField;
	
	@FindBy(xpath = "//p[contains(text(),'Nature of Business')]")
	public WebElement NonIndividual_NatureOfBussiness_Header;
	
	@FindBy(xpath = "//textarea[@placeholder='Purpose of Account Opening']")
	public WebElement NonIndividual_PurposeOfAccountOpening_TextArea;
	
	@FindBy(xpath = "//div[contains(text(),'Principal Office address (if different from Registered address)')]//mat-label")
	public List<WebElement> NonIndividual_PrinicipalOfficeAddress_TextFields;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-message='Industry']")
	public WebElement NonIndividual_Industry_Dropdown;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-message='Industry']")
	public WebElement NonIndividual_Products_Dropdown;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-placeholder='Currency']")
	public WebElement NonIndividual_Currency_Dropdown;
	
	@FindBy(xpath = "//input[@placeholder='Contact Person Name']")
	public WebElement NonIndividual_ContactPersonName_TextField;
	
	@FindBy(xpath = "//input[@placeholder='Date of Incorporation']")
	public WebElement NonIndividual_DateOfIncorporation_TextField;
	
	@FindBy(xpath = "//textarea[@placeholder='Mandatory Document']")
	public WebElement NonIndividual_Mandatory_TextField;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-placeholder='Country of Incorporation']")
	public WebElement NonIndividual_CountryOfInCorporation_Dropdown;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-placeholder='Countries of Operation']")
	public WebElement NonIndividual_CountriesOfCorporation_Dropdown;
	
	@FindBy(xpath = "//input[@placeholder='Contact Person Number']")
	public WebElement NonIndividual_ContactPersonNumber_TextField;
	
	@FindBy(xpath = "//div[contains(text(),'Registered Address')]//mat-label")
	public List<WebElement> NonIndividual_RegisteredAddress_TextFields;
	
	@FindBy(xpath = "//span[contains(text(),'Remove Related Party')]/parent::button")
	public WebElement NonIndividual_RemoveRelatedParty_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Name Screening')]/parent::button")
	public WebElement NonIndividual_NameScreening_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Add')]/parent::button")
	public WebElement NonIndividual_Add_Button;
	
	//****************************Due Diligence************************
	
	@FindBy(xpath = "//div[contains(text(),'Due Diligence')]")
	public WebElement DueDiligence_Tab;
	
	@FindBy(xpath = "//a[contains(text(),'Specialized Due Diligence (Corp)')]")
	public WebElement Diligence_SpecilizedDueDiligence_Tab;
	
	@FindBy(xpath = "//a[contains(text(),'Mandatory Due Diligence (Corp)')]")
	public WebElement Diligence_MandatoryDueDiligence_Tab;
	
	@FindBy(xpath = "//a[contains(text(),'Add / Remove Industry Standard Due Diligence')]")
	public WebElement Diligence_AddRemoveIndustryStandard_Tab;
	
	@FindBy(xpath = "//mat-select[@aria-label='Add/ Remove Industry Standard Due Diligence']")
	public WebElement Diligence_AddRemoveIndustryStandard_Dropdown;
	
	@FindBy(xpath = "//span[contains(text(),'Add/Remove Industry Standard Due Diligence')]/parent::button")
	public WebElement Diligence_AddRemoveIndustryStandard_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]/parent::button")
	public WebElement Diligence_Cancel_Button;
	
	@FindBy(xpath = "//a[contains(text(),'PEP (Corp)')]")
	public WebElement Diligence_PEP_Tab;
	
	@FindBy(xpath = "//a[contains(text(),'Customer')]")
	public WebElement Diligence_Customer_Tab;
	
	@FindBy(xpath = "//a[contains(text(),'Non-Individual')]")
	public WebElement Diligence_NonIndividual_Tab;
	
	@FindBy(xpath = "//mat-panel-title")
	public WebElement Diligence_Customer_Title_Label;
	
	@FindBy(xpath = "(//mat-radio-button)[1]//div[@class='mat-radio-outer-circle']")
	public WebElement Diligence_PEPComplete_Yes_RadioButton;
	
	@FindBy(xpath = "(//mat-radio-button)[2]//div[@class='mat-radio-outer-circle']")
	public WebElement Diligence_PEPComplete_No_RadioButton;
	
	@FindBy(xpath = "//div[contains(text(),'Refinitiv screening outcome')]")
	public WebElement Diligence_RefinitivScreeningOutcome_Header;
	
	@FindBy(xpath = "//mat-select[@ng-reflect-name='riskRating']")
	public WebElement Diligence_RiskRating_Dropdown;
	
	@FindBy(xpath = "//textarea[@ng-reflect-name='comments']")
	public WebElement Diligence_Comments_TextField;
	
	@FindBy(xpath = "//b[contains(text(),'Controllers (Non-Individual),')]")
	public WebElement Diligence_Controllers_Label;
	
	//***************************************************************************

	@FindBy(xpath = "//span[contains(text(),'Save & Proceed')]")
	public WebElement Save_Proceed_Button;
	
	@FindBy(xpath = "//span[contains(text(),'Save & Exit')]")
	public WebElement Save_Exit_Button;
	
	@FindBy(xpath = "//div[@class='mat-select-trigger']")
	public WebElement FileStatus_Dropdown;

	@FindBy(xpath = "//span[contains(text(),'Cancel ')]")
	public WebElement Cancel_Button;
	
	@FindBy(xpath = "//div[contains(@class,'mat-dialog-content')]//span[contains(text(),'Save ')]")
	public WebElement Save_Dialog_Button;
	
	public  WebElement fileStatusValue(int number)
	{
		return driver.findElement(By.xpath("(//mat-option//span[@class='mat-option-text'])["+number+"]"));
	}
	
	public  WebElement getFileStatusValue(String value)
	{
		return driver.findElement(By.xpath("//mat-cell[contains(text(),'"+value+"')]"));
	}
	
	
	
	//**********************************************************************

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
	
	public void clickInternalInformationButton() throws InterruptedException {
		ReusableMethods.Sleep(6);
		ReusableMethods.waitForElementToBeClickable(driver,Save_Proceed_Button);
		ReusableMethods.click(driver, InternalInformation_Tab);
	}

	public void clickEntityInformationButton() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, EntityInformation_Tab);
	}
	
	public void clickConnectedPartyScreeningButton() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, ConnectedParty_Screening_Tab);
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
	
	public void enterInternalInformationSectionInfo(ScenarioContext scenarioContext)
	{
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button,30, driver);
		scenarioContext.addTestData(FieldNames.CoreBankingID.toString(),ReusableMethods.generateRandomValues("alphaNumeric", 10));	
		ReusableMethods.ClearAndEnterValue(driver, CoreBanking_ID_TextField, scenarioContext.getTestData(FieldNames.CoreBankingID.toString()));
		scenarioContext.addTestData(FieldNames.CustomerSourceThrough.toString(),ReusableMethods.generateRandomValues("alphaNumeric", 10));	
		ReusableMethods.ClearAndEnterValue(driver, CustomerSourcedThrough_TextField, scenarioContext.getTestData(FieldNames.CustomerSourceThrough.toString()));
		scenarioContext.addTestData(FieldNames.BussinessSegment.toString(),ReusableMethods.generateRandomValues("alphaNumeric", 10));	
		ReusableMethods.ClearAndEnterValue(driver, BusinessSegment_TextField, scenarioContext.getTestData(FieldNames.BussinessSegment.toString()));
		scenarioContext.addTestData(FieldNames.RMName.toString(),ReusableMethods.generateRandomValues("alphaNumeric", 10));	
		ReusableMethods.ClearAndEnterValue(driver, RMName_TextField, scenarioContext.getTestData(FieldNames.RMName.toString()));
		ReusableMethods.click(driver, CalenderOpen_Button);
		ReusableMethods.click(driver, SelectDate);
		scenarioContext.addTestData(FieldNames.DateOfCutomerVisit.toString(),ReusableMethods.GetValueByAttribute(DateofCustomerVisit_TextField, "Text"));
		scenarioContext.addTestData(FieldNames.Tranparency.toString(),ReusableMethods.generateRandomValues("alphaNumeric", 10));	
		ReusableMethods.ClearAndEnterValue(driver, Transparency_TextField, scenarioContext.getTestData(FieldNames.Tranparency.toString()));
	}
	
	public void validateInternalInformationInfo(ScenarioContext scenarioContext)
	{
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CoreBanking_ID_TextField, "value"), scenarioContext.getTestData(FieldNames.CoreBankingID.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CustomerSourcedThrough_TextField, "value"), scenarioContext.getTestData(FieldNames.CustomerSourceThrough.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(BusinessSegment_TextField, "value"), scenarioContext.getTestData(FieldNames.BussinessSegment.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(RMName_TextField, "value"), scenarioContext.getTestData(FieldNames.RMName.toString()));
		//Assert.assertEquals(ReusableMethods.GetValueByAttribute(DateofCustomerVisit_TextField, "value"), scenarioContext.getTestData(FieldNames.DateOfCutomerVisit.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(Transparency_TextField, "value"), scenarioContext.getTestData(FieldNames.Tranparency.toString()));
	}
	
	public void clickSaveAndProceedButton()
	{
		ReusableMethods.waitForElement(driver, Save_Proceed_Button);
		ReusableMethods.click(driver, Save_Proceed_Button);
	}
	
	public void clickSaveAndExitButton(ScenarioContext scenarioContext)
	{
		ReusableMethods.waitForElement(driver, Save_Exit_Button);
		ReusableMethods.click(driver, Save_Exit_Button);
		Random random = new Random();
		int randomNum = random.nextInt(5) + 1;
		ReusableMethods.click(driver, FileStatus_Dropdown);
		scenarioContext.addTestData(FieldNames.FileStatus.toString(), ReusableMethods.GetTextData(fileStatusValue(randomNum)));
		ReusableMethods.click(driver, fileStatusValue(randomNum));
		ReusableMethods.click(driver, Save_Dialog_Button);
	}
	
	public void validateFileStatus(ScenarioContext scenarioContext)
	{
		ReusableMethods.waitForElement(driver, ApplicationID);
		Assert.assertTrue(ReusableMethods.isDisplayed(getFileStatusValue(scenarioContext.getTestData(FieldNames.FileStatus.toString()))));
	}
	
	public void validateConnectedPartyLinks()
	{
		ReusableMethods.waitForElement(driver, CustomerConnected_Parties_link);
		Assert.assertTrue(ReusableMethods.isDisplayed(BeneficialOwnerIdentification_Link));
		Assert.assertTrue(ReusableMethods.isDisplayed(CustomerConnected_Parties_link));
	}
	
	public void validateBeneficialOwnerIdentificationFields() throws Exception
	{
		ReusableMethods.compareList(BO_Labels, Constant.BENEFICIALOWNERIDENTIAL_LABELS);
	}
	
	public void clickCustomerAndConnectedParties_Link()
	{
		ReusableMethods.waitForElement(driver, CustomerConnected_Parties_link);
		ReusableMethods.click(driver, CustomerConnected_Parties_link);
	}
	
	public void validateTabs_CustomerAndConnectedParties()
	{
		ReusableMethods.waitForElement(driver, CustomerConnected_Parties_link);
		ReusableMethods.click(driver, CustomerConnected_Parties_link);
		Assert.assertTrue(ReusableMethods.isDisplayed(Customer_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_Tab));
	}
	
	public void validateButtons_Label_CustomerTab()
	{
		Assert.assertTrue(ReusableMethods.isDisplayed(CustomerName_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(NameScreening_Label_And_Checkbox));
		Assert.assertTrue(ReusableMethods.isDisplayed(NameScreening_Button));
	}
	
	public void validateButtons_Label_IndividualTab()
	{
		ReusableMethods.click(driver, Individual_Tab);
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_CustomerName_Field));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_Nationality_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_CountryOfResidence_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_BookingLocations_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_RelationWithCustomer_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_GetFields_Button));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_RemoveRelatedParty_Button));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_NameScreening_Button));
	}
	
	public void validateButtons_Label_NonIndividualTab() throws Exception
	{
		ReusableMethods.click(driver, NonIndividual_Tab);
		ReusableMethods.Sleep(3);
		Assert.assertTrue(ReusableMethods.isDisplayed(Relationshipwithcustomer_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_LegalName_TextField));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_NatureOfBussiness_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_PurposeOfAccountOpening_TextArea));
		ReusableMethods.ScrollToElement_JavScript(driver, NonIndividual_Industry_Dropdown);
		//ReusableMethods.compareList(NonIndividual_PrinicipalOfficeAddress_TextFields, Constant.NONINDIVIDUAL_PRINICIPALOFFICEADDRESS);
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_Industry_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_Products_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_Currency_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_Add_Button));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_DateOfIncorporation_TextField));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_ContactPersonName_TextField));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_Mandatory_TextField));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_CountryOfInCorporation_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_CountriesOfCorporation_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_ContactPersonNumber_TextField));
		//ReusableMethods.compareList(NonIndividual_PrinicipalOfficeAddress_TextFields, Constant.ADDRESSFIELDS);
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_RemoveRelatedParty_Button));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_NameScreening_Button));
	}
	
	public void clickDiligenceTab()
	{
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, DueDiligence_Tab);
	}
	
	public void clickMandatoryDiligenceTab()
	{
		ReusableMethods.waitForElementToBeDisplayed(Diligence_MandatoryDueDiligence_Tab, 10, driver);
		ReusableMethods.click(driver, Diligence_MandatoryDueDiligence_Tab);
	}
	
	
	public void validateDueDiligenceTabs()
	{
		ReusableMethods.waitForElementToBeDisplayed(Diligence_Cancel_Button, 20, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_SpecilizedDueDiligence_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_MandatoryDueDiligence_Tab));
		
	}
	
	public void validateSpecilizedDiligenceSection()
	{
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_AddRemoveIndustryStandard_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_AddRemoveIndustryStandard_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_AddRemoveIndustryStandard_Button));
	}
	
	public void validateMandatoryDiligence_Customer()
	{
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Customer_Title_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_PEPComplete_Yes_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_PEPComplete_No_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_RefinitivScreeningOutcome_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_RiskRating_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Comments_TextField));
	}
	
	public void validateMandatoryDiligence_NonIndividual()
	{
		ReusableMethods.waitForElementToBeDisplayed(Diligence_NonIndividual_Tab, 10, driver);
		ReusableMethods.click(driver,Diligence_NonIndividual_Tab);
		ReusableMethods.waitForElementToBeDisplayed(Diligence_Customer_Title_Label, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Customer_Title_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Controllers_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_PEPComplete_Yes_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_PEPComplete_No_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_RefinitivScreeningOutcome_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_RiskRating_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Comments_TextField));
	}
}
