package StepDefinations;

import java.io.IOException;
import java.util.List;

import com.TestContext.WebTestContext;

import genericFunctions.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.LoginPage;
import web.pages.QueuePage;

public class QueuePageSteps {

	private WebTestContext webTestContext;
	private QueuePage getQueuePage;

	public QueuePageSteps(WebTestContext webTestContext) {
		this.webTestContext = webTestContext;
		getQueuePage = this.webTestContext.getWebPageObject().getQueuePage();

	}
	
	@Then("I should validate application navigated to queue config screen")
	public void i_should_validate_application_navigated_to_queue_config_screen() throws IOException {
		getQueuePage.validateQueueUrl(ReusableMethods.getGlobalValue("globalURL")+""+ReusableMethods.getGlobalValue("QueueUrl"));
	}
	
	@Then("I should validate below tabs in corporate my queue screen")
	public void i_should_validate_below_tabs_in_corporate_my_queue_screen(DataTable dataTable) throws Exception {
	    List<String> expectedValues=dataTable.asList();
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
	
	@Then("I should validate fields under {string}")
	public void i_should_validate_fields_under(String tabName) throws Exception {
		switch(tabName)
		{
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
}
