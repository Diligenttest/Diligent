package StepDefinations;

import java.io.IOException;
import java.util.List;

import com.TestContext.ScenarioContext;
import com.TestContext.WebTestContext;
import com.aventstack.extentreports.gson.GsonExtentTypeAdapterBuilder;

import genericFunctions.FieldNames;
import genericFunctions.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.LoginPage;
import web.pages.QueuePage;

public class QueuePageSteps {

	private WebTestContext webTestContext;
	private ScenarioContext scenarioContext;
	private QueuePage getQueuePage;

	public QueuePageSteps(WebTestContext webTestContext, ScenarioContext scenarioContext) {
		this.webTestContext = webTestContext;
		this.scenarioContext = scenarioContext;
		getQueuePage = this.webTestContext.getWebPageObject().getQueuePage();

	}

	@Then("I should validate application navigated to queue config screen")
	public void i_should_validate_application_navigated_to_queue_config_screen() throws IOException {
		getQueuePage.validateQueueUrl(
				ReusableMethods.getGlobalValue("globalURL") + "" + ReusableMethods.getGlobalValue("QueueUrl"));
	}

	@Then("I should validate below tabs in corporate my queue screen")
	public void i_should_validate_below_tabs_in_corporate_my_queue_screen(DataTable dataTable) throws Exception {
		List<String> expectedValues = dataTable.asList();
		getQueuePage.validateCorporateMyQueueHeaders(expectedValues);
	}

	@Then("I should validate table headers for customer under onboard customer")
	public void i_should_validate_table_headers_for_customer_under_onboard_customer() throws Exception {
		getQueuePage.validateOnboardCustomerTableHeaders(null);
	}

	@When("I click on the {string} subtab in the left pane from Dashboard")
	public void i_click_on_the_subtab_in_the_left_pane_from_dashboard(String string) {
		getQueuePage.clickCorporate_Queue();
	}

	@When("I click on any existing Application ID")
	public void i_click_on_any_existing_application_id() {
		getQueuePage.clickAnyExistingApplicationID();
	}
	
	@When("I click on existing customer as {string}")
	public void i_click_on_existing_customer_as(String customerName) {
	    getQueuePage.clickExistingCustomerName(customerName);
	}

	@Then("I should validate tabs in the onboarding screen")
	public void i_should_validate_tabs_in_the_onboarding_screen() throws Exception {
		getQueuePage.validateOnboardingTabs();
	}

	@Then("I should validate fields in the Internal Information screen")
	public void i_should_validate_fields_in_the_Internal_Information_screen() {
		getQueuePage.validateInternalInformation_Fields();
	}

	@Then("I should validate buttons in the onboarding screen")
	public void i_should_validate_buttons_in_the_onboarding_screen() {
		getQueuePage.validateOnboarding_Buttons();
	}

	@When("I click on <Entity Information> tab in the onborading screen")
	public void i_click_on_entity_information_tab_in_the_onborading_screen() {
		getQueuePage.clickEntityInformationButton();
	}

	@When("I click on <Connected Party & Screening> tab in the onborading screen")
	public void i_click_on_connected_party_screening_tab_in_the_onborading_screen() {
		getQueuePage.clickConnectedPartyScreeningButton();
	}

	@Then("I should validate fields under {string}")
	public void i_should_validate_fields_under(String tabName) throws Exception {
		switch (tabName) {
		case "Customer Identification Information":
			getQueuePage.validateCII_Fields();
			break;
		case "Bussiness Information":
			getQueuePage.validateBA_Fields();
			break;
		case "Product Information":
			getQueuePage.validatePA_Fields();
			break;
		case "Contact Information":
			getQueuePage.validateCA_Fields();
			break;
		case "Other Information":
			getQueuePage.validateOtherInformation_Fields();
			break;

		}
	}

	@When("I enter all the information under <Internal Information> section")
	public void i_enter_all_the_information_under_internal_information_section() {
		getQueuePage.enterInternalInformationSectionInfo(scenarioContext);
	}
	
	@When("I enter all the information under <Dynamic Internal Information> section")
	public void i_enter_all_the_information_under_Dynamic_internal_information_section() {
		getQueuePage.enterDynamicInternalInformationSectionInfo(scenarioContext);
	}


	@When("I click on Save & Proceed button")
	public void i_click_on_save_proceed_button() {
		getQueuePage.clickSaveAndProceedButton();
	}

	@When("I click on <Internal Information> tab in the onborading screen")
	public void i_click_on_internal_information_tab_in_the_onborading_screen() throws InterruptedException {
		getQueuePage.clickInternalInformationButton();
	}

	@Then("I should validate data is saved in internal information section")
	public void i_should_validate_data_is_saved_in_internal_information_section() {
		getQueuePage.validateInternalInformationInfo(scenarioContext);
	}
	
	@Then("I should validate data is saved in dynamic internal information section")
	public void i_should_validate_data_is_saved_in_dynamic_internal_information_section() {
		getQueuePage.validateDynamicInternalInformationInfo(scenarioContext);
	}

	@When("I click on Save & Exit button")
	public void i_click_on_save_exit_button() {
		getQueuePage.clickSaveAndExitButton(scenarioContext);
	}

	@Then("I should validate page is navigated to <Entity Information> screen")
	public void i_should_validate_page_is_navigated_to_entity_information_screen() throws Exception {
		getQueuePage.validateCII_Fields();
	}
	
	@Then("I should validate page is navigated to {string} screen")
	public void i_should_validate_page_is_navigated_to_Dynamic_entity_information_screen(String tabName) throws Exception {
		getQueuePage.validatePageNavigation(tabName);
	}

	@Then("I should validate File Status is displayed as selected")
	public void i_should_validate_file_status_is_displayed_as_selected() {
		getQueuePage.validateFileStatus(scenarioContext);
	}

	@Then("I should validate tabs under connected pary screening")
	public void i_should_validate_tabs_under_connected_pary_screening() {
		getQueuePage.validateConnectedPartyLinks();
	}

	@Then("I should validate fields under <Beneficial Owner Identification>")
	public void i_should_validate_fields_under_beneficial_owner_identification() throws Exception {
		getQueuePage.validateBeneficialOwnerIdentificationFields();
	}

	@When("I click on <Customer and Connected Parties> link")
	public void i_click_on_customer_and_connected_parties_link() {
		getQueuePage.clickCustomerAndConnectedParties_Link();
	}

	@Then("I should validate tabs under <Customer and Connected Parties>")
	public void i_should_validate_tabs_under_customer_and_connected_parties() {
		getQueuePage.validateTabs_CustomerAndConnectedParties();
	}

	@Then("I should validate fields under {string} under Customer and Connected Parties")
	public void i_should_validate_fields_under_under_customer_and_connected_parties(String tabName) throws Exception {
		switch (tabName) {
		case "Customer":
			getQueuePage.validateButtons_Label_CustomerTab();
			break;

		case "Individual":
			getQueuePage.validateButtons_Label_IndividualTab();
			break;

		case "Non-Individual":
			getQueuePage.validateButtons_Label_NonIndividualTab();
			break;
		}
	}

	@When("I click on <Due Diligence> tab in the onborading screen")
	public void i_click_on_due_diligence_tab_in_the_onborading_screen() {
		getQueuePage.clickDiligenceTab();
	}

	@Then("I should validate tabs under <Due Diligence>")
	public void i_should_validate_tabs_under_due_diligence() {
		getQueuePage.validateDueDiligenceTabs();
	}

	@Then("I should validate fields under <Specilized Due Diligence> section")
	public void i_should_validate_fields_under_specilized_due_diligence_section() {
		getQueuePage.validateSpecilizedDiligenceSection();
	}

	@When("I click on <Mandatory Due Diligence> tab")
	public void i_click_on_mandatory_due_diligence_tab() {
		getQueuePage.clickMandatoryDiligenceTab();
	}

	@Then("I should validate fields under {string} section under Pep \\(corp)")
	public void i_should_validate_fields_under_section_under_pep_corp(String tabName) {
		switch (tabName) {
		case "Customer":
			getQueuePage.validateMandatoryDiligence_Customer();
			break;
		case "Non-Individual":
			getQueuePage.validateMandatoryDiligence_NonIndividual();
			break;
		}
	}
	
	@When("I click on <Documentation> tab in the onborading screen")
	public void i_click_on_documentation_tab_in_the_onborading_screen() {
		getQueuePage.clickDocumentationTab();
	}
	@Then("I should validate tabs under <Documentation> section")
	public void i_should_validate_tabs_under_documentation_section() {
	   getQueuePage.validateDocumentationTabs();
	}
	@Then("I should validate tabs under <ID&V Documentation> section")
	public void i_should_validate_tabs_under_id_v_documentation_section() {
	    getQueuePage.validateIDVDocumentationTabs();
	}
	@Then("I should validate tabs labels, headers and table data under {string} section")
	public void i_should_validate_tabs_labels_headers_and_table_data_under_section(String tabType) throws Exception {
		getQueuePage.validateDocument_Customer_NonIndividual_Section(tabType);
	}
	
	@When("I click on <Document Tracking< tab under Documentation")
	public void i_click_on_document_tracking_tab_under_documentation() {
		getQueuePage.clickDocumentTrackingTab();
	}
	@Then("I should validate label, headers and button for {string} under Document Tracking section")
	public void i_should_validate_label_headers_and_button_for_under_document_tracking_section(String tabType) throws Exception {
	    getQueuePage.validateDocument_Customer_NonIndividual_DocumentTrackingSection(tabType);
	}
	
	@When("I click on Add Icon button")
	public void i_click_on_add_icon_button() {
	    getQueuePage.clickAddIcon_Document();
	}
	@Then("I should validate Save & Proceed button is {string}")
	public void i_should_validate_save_proceed_button_is(String value) {
	    getQueuePage.validateSaveAndProceedButton(value);
	}
	@When("I enter <DocumentName> ,<Mandatory> and certification requirement")
	public void i_enter_document_name_mandatory_and_certification_requirement() {
	    getQueuePage.enterOtherDocuments_Info();
	}
	@Then("I click on Remove Icon button")
	public void i_click_on_remove_icon_button() {
	    getQueuePage.clickRemoveIcon_Document();
	}
	@Then("I should validate section is disappeared under other documents sections")
	public void i_should_validate_section_is_disappeared_under_other_documents_sections() {
	   getQueuePage.validateOtherDocumentFieldDisapper();
	}
	
	@When("I click on <Risk Assessment> tab in the onborading screen")
	public void i_click_on_risk_assessment_tab_in_the_onborading_screen() {
	   getQueuePage.clickRiskAssessmentTab();
	}
	@Then("I should validate <Risk Assesment Section> under Risk Assessment")
	public void i_should_validate_under_risk_assessment() throws Exception {
		getQueuePage.validateRiskAssesmentSection();
	}

	@When("I click on <Profile Summary> tab in the onborading screen")
	public void i_click_on_profile_summary_tab_in_the_onborading_screen() {
	    getQueuePage.clickProfileSummaryTab();
	}
	@Then("I should validate Tabs under <Profile Summary> Section")
	public void i_should_validate_tabs_under_profile_summary_section() {
	   getQueuePage.validateProfileSummaryTabs();
	}
	@Then("I should validate <Customer> and  <Risk Assesment summary> information summary section")
	public void i_should_validate_customer_and_risk_assesment_summary_information_summary_section() throws Exception {
	   getQueuePage.validateCustomerInformationAndRiskSummary();
	}

	@Then("I should validate profile save button for waiver applied section")
	public void i_should_validate_save_button_in_on_selecting_waiver_applier_as_yes() throws InterruptedException {
	    getQueuePage.validateProfileDetailsSaveButton();
	}

	@Then("I should validate Profile History Section")
	public void i_should_validate_profile_history_section() throws Exception {
	   getQueuePage.validateProfileHistory();
	}
	
	@When("I click on Maker comments button under internal information tab")
	public void i_click_on_maker_comments_button_under_internal_information_tab() {
	    getQueuePage.clickMakersButton();
	}
	@Then("I should validate Maker comments pop with comments,update and cancel button")
	public void i_should_validate_maker_comments_pop_with_comments_update_and_cancel_button() {
	   getQueuePage.validateMakersPopUp();
	}
	@When("I enter comments and click on {string} button")
	public void i_enter_comments_and_click_on_button(String value) throws InterruptedException {
	   getQueuePage.enterMakersComments(value, scenarioContext);
	}
	@Then("I should validate the text is {string} in comments section")
	public void i_should_validate_the_text_is_in_comments_section(String value) {
	  getQueuePage.validateMakerComments(value, scenarioContext);
	}
	
	@When("I enter more than {int} characters in <{string}>")
	public void i_enter_more_than_characters_in(Integer int1, String fieldName) {
	   getQueuePage.enterMoreThan50Characeters(fieldName);
	}
	@Then("I should validate only {int} characters should be saved in the field <{string}>")
	public void i_should_validate_only_characters_should_be_saved_in_the_field(Integer int1, String fieldName) {
		 getQueuePage.validateFieldCharacterLimit(fieldName);
	}
	
	@When("I enter all the information under <Entity Information> section")
	public void i_enter_all_the_information_under_entity_information_section() {
	   getQueuePage.enterCustomerIdentificationInformation(scenarioContext);
	}
	@Then("I should validate page is navigated to <Bussiness Information> tab screen")
	public void i_should_validate_page_is_navigated_to_bussiness_information_tab_screen() {
	    getQueuePage.validatePageNavigatedTOBI();
	}
	@When("I click on <Customer Identification> tab in the onborading screen")
	public void i_click_on_customer_identification_tab_in_the_onborading_screen() throws InterruptedException {
	   getQueuePage.clickCustomerIdentificationTab();
	}
	@Then("I should validate data is saved in Customer Identification section")
	public void i_should_validate_data_is_saved_in_customer_identification_section() {
	   getQueuePage.validateCIformationInfo(scenarioContext);
	}
	
	@When("I click on any created record through API")
	public void i_click_on_any_created_record_through_api() throws Exception {
	    getQueuePage.clickDynamicRecordID(scenarioContext.getTestData(FieldNames.RecordID.toString()));
	}
	
	@Then("I should validate fields count for {string} sector")
	public void i_should_validate_fields_count_for_under_sector(String tabName) {
		getQueuePage.validateFieldCount(tabName);
	}
	
	@Then("I enter all the information under {string} section")
	public void i_enter_all_the_information_under_section(String tabName) {
	    getQueuePage.enterFieldsData(scenarioContext, tabName);
	}
	@Then("I click on {string} tab in the onborading screen")
	public void i_click_on_tab_in_the_onborading_screen(String tabName) throws InterruptedException {
	    getQueuePage.clickTabs(tabName);;
	}
	@Then("I should validate data is saved under {string} section")
	public void i_should_validate_data_is_saved_under_section(String tabName) {
	   getQueuePage.validateFieldsData(scenarioContext,tabName);
	}
}
