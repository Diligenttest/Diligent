package StepDefinations;

import java.io.IOException;
import java.util.List;

import com.TestContext.ScenarioContext;
import com.TestContext.WebTestContext;

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

	@When("I click on Save & Exit button")
	public void i_click_on_save_exit_button() {
		getQueuePage.clickSaveAndExitButton(scenarioContext);
	}

	@Then("I should validate page is navigated to <Entity Information> screen")
	public void i_should_validate_page_is_navigated_to_entity_information_screen() throws Exception {
		getQueuePage.validateCII_Fields();
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
}
