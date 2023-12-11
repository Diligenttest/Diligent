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

	@FindBy(xpath = "(//mat-cell[contains(@class,'MY_QUEUE_LABEL_APPLICATION')])/a")
	public List<WebElement> GetRecordID;

	@FindBy(xpath = "//button[contains(@class,'navigation-next')]")
	public WebElement NextPagination_Button;

	@FindBy(xpath = "//a[contains(@class,'mat-tab-link mat')]//following-sibling::div")
	public List<WebElement> Onboarding_Tabs;

	@FindBy(xpath = "//span[contains(text(),'Maker Comments')]")
	public WebElement Makers_Button;

	@FindBy(xpath = "//h1[contains(text(),'Maker Comments')]")
	public WebElement Makers_Header;

	@FindBy(xpath = "//textarea[@ng-reflect-name=\"comments\"]")
	public WebElement Makers_Comments_TextField;

	@FindBy(xpath = "//span[contains(text(),'Update')]/parent::button")
	public WebElement Makers_Update_Button;

	@FindBy(xpath = "//div[contains(@class,'mat-dialog-actions')]//span[contains(text(),'Cancel')]/parent::button")
	public WebElement Makers_Cancel_Button;

	// ***********Internal Information Fields************************
	@FindBy(xpath = "//div[contains(text(),'Internal Information')]")
	public WebElement InternalInformation_Tab;

	@FindBy(xpath = "//div[@class='mat-form-field-infix']")
	public List<WebElement> Get_Fields_Count;

	@FindBy(xpath = "//input[@placeholder='Core Banking ID']")
	public WebElement CoreBanking_ID_TextField;

	@FindBy(xpath = "//input[@placeholder='Customer Sourced Through']")
	public WebElement CustomerSourcedThrough_TextField;

	@FindBy(xpath = "//mat-select[contains(@aria-label,'Customer Sourced Through')]")
	public WebElement DynamicCustomerSourcedThrough_Dropdown;

	@FindBy(xpath = "//mat-option//span[contains(text(),'Direct')]")
	public WebElement DynamicCustomerSourcedThrough_Value;

	@FindBy(xpath = "//mat-select[contains(@aria-label,'Business Segment')]")
	public WebElement DynamicBussinessSegment_Dropdown;

	@FindBy(xpath = "//span[contains(text(),'Commercial Banking')]/..//mat-pseudo-checkbox")
	public WebElement DynamicBussinessSegment_Value;

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

	@FindBy(xpath = "//a[contains(text(),'Customer Information')]")
	public WebElement CustomerInformation_Tab;

	@FindBy(xpath = "//a[contains(text(),'Customer Identification Information')]")
	public WebElement CustomerIdentification_Tab;

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

	@FindBy(xpath = "//input[@placeholder=\"Line 1\"]")
	public WebElement CI_Line1_TextFIeld;

	@FindBy(xpath = "//input[@placeholder=\"Line 2\"]")
	public WebElement CI_Line2_TextFIeld;

	@FindBy(xpath = "//input[@placeholder=\"Street\"]")
	public WebElement CI_Street_TextFIeld;

	@FindBy(xpath = "//input[@placeholder=\"City\"]")
	public WebElement CI_City_TextFIeld;

	@FindBy(xpath = "//input[@placeholder=\"Pincode\"]")
	public WebElement CI_Pincode_TextFIeld;

	@FindBy(xpath = "//mat-select[contains(@aria-label,'Country of Incorporation')]")
	public WebElement CountryOfCorporation_Drp;

	@FindBy(xpath = "//mat-select[contains(@aria-label,'Tax Residency Status')]")
	public WebElement TaxResidencyStatus_Drp;

	@FindBy(xpath = "//input[@placeholder='GST/Tax Reference Number']")
	public WebElement TaxReferenceNumber_TextField;

	@FindBy(xpath = "//mat-select[contains(@ng-reflect-message,'Constitution/Legal Status')]")
	public WebElement LegalStatus_Drp;

	@FindBy(xpath = "//input[contains(@placeholder,'Bank Name')]")
	public WebElement BankName_TextField;

	@FindBy(xpath = "//input[contains(@placeholder,'Country')]")
	public WebElement Country_TextField;

	@FindBy(xpath = "//input[contains(@placeholder,'Relationship type')]")
	public WebElement RelationShip_TextField;

	@FindBy(xpath = "//mat-select[contains(@aria-label,'Stock Exchange')]")
	public WebElement StockExchange_Drp;

	public WebElement GenericDropdwon(String value) {
		return driver.findElement(By.xpath("//mat-option//span[contains(text(),'" + value + "')]"));
	}

	// ***********Bussiness Information Fields************************

	@FindBy(xpath = "//a[contains(text(),'Business Information')]")
	public WebElement BussinessInformation_Link;

	@FindBy(xpath = "//a[contains(text(),' Nature of Business and Business Activity ')]")
	public WebElement BussinessInformation_Tab;

	@FindBy(xpath = "//p[contains(text(),'Nature of Business')]")
	public WebElement NatureOfBussiness_Header;

	@FindBy(xpath = "//div[@class='mat-form-field-infix']//mat-select//span")
	public List<WebElement> BussinessInformation_Dropdowns;

	@FindBy(xpath = "//mat-select[contains(@ng-reflect-message,'Industry Type')]")
	public WebElement IndustryType_Drp;

	@FindBy(xpath = "//textarea[contains(@ng-reflect-message,'Please provide brief details o')]")
	public WebElement ProvideDetails_TextArea;

	// ***********Product Information Fields************************

	@FindBy(xpath = "//a[contains(text(),'Product Information')]")
	public WebElement ProductInformation_Tab;

	@FindBy(xpath = "//textarea[@placeholder='Purpose of Account Opening']")
	public WebElement PurposeOfAccountOpening_TextArea;

	@FindBy(xpath = "//mat-select[@aria-label='Products Required']")
	public WebElement ProductsRequired_Dropdown;

	// *****************Risk Evaluation************************************
	@FindBy(xpath = "//a[contains(text(),'Risk Evaluation')]")
	public WebElement RiskEvaluation_Tab;

	@FindBy(xpath = "//mat-select[contains(@aria-label,'Products')]")
	public WebElement RiskProducts_Dropdown;

	@FindBy(xpath = "//mat-select[@aria-label='Industry']")
	public WebElement RiskIndusrtry_Dropdown;

	@FindBy(xpath = "//mat-select[@aria-label='Countries of Operations']")
	public WebElement RiskCountriesOfOPerations_Dropdown;

	@FindBy(xpath = "//mat-select[@aria-label='Publicly Listed/Govt Owned']")
	public WebElement RiskGovtOwned_Dropdown;

	// *****************New Level************************************
	@FindBy(xpath = "//a[contains(text(),'New Level')]")
	public WebElement NewLevel_Tab;

	@FindBy(xpath = "//mat-select[@aria-label='Risk 1']")
	public WebElement Risk1_Dropdown;

	@FindBy(xpath = "//mat-select[@aria-label='Risk 2']")
	public WebElement Risk2_Dropdown;

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

	// *********************Connected Party &
	// Screening***************************************

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

	// **************************Customer Tab Field****************************

	@FindBy(xpath = "//span[@class='mat-content']/mat-panel-title")
	public WebElement CustomerName_Label;

	@FindBy(xpath = "(//span[@class='mat-content']//label[@class='mat-checkbox-layout'])[1]")
	public WebElement NameScreening_Label_And_Checkbox;

	@FindBy(xpath = "//button//span[contains(text(),'Name Screening')]")
	public WebElement NameScreening_Button;

	// **************************Individual Tab Field****************************
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

	// **************************Non Individual Tab
	// Field****************************
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

	// ****************************Due Diligence************************

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

	// ************************Documentation*****************************
	@FindBy(xpath = "//div[contains(text(),'Documentation')]")
	public WebElement Documentation_Tab;

	@FindBy(xpath = "//a[contains(text(),'ID & V Documentation')]")
	public WebElement Doc_IDV_Tab;

	@FindBy(xpath = "//a[contains(text(),'Document Tracking')]")
	public WebElement Doc_DocumentTracking_Tab;

	@FindBy(xpath = "//a[contains(text(),'Customer')]")
	public WebElement Doc_Customer_Tab;

	@FindBy(xpath = "//a[contains(text(),'Non-Individual')]")
	public WebElement Doc_NonIndividual_Tab;

	@FindBy(xpath = "//mat-panel-title")
	public WebElement Doc_ApplicationTitle_Label;

	@FindBy(xpath = "(//b[contains(text(),'Doc selection Completed')]/../..//div[@class='mat-radio-outer-circle'])[1]")
	public WebElement Doc_DocSelectionCompleted_Yes_RadioButton;

	@FindBy(xpath = "(//b[contains(text(),'Doc selection Completed')]/../..//div[@class='mat-radio-outer-circle'])[2]")
	public WebElement Doc_DocSelectionCompleted_No_RadioButton;

	@FindBy(xpath = "//label[contains(text(),'Selected documents satisfy verification requirement')]")
	public WebElement Doc_SelectedDocuments_Header;

	@FindBy(xpath = "//label[contains(text(),'List of Documents which can be submitted for Verification')]")
	public WebElement Doc_ListOfDocuments_Header;

	@FindBy(xpath = "//div[@class='table-responsive']//th")
	public List<WebElement> Doc_Table_Header;

	@FindBy(xpath = "//div[@class='table-responsive']//span[2]")
	public List<WebElement> Doc_Table_Data;

	@FindBy(xpath = "//h2[contains(text(),'Other Document(s)')]")
	public WebElement Doc_OtherDocuments_Header;

	@FindBy(xpath = "//div[contains(text(),'- Mandatory, P - Primary, S - Secondary')]")
	public WebElement Doc_OtherDocuments_Note;

	@FindBy(xpath = "//b[contains(text(),'Controllers (Non-Individual),')]")
	public WebElement Doc_NonIndividualControllers_Label;

	@FindBy(xpath = "//div[contains(text(),'- Mandatory, P - Primary, S - Secondary')]")
	public WebElement Doc_Add_Icon;

	@FindBy(xpath = "//a[@ng-reflect-message='Remove Document']")
	public WebElement Doc_Remove_Icon;

	@FindBy(xpath = "//div[contains(text(),'Agreed / Need to submit document(s) are not required.')]")
	public WebElement Doc_SubmitDocuments_Note;

	@FindBy(xpath = "//input[@placeholder='Document Name']")
	public WebElement Doc_DocumentName_TextField;

	@FindBy(xpath = "//textarea[@placeholder='Certification Requirements']")
	public WebElement Doc_CertificationRequirment_TextField;

	@FindBy(xpath = "//mat-select[@aria-label='Mandatory']")
	public WebElement Doc_Mandatory_Dropdown;

	@FindBy(xpath = "//span[@class='mat-option-text' and contains(text(),'No')]")
	public WebElement Doc_Mandatory_Selection_Dropdown;

	// ************************Risk Assessment*****************************

	@FindBy(xpath = "//div[contains(text(),'Risk Assessment')]")
	public WebElement RiskAssessment_Tab;

	@FindBy(xpath = "//div[contains(text(),'Risk Based Assessment')]/parent::div/following-sibling::div")
	public List<WebElement> RiskAssesment_Labels_Headers;

	@FindBy(xpath = "//span[contains(text(),'Save & Submit')]/parent::button")
	public WebElement Save_Submit_Button;

	// ************************Profile Summary*****************************

	@FindBy(xpath = "//div[contains(text(),'Profile Summary')]")
	public WebElement ProfileSummary_Tab;

	@FindBy(xpath = "//div[contains(text(),'Profile Details')]")
	public WebElement ProfileDetails_Tab;

	@FindBy(xpath = "//div[contains(text(),'Profile History')]")
	public WebElement ProfileHistory_Tab;

	@FindBy(xpath = "//div[contains(text(),'Customer Information Summary')]")
	public WebElement Profile_CustomerInformation_Header;

	@FindBy(xpath = "//label[@class='heading']")
	public List<WebElement> Profile_CustomerInformation_Labels;

	@FindBy(xpath = "//figure[@class='mat-figure']")
	public List<WebElement> Profile_Customer_RiskSummary_Labels_Table;

	@FindBy(xpath = "//div[contains(text(),'Profile History')]")
	public WebElement WaiverApplied_ToggleButton;

	@FindBy(xpath = "//label[contains(text(),'Waiver Applied:')]/parent::div//span[contains(@class,'sub-data')]")
	public WebElement WaiverApplied_Text;

	@FindBy(xpath = "//span[contains(text(),'Save')]/parent::button")
	public WebElement Profile_SaveButton;

	@FindBy(xpath = "//div[@class='table-data']//th")
	public List<WebElement> ProfileHistory_TableHeaders;

	@FindBy(xpath = "//div[@class='table-data']//tbody//tr")
	public List<WebElement> ProfileHistory_CustomerInfo;

	@FindBy(xpath = "//span[contains(text(),'Download')]/parent::button")
	public WebElement ProfileHistory_Download_Button;

	// ********************************************************************

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

	public WebElement fileStatusValue(int number) {
		return driver.findElement(By.xpath("(//mat-option//span[@class='mat-option-text'])[" + number + "]"));
	}

	public WebElement customerName(String name) {
		return driver.findElement(By.xpath(" //a[contains(text(),'" + name + "')]"));
	}

	public WebElement getFileStatusValue(String value) {
		return driver.findElement(By.xpath("//mat-cell[contains(text(),'" + value + "')]"));
	}

	// *************************Dynamic RecordID*****************************

	public WebElement dynamicRecordID(String recordID) {
		return driver.findElement(By.xpath("//mat-cell/a[contains(text(),'" + recordID + "')]"));
	}
	// *************************************************************************

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

	public void clickDynamicRecordID(String recordID) throws Exception {
		List<String> getRecords = null;
		ReusableMethods.waitForElementToBeDisplayed(Cancel_Button, 10, driver);
		getRecords = ReusableMethods.getListofElements(GetRecordID);

		while (!(getRecords.contains(recordID))) {
			ReusableMethods.ScrollToElement(driver, NextPagination_Button);
			ReusableMethods.click(driver, NextPagination_Button);
			getRecords = ReusableMethods.getListofElements(GetRecordID);
		}

		ReusableMethods.click(driver, dynamicRecordID(recordID));
	}

	public void clickExistingCustomerName(String name) {
		ReusableMethods.waitForElementToBeDisplayed(Cancel_Button, 10, driver);
		ReusableMethods.click(driver, customerName(name));
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
		ReusableMethods.waitForElementToBeDisplayed(ProductInformation_Tab, 10, driver);
		ReusableMethods.click(driver, ProductInformation_Tab);
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

	public void validateOtherInformation_Fields() {
		ReusableMethods.waitForElementToBeDisplayed(OtherInformation_Link, 10, driver);
		ReusableMethods.click(driver, OtherInformation_Link);
		Assert.assertTrue(ReusableMethods.isDisplayed(MandatoryDocument_TextArea),
				"Mandatory Document Text area is missing");
	}

	public void enterInternalInformationSectionInfo(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 30, driver);
		scenarioContext.addTestData(FieldNames.CoreBankingID.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, CoreBanking_ID_TextField,
				scenarioContext.getTestData(FieldNames.CoreBankingID.toString()));
		scenarioContext.addTestData(FieldNames.CustomerSourceThrough.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, CustomerSourcedThrough_TextField,
				scenarioContext.getTestData(FieldNames.CustomerSourceThrough.toString()));
		scenarioContext.addTestData(FieldNames.BussinessSegment.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, BusinessSegment_TextField,
				scenarioContext.getTestData(FieldNames.BussinessSegment.toString()));
		scenarioContext.addTestData(FieldNames.RMName.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, RMName_TextField,
				scenarioContext.getTestData(FieldNames.RMName.toString()));
		ReusableMethods.click(driver, CalenderOpen_Button);
		ReusableMethods.click(driver, SelectDate);
		scenarioContext.addTestData(FieldNames.DateOfCutomerVisit.toString(),
				ReusableMethods.GetValueByAttribute(DateofCustomerVisit_TextField, "Text"));
		scenarioContext.addTestData(FieldNames.Tranparency.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, Transparency_TextField,
				scenarioContext.getTestData(FieldNames.Tranparency.toString()));
	}

	public void validateInternalInformationInfo(ScenarioContext scenarioContext) {
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CoreBanking_ID_TextField, "value"),
				scenarioContext.getTestData(FieldNames.CoreBankingID.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CustomerSourcedThrough_TextField, "value"),
				scenarioContext.getTestData(FieldNames.CustomerSourceThrough.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(BusinessSegment_TextField, "value"),
				scenarioContext.getTestData(FieldNames.BussinessSegment.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(RMName_TextField, "value"),
				scenarioContext.getTestData(FieldNames.RMName.toString()));
		// Assert.assertEquals(ReusableMethods.GetValueByAttribute(DateofCustomerVisit_TextField,
		// "value"),
		// scenarioContext.getTestData(FieldNames.DateOfCutomerVisit.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(Transparency_TextField, "value"),
				scenarioContext.getTestData(FieldNames.Tranparency.toString()));
	}

	public void clickSaveAndProceedButton() {
		ReusableMethods.ScrollToElement(driver, Save_Proceed_Button);
		ReusableMethods.waitForElement(driver, Save_Proceed_Button);
		ReusableMethods.click(driver, Save_Proceed_Button);
	}

	public void clickSaveAndExitButton(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElement(driver, Save_Exit_Button);
		ReusableMethods.click(driver, Save_Exit_Button);
		Random random = new Random();
		int randomNum = random.nextInt(5) + 1;
		ReusableMethods.click(driver, FileStatus_Dropdown);
		scenarioContext.addTestData(FieldNames.FileStatus.toString(),
				ReusableMethods.GetTextData(fileStatusValue(randomNum)));
		ReusableMethods.click(driver, fileStatusValue(randomNum));
		ReusableMethods.click(driver, Save_Dialog_Button);
	}

	public void validateFileStatus(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElement(driver, ApplicationID);
		Assert.assertTrue(ReusableMethods
				.isDisplayed(getFileStatusValue(scenarioContext.getTestData(FieldNames.FileStatus.toString()))));
	}

	public void validateConnectedPartyLinks() {
		ReusableMethods.waitForElement(driver, CustomerConnected_Parties_link);
		Assert.assertTrue(ReusableMethods.isDisplayed(BeneficialOwnerIdentification_Link));
		Assert.assertTrue(ReusableMethods.isDisplayed(CustomerConnected_Parties_link));
	}

	public void validateBeneficialOwnerIdentificationFields() throws Exception {
		ReusableMethods.compareList(BO_Labels, Constant.BENEFICIALOWNERIDENTIAL_LABELS);
	}

	public void clickCustomerAndConnectedParties_Link() {
		ReusableMethods.waitForElement(driver, CustomerConnected_Parties_link);
		ReusableMethods.click(driver, CustomerConnected_Parties_link);
	}

	public void validateTabs_CustomerAndConnectedParties() {
		ReusableMethods.waitForElement(driver, CustomerConnected_Parties_link);
		ReusableMethods.click(driver, CustomerConnected_Parties_link);
		Assert.assertTrue(ReusableMethods.isDisplayed(Customer_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(Individual_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_Tab));
	}

	public void validateButtons_Label_CustomerTab() {
		Assert.assertTrue(ReusableMethods.isDisplayed(CustomerName_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(NameScreening_Label_And_Checkbox));
		Assert.assertTrue(ReusableMethods.isDisplayed(NameScreening_Button));
	}

	public void validateButtons_Label_IndividualTab() {
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

	public void validateButtons_Label_NonIndividualTab() throws Exception {
		ReusableMethods.click(driver, NonIndividual_Tab);
		ReusableMethods.Sleep(3);
		Assert.assertTrue(ReusableMethods.isDisplayed(Relationshipwithcustomer_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_LegalName_TextField));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_NatureOfBussiness_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_PurposeOfAccountOpening_TextArea));
		ReusableMethods.ScrollToElement_JavScript(driver, NonIndividual_Industry_Dropdown);
		// ReusableMethods.compareList(NonIndividual_PrinicipalOfficeAddress_TextFields,
		// Constant.NONINDIVIDUAL_PRINICIPALOFFICEADDRESS);
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
		// ReusableMethods.compareList(NonIndividual_PrinicipalOfficeAddress_TextFields,
		// Constant.ADDRESSFIELDS);
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_RemoveRelatedParty_Button));
		Assert.assertTrue(ReusableMethods.isDisplayed(NonIndividual_NameScreening_Button));
	}

	public void clickDiligenceTab() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, DueDiligence_Tab);
	}

	public void clickMandatoryDiligenceTab() {
		ReusableMethods.waitForElementToBeDisplayed(Diligence_MandatoryDueDiligence_Tab, 10, driver);
		ReusableMethods.click(driver, Diligence_MandatoryDueDiligence_Tab);
	}

	public void validateDueDiligenceTabs() {
		ReusableMethods.waitForElementToBeDisplayed(Diligence_Cancel_Button, 20, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_SpecilizedDueDiligence_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_MandatoryDueDiligence_Tab));

	}

	public void validateSpecilizedDiligenceSection() {
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_AddRemoveIndustryStandard_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_AddRemoveIndustryStandard_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_AddRemoveIndustryStandard_Button));
	}

	public void validateMandatoryDiligence_Customer() {
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Customer_Title_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_PEPComplete_Yes_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_PEPComplete_No_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_RefinitivScreeningOutcome_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_RiskRating_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Comments_TextField));
	}

	public void validateMandatoryDiligence_NonIndividual() {
		ReusableMethods.waitForElementToBeDisplayed(Diligence_NonIndividual_Tab, 10, driver);
		ReusableMethods.click(driver, Diligence_NonIndividual_Tab);
		ReusableMethods.waitForElementToBeDisplayed(Diligence_Customer_Title_Label, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Customer_Title_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Controllers_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_PEPComplete_Yes_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_PEPComplete_No_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_RefinitivScreeningOutcome_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_RiskRating_Dropdown));
		Assert.assertTrue(ReusableMethods.isDisplayed(Diligence_Comments_TextField));
	}

	public void clickDocumentationTab() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, Documentation_Tab);
	}

	public void validateDocumentationTabs() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_IDV_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_DocumentTracking_Tab));
	}

	public void validateIDVDocumentationTabs() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_Customer_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_NonIndividual_Tab));
	}

	public void validateDocument_Customer_NonIndividual_Section(String tabType) throws Exception {
		if (tabType.equals("Non Individual")) {
			ReusableMethods.click(driver, Doc_NonIndividual_Tab);
			ReusableMethods.waitForElement(driver, Doc_NonIndividualControllers_Label);
		}
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_ApplicationTitle_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_DocSelectionCompleted_Yes_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_DocSelectionCompleted_No_RadioButton));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_SelectedDocuments_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_ListOfDocuments_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_OtherDocuments_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_OtherDocuments_Note));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_Add_Icon));

		switch (tabType) {
		case "Customer":
			Assert.assertFalse(ReusableMethods.isDisplayed(Doc_NonIndividualControllers_Label));
			ReusableMethods.compareList(Doc_Table_Header, Constant.DOC_CUSTOMER_TABLE_HEADER);
			Assert.assertNotNull(ReusableMethods.getListofElementsCount(Doc_Table_Data));
			break;

		case "Non Individual":
			Assert.assertTrue(ReusableMethods.isDisplayed(Doc_NonIndividualControllers_Label));
			ReusableMethods.compareList(Doc_Table_Header, Constant.DOC_NONINDIVIDUAL_TABLE_HEADER);
			Assert.assertNotNull(ReusableMethods.getListofElementsCount(Doc_Table_Data));
			break;
		}
	}

	public void clickDocumentTrackingTab() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, Doc_DocumentTracking_Tab);
	}

	public void validateDocument_Customer_NonIndividual_DocumentTrackingSection(String tabType) throws Exception {
		if (tabType.equals("Non Individual")) {
			ReusableMethods.click(driver, Doc_NonIndividual_Tab);
			ReusableMethods.waitForElement(driver, Doc_NonIndividualControllers_Label);
			Assert.assertTrue(ReusableMethods.isDisplayed(Doc_NonIndividualControllers_Label));
		}

		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_ApplicationTitle_Label));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_SubmitDocuments_Note));
	}

	public void clickAddIcon_Document() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, Doc_Add_Icon);
	}

	public void clickRemoveIcon_Document() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, Doc_Remove_Icon);
	}

	public void enterOtherDocuments_Info() {
		ReusableMethods.waitForElement(driver, Doc_DocumentName_TextField);
		ReusableMethods.EnterValue(driver, Doc_DocumentName_TextField,
				ReusableMethods.generateRandomValues("alphabets", 5));
		ReusableMethods.EnterValue(driver, Doc_CertificationRequirment_TextField,
				ReusableMethods.generateRandomValues("alphabets", 16));
		ReusableMethods.click(driver, Doc_Mandatory_Dropdown);
		ReusableMethods.click(driver, Doc_Mandatory_Selection_Dropdown);
	}

	public void validateSaveAndProceedButton(String value) {
		if (value.equals("Enable")) {
			Assert.assertTrue(ReusableMethods.isEnabled(Save_Proceed_Button));
		} else {
			Assert.assertFalse(ReusableMethods.isEnabled(Save_Proceed_Button));
		}
	}

	public void validateOtherDocumentFieldDisapper() {
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_DocumentName_TextField));
		Assert.assertTrue(ReusableMethods.isDisplayed(Doc_CertificationRequirment_TextField));
	}

	public void clickRiskAssessmentTab() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, RiskAssessment_Tab);
	}

	public void validateRiskAssesmentSection() throws Exception {
		ReusableMethods.waitForElement(driver, Save_Submit_Button);
		Assert.assertFalse(ReusableMethods.isEnabled(Save_Submit_Button));
		ReusableMethods.compareList(RiskAssesment_Labels_Headers, Constant.RISKASSESMENT_LABELS_FIELDS);
	}

	public void clickProfileSummaryTab() {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 10, driver);
		ReusableMethods.click(driver, ProfileSummary_Tab);
	}

	public void validateProfileSummaryTabs() {
		Assert.assertTrue(ReusableMethods.isDisplayed(ProfileDetails_Tab));
		Assert.assertTrue(ReusableMethods.isDisplayed(ProfileHistory_Tab));
	}

	public void validateCustomerInformationAndRiskSummary() throws Exception {
		ReusableMethods.waitForElement(driver, Profile_CustomerInformation_Header);
		ReusableMethods.compareList(Profile_CustomerInformation_Labels, Constant.PROFILEDETAILS_LABELS);
		ReusableMethods.compareList(Profile_Customer_RiskSummary_Labels_Table, Constant.PROFILEDETAILS_TABLEINFO);
	}

	public void validateProfileDetailsSaveButton() throws InterruptedException {
		String value = ReusableMethods.GetTextData(WaiverApplied_Text);

		if (value.equals("Yes")) {
			Assert.assertFalse(ReusableMethods.isEnabled(Profile_SaveButton));
		} else {
			Assert.assertTrue(ReusableMethods.isEnabled(Profile_SaveButton));
			ReusableMethods.click(driver, WaiverApplied_ToggleButton);
			ReusableMethods.Sleep(2);
			Assert.assertFalse(ReusableMethods.isEnabled(Profile_SaveButton));
		}
	}

	public void validateProfileHistory() throws Exception {
		ReusableMethods.click(driver, ProfileHistory_Tab);
		ReusableMethods.waitForElement(driver, ProfileHistory_Download_Button);
		Assert.assertTrue(ReusableMethods.isEnabled(ProfileHistory_Download_Button));
		Assert.assertNotNull(ReusableMethods.getListofElementsCount(ProfileHistory_CustomerInfo));
		ReusableMethods.compareList(ProfileHistory_TableHeaders, Constant.PROFILEHISTORY_TABLEHEADER);
	}

	public void clickMakersButton() {
		ReusableMethods.waitForElementToBeDisplayed(Makers_Button, 30, driver);
		ReusableMethods.click_javaScript(driver, Makers_Button);
	}

	public void validateMakersPopUp() {
		ReusableMethods.waitForElement(driver, Makers_Cancel_Button);
		Assert.assertTrue(ReusableMethods.isDisplayed(Makers_Header));
		Assert.assertTrue(ReusableMethods.isDisplayed(Makers_Comments_TextField));
		Assert.assertTrue(ReusableMethods.isDisplayed(Makers_Cancel_Button));
		Assert.assertFalse(ReusableMethods.isEnabled(Makers_Update_Button));
	}

	public void enterMakersComments(String value, ScenarioContext scenarioContext) throws InterruptedException {
		ReusableMethods.waitForElement(driver, Makers_Comments_TextField);
		ReusableMethods.Sleep(4);
		String comments = ReusableMethods.generateRandomValues("alphabets", 15);
		scenarioContext.addTestData(FieldNames.MakerComments.toString(), comments);
		ReusableMethods.ClearAndEnterValue(driver, Makers_Comments_TextField,
				scenarioContext.getTestData(FieldNames.MakerComments.toString()));
		if (value.equals("Update")) {
			ReusableMethods.click(driver, Makers_Update_Button);
		} else {
			ReusableMethods.click(driver, Makers_Cancel_Button);
		}
	}

	public void validateMakerComments(String value, ScenarioContext scenarioContext) {
		ReusableMethods.waitForElement(driver, Makers_Comments_TextField);
		if (value.equals("Not Saved"))
			Assert.assertNotEquals(ReusableMethods.GetValueByAttribute(Makers_Comments_TextField, "value"),
					scenarioContext.getTestData(FieldNames.MakerComments.toString()));
		else
			Assert.assertEquals(ReusableMethods.GetValueByAttribute(Makers_Comments_TextField, "value"),
					scenarioContext.getTestData(FieldNames.MakerComments.toString()));
		ReusableMethods.click(driver, Makers_Cancel_Button);
	}

	public void enterMoreThan50Characeters(String fieldName) {
		String word = "i am from hyderabda listing entering dancing footba";

		switch (fieldName) {
		case "CoreBankingID":
			ReusableMethods.ClearAndEnterValue(driver, CoreBanking_ID_TextField, word);
			break;
		case "CustomerSourcedThrough":
			ReusableMethods.ClearAndEnterValue(driver, CustomerSourcedThrough_TextField, word);
			break;
		case "BussinessSegment":
			ReusableMethods.ClearAndEnterValue(driver, BusinessSegment_TextField, word);
			break;
		case "RMName":
			ReusableMethods.ClearAndEnterValue(driver, RMName_TextField, word);
			break;
		case "Tranperency":
			ReusableMethods.ClearAndEnterValue(driver, Transparency_TextField, word);
			break;

		}
	}

	public void validateFieldCharacterLimit(String fieldName) {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 30, driver);
		String expectedword = "i am from hyderabda listing entering dancing footb";
		switch (fieldName) {
		case "CoreBankingID":
			Assert.assertEquals(ReusableMethods.GetValueByAttribute(CoreBanking_ID_TextField, "value"), expectedword);
			break;
		case "CustomerSourcedThrough":
			Assert.assertEquals(ReusableMethods.GetValueByAttribute(CustomerSourcedThrough_TextField, "value"),
					expectedword);
			break;
		case "BussinessSegment":
			Assert.assertEquals(ReusableMethods.GetValueByAttribute(BusinessSegment_TextField, "value"), expectedword);
			break;
		case "RMName":
			Assert.assertEquals(ReusableMethods.GetValueByAttribute(RMName_TextField, "value"), expectedword);
			break;
		case "Tranperency":
			Assert.assertEquals(ReusableMethods.GetValueByAttribute(Transparency_TextField, "value"), expectedword);
			break;

		}
	}

	public void enterCustomerIdentificationInformation(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 30, driver);
		scenarioContext.addTestData(FieldNames.LegalName.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, LegalName_TextField,
				scenarioContext.getTestData(FieldNames.LegalName.toString()));

		scenarioContext.addTestData(FieldNames.FormarName.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, FormerName_TextField,
				scenarioContext.getTestData(FieldNames.FormarName.toString()));

		scenarioContext.addTestData(FieldNames.Line1.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, CI_Line1_TextFIeld,
				scenarioContext.getTestData(FieldNames.Line1.toString()));

		scenarioContext.addTestData(FieldNames.Line2.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, CI_Line2_TextFIeld,
				scenarioContext.getTestData(FieldNames.Line2.toString()));

		scenarioContext.addTestData(FieldNames.Street.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, CI_Street_TextFIeld,
				scenarioContext.getTestData(FieldNames.Street.toString()));

		scenarioContext.addTestData(FieldNames.City.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, CI_City_TextFIeld,
				scenarioContext.getTestData(FieldNames.City.toString()));

		scenarioContext.addTestData(FieldNames.Pincode.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, CI_Pincode_TextFIeld,
				scenarioContext.getTestData(FieldNames.Pincode.toString()));
	}

	public void validateCIformationInfo(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 30, driver);
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(LegalName_TextField, "value"),
				scenarioContext.getTestData(FieldNames.LegalName.toString()));

		Assert.assertEquals(ReusableMethods.GetValueByAttribute(FormerName_TextField, "value"),
				scenarioContext.getTestData(FieldNames.FormarName.toString()));

		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CI_Line1_TextFIeld, "value"),
				scenarioContext.getTestData(FieldNames.Line1.toString()));

		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CI_Line2_TextFIeld, "value"),
				scenarioContext.getTestData(FieldNames.Line2.toString()));

		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CI_Street_TextFIeld, "value"),
				scenarioContext.getTestData(FieldNames.Street.toString()));

		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CI_City_TextFIeld, "value"),
				scenarioContext.getTestData(FieldNames.City.toString()));

		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CI_Pincode_TextFIeld, "value"),
				scenarioContext.getTestData(FieldNames.Pincode.toString()));
	}

	public void validatePageNavigatedTOBI() {
		ReusableMethods.waitForElementToBeDisplayed(NatureOfBussiness_Header, 10, driver);
		Assert.assertTrue(ReusableMethods.isDisplayed(NatureOfBussiness_Header));
	}

	public void clickCustomerIdentificationTab() throws InterruptedException {
		ReusableMethods.waitForElement(driver, Save_Proceed_Button);
		ReusableMethods.waitForElementToBeDisplayed(CustomerIdentification_Tab, 30, driver);
		ReusableMethods.Sleep(5);
		ReusableMethods.click(driver, CustomerIdentification_Tab);
	}

	public void validateFieldCount(String tabName) {
		if (tabName.equals("Public-CustomerInformation"))
			Assert.assertEquals(ReusableMethods.getListofElementsCount(Get_Fields_Count), 8);
		else if (tabName.equals("Public-NatureOfBussinessActivity"))
			Assert.assertEquals(ReusableMethods.getListofElementsCount(Get_Fields_Count), 2);
		else if (tabName.equals("Public-Risk Evaluation"))
			Assert.assertEquals(ReusableMethods.getListofElementsCount(Get_Fields_Count), 4);
		else if (tabName.equals("Public-Internal Information"))
			Assert.assertEquals(ReusableMethods.getListofElementsCount(Get_Fields_Count), 5);
		else if (tabName.equals("Public-New Level"))
			Assert.assertEquals(ReusableMethods.getListofElementsCount(Get_Fields_Count), 2);

	}

	public void enterDynamicInternalInformationSectionInfo(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 30, driver);
		scenarioContext.addTestData(FieldNames.CoreBankingID.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, CoreBanking_ID_TextField,
				scenarioContext.getTestData(FieldNames.CoreBankingID.toString()));
		ReusableMethods.click(driver, DynamicCustomerSourcedThrough_Dropdown);
		ReusableMethods.click(driver, DynamicCustomerSourcedThrough_Value);
		ReusableMethods.moveToElement(driver, CoreBanking_ID_TextField);
		ReusableMethods.click(driver, DynamicBussinessSegment_Dropdown);
		ReusableMethods.click(driver, DynamicBussinessSegment_Value);
		ReusableMethods.moveToElement(driver, CoreBanking_ID_TextField);
		scenarioContext.addTestData(FieldNames.RMName.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, RMName_TextField,
				scenarioContext.getTestData(FieldNames.RMName.toString()));
		ReusableMethods.click(driver, CalenderOpen_Button);
		ReusableMethods.click(driver, SelectDate);
		scenarioContext.addTestData(FieldNames.DateOfCutomerVisit.toString(),
				ReusableMethods.GetValueByAttribute(DateofCustomerVisit_TextField, "Text"));
	}

	public void validatePageNavigation(String tabName) {
		switch (tabName) {
		case "Entity Information":
			ReusableMethods.waitForElement(driver, CustomerInformation_Tab);
			Assert.assertTrue(ReusableMethods.isDisplayed(CustomerInformation_Tab));
			break;
		case "Nature of Business and Business Activity":
			ReusableMethods.waitForElement(driver, IndustryType_Drp);
			Assert.assertTrue(ReusableMethods.isDisplayed(IndustryType_Drp));
			break;
		case "New Level":
			ReusableMethods.waitForElement(driver, Risk1_Dropdown);
			Assert.assertTrue(ReusableMethods.isDisplayed(Risk1_Dropdown));
			break;

		case "Beneficial Owner Identification":
			ReusableMethods.waitForElement(driver, BeneficialOwnerIdentification_Link);
			Assert.assertTrue(ReusableMethods.isDisplayed(BeneficialOwnerIdentification_Link));
			break;
		}
	}

	public void validateDynamicInternalInformationInfo(ScenarioContext scenarioContext) {
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(CoreBanking_ID_TextField, "value"),
				scenarioContext.getTestData(FieldNames.CoreBankingID.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(RMName_TextField, "value"),
				scenarioContext.getTestData(FieldNames.RMName.toString()));
	}

	public void enterFieldsData(ScenarioContext scenarioContext, String tabName) {
		System.out.println();
		switch (tabName) {
		case "Public-CustomerInformation":
			enter_Public_CustomerInformation(scenarioContext);
			;
			break;

		case "Public-NatureOfBussinessActivity":
			enter_Public_NaureofBussinessActivity(scenarioContext);
			break;

		case "Public-Risk Evaluation":
			enter_Public_RiskEvaluation(scenarioContext);
			break;

		case "Public-New Level":
			enter_Public_NewLevel(scenarioContext);
			break;
		}
	}

	public void validateFieldsData(ScenarioContext scenarioContext, String tabName) {
		switch (tabName) {
		case "Public-CustomerInformation":
			validate_PublicCustomerInformation(scenarioContext);
			break;

		case "Public-NatureOfBussinessActivity":
			validate_NaureofBussinessActivity(scenarioContext);
			break;

		case "Public-Risk Evaluation":
			validate_RiskEvaluationData(scenarioContext);
			break;

		case "Public-New Level":
			enter_Public_NewLevel(scenarioContext);
			break;
		}
	}

	public void clickTabs(String tabName) throws InterruptedException {
		ReusableMethods.Sleep(5);
		switch (tabName) {
		case "Customer Information":
			ReusableMethods.waitForElementToBeClickable(driver, CustomerInformation_Tab);
			ReusableMethods.click(driver, CustomerInformation_Tab);
			break;
		case "NatureOfBussinessActivity":
			ReusableMethods.waitForElementToBeDisplayed(BussinessInformation_Tab, 30, driver);
			ReusableMethods.click(driver, BussinessInformation_Tab);
			break;
		case "ProductInformation":
			ReusableMethods.waitForElementToBeDisplayed(ProductInformation_Tab, 30, driver);
			ReusableMethods.click(driver, ProductInformation_Tab);
			break;
		case "Risk Evaluation":
			ReusableMethods.waitForElementToBeDisplayed(RiskEvaluation_Tab, 30, driver);
			ReusableMethods.click(driver, RiskEvaluation_Tab);
			break;
		case "New Level":
			ReusableMethods.waitForElementToBeDisplayed(NewLevel_Tab, 30, driver);
			ReusableMethods.click(driver, NewLevel_Tab);
			break;
		}

	}

	public void enter_Public_CustomerInformation(ScenarioContext scenarioContext) {
		scenarioContext.addTestData(FieldNames.CountryOfIncorporation.toString(), "Singapore");
		scenarioContext.addTestData(FieldNames.TaxResidingStatus.toString(), "Resident in Singapore");
		scenarioContext.addTestData(FieldNames.LegalStatus.toString(), "Private Limited Company");
		scenarioContext.addTestData(FieldNames.StockExchange.toString(), "The Iceland Stock Exchange");
		ReusableMethods.waitForElementToBeDisplayed(Save_Proceed_Button, 30, driver);
		// Country of Corporation
		ReusableMethods.click(driver, CountryOfCorporation_Drp);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.CountryOfIncorporation.toString())));
		ReusableMethods.click(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.CountryOfIncorporation.toString())));
		// Tax Residing Dropdown
		ReusableMethods.click(driver, TaxResidencyStatus_Drp);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.TaxResidingStatus.toString())));
		ReusableMethods.click(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.TaxResidingStatus.toString())));
		// TaxReferenceNumber
		scenarioContext.addTestData(FieldNames.TaxReferenceNumber.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, TaxReferenceNumber_TextField,
				scenarioContext.getTestData(FieldNames.TaxReferenceNumber.toString()));
		// LegalStatus
		ReusableMethods.click(driver, LegalStatus_Drp);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.LegalStatus.toString())));
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData(FieldNames.LegalStatus.toString())));
		// Banking
		scenarioContext.addTestData(FieldNames.BankName.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, BankName_TextField,
				scenarioContext.getTestData(FieldNames.BankName.toString()));
		// Country
		scenarioContext.addTestData(FieldNames.Country.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, Country_TextField,
				scenarioContext.getTestData(FieldNames.Country.toString()));

		// RelationShipType
		scenarioContext.addTestData(FieldNames.RelationShiptype.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, RelationShip_TextField,
				scenarioContext.getTestData(FieldNames.RelationShiptype.toString()));

		// StockExchange
		ReusableMethods.click(driver, StockExchange_Drp);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.StockExchange.toString())));
		ReusableMethods.click(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.StockExchange.toString())));
		ReusableMethods.moveToElement(driver, CustomerInformation_Tab);
	}

	public void validate_PublicCustomerInformation(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElement(driver, Save_Proceed_Button);
		Assert.assertEquals(ReusableMethods.GetTextData(CountryOfCorporation_Drp),
				scenarioContext.getTestData(FieldNames.CountryOfIncorporation.toString()));
		Assert.assertEquals(ReusableMethods.GetTextData(TaxResidencyStatus_Drp),
				scenarioContext.getTestData(FieldNames.TaxResidingStatus.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(TaxReferenceNumber_TextField, "value"),
				scenarioContext.getTestData(FieldNames.TaxReferenceNumber.toString()));
		Assert.assertEquals(ReusableMethods.GetTextData(LegalStatus_Drp),
				scenarioContext.getTestData(FieldNames.LegalStatus.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(BankName_TextField, "value"),
				scenarioContext.getTestData(FieldNames.BankName.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(Country_TextField, "value"),
				scenarioContext.getTestData(FieldNames.Country.toString()));
		Assert.assertEquals(ReusableMethods.GetValueByAttribute(RelationShip_TextField, "value"),
				scenarioContext.getTestData(FieldNames.RelationShiptype.toString()));
		Assert.assertEquals(ReusableMethods.GetTextData(StockExchange_Drp),
				scenarioContext.getTestData(FieldNames.StockExchange.toString()));
	}

	public void enter_Public_NaureofBussinessActivity(ScenarioContext scenarioContext) {
		scenarioContext.addTestData(FieldNames.IndustryType.toString(), "Central Bank");
		// Please provide brief details of Products/Services (including details of Items
		// / Goods Manufactured or Traded, Services Provided)
		scenarioContext.addTestData(FieldNames.Prodcution_Services.toString(),
				ReusableMethods.generateRandomValues("alphaNumeric", 10));
		ReusableMethods.ClearAndEnterValue(driver, ProvideDetails_TextArea,
				scenarioContext.getTestData(FieldNames.Prodcution_Services.toString()));
		// Industry Type
		ReusableMethods.click(driver, IndustryType_Drp);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.IndustryType.toString())));
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData(FieldNames.IndustryType.toString())));
		ReusableMethods.moveToElement(driver, BussinessInformation_Tab);
	}

	public void validate_NaureofBussinessActivity(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElement(driver, Save_Proceed_Button);
		Assert.assertEquals(ReusableMethods.GetTextData(IndustryType_Drp),
				scenarioContext.getTestData(FieldNames.IndustryType.toString()));

		Assert.assertEquals(ReusableMethods.GetValueByAttribute(ProvideDetails_TextArea, "value"),
				scenarioContext.getTestData(FieldNames.Prodcution_Services.toString()));

	}

	public void enter_Public_RiskEvaluation(ScenarioContext scenarioContext) {
		scenarioContext.addTestData(FieldNames.RiskProducts.toString(), "Mortgage");
		scenarioContext.addTestData(FieldNames.RiskIndustry.toString(), "Central Bank");
		scenarioContext.addTestData(FieldNames.RiskCountriesOfOperations.toString(), "India");
		scenarioContext.addTestData(FieldNames.RiskGovtOwned.toString(), "Yes");

		// Products
		ReusableMethods.click(driver, RiskProducts_Dropdown);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.RiskProducts.toString())));
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData(FieldNames.RiskProducts.toString())));
		ReusableMethods.moveToElement(driver, RiskEvaluation_Tab);

		// Industry Type
		ReusableMethods.click(driver, RiskIndusrtry_Dropdown);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.RiskIndustry.toString())));
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData(FieldNames.RiskIndustry.toString())));
		ReusableMethods.moveToElement(driver, RiskEvaluation_Tab);

		// Countries Of Operation Type
		ReusableMethods.click(driver, RiskCountriesOfOPerations_Dropdown);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.RiskCountriesOfOperations.toString())));
		ReusableMethods.click(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.RiskCountriesOfOperations.toString())));
		ReusableMethods.moveToElement(driver, RiskEvaluation_Tab);

		// GovtOwned
		ReusableMethods.click(driver, RiskGovtOwned_Dropdown);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.RiskGovtOwned.toString())));
		ReusableMethods.click(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.RiskGovtOwned.toString())));
		ReusableMethods.moveToElement(driver, RiskEvaluation_Tab);
	}

	public void validate_RiskEvaluationData(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElement(driver, Save_Proceed_Button);
		Assert.assertEquals(ReusableMethods.GetTextData(RiskProducts_Dropdown),
				scenarioContext.getTestData(FieldNames.RiskProducts.toString()));
		Assert.assertEquals(ReusableMethods.GetTextData(RiskIndusrtry_Dropdown),
				scenarioContext.getTestData(FieldNames.RiskIndustry.toString()));
		Assert.assertEquals(ReusableMethods.GetTextData(RiskCountriesOfOPerations_Dropdown),
				scenarioContext.getTestData(FieldNames.RiskCountriesOfOperations.toString()));
		Assert.assertEquals(ReusableMethods.GetTextData(RiskGovtOwned_Dropdown),
				scenarioContext.getTestData(FieldNames.RiskGovtOwned.toString()));

	}

	public void enter_Public_NewLevel(ScenarioContext scenarioContext) {
		scenarioContext.addTestData(FieldNames.Risk1.toString(), "Wealth");
		scenarioContext.addTestData(FieldNames.Risk2.toString(), "Hold");

		// Risk 1
		ReusableMethods.click(driver, Risk1_Dropdown);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.Risk1.toString())));
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData(FieldNames.Risk1.toString())));
		ReusableMethods.moveToElement(driver, NewLevel_Tab);

		// Risk 2
		ReusableMethods.click(driver, Risk2_Dropdown);
		ReusableMethods.waitForElement(driver,
				GenericDropdwon(scenarioContext.getTestData(FieldNames.Risk2.toString())));
		ReusableMethods.click(driver, GenericDropdwon(scenarioContext.getTestData(FieldNames.Risk2.toString())));
		ReusableMethods.moveToElement(driver, NewLevel_Tab);
	}
	
	public void validate__Public_NewLevel(ScenarioContext scenarioContext) {
		ReusableMethods.waitForElement(driver, Save_Proceed_Button);
		Assert.assertEquals(ReusableMethods.GetTextData(Risk1_Dropdown),
				scenarioContext.getTestData(FieldNames.Risk1.toString()));
		Assert.assertEquals(ReusableMethods.GetTextData(Risk2_Dropdown),
				scenarioContext.getTestData(FieldNames.Risk2.toString()));
	}
}
