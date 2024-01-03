package StepDefinations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.TestContext.ScenarioContext;
import com.TestContext.WebTestContext;

import genericFunctions.ReusableMethods;
import groovyjarjarantlr4.v4.parse.ANTLRParser.sync_return;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.pages.OnboardCustomerPage;

public class OnboardCustomerSteps {
	
	private WebTestContext webTestContext;
	private ScenarioContext scenarioContext;
	private OnboardCustomerPage getOnboardCustomer;
	

	public OnboardCustomerSteps(WebTestContext webTestContext, ScenarioContext scenarioContext) throws IOException {
		this.webTestContext = webTestContext;
		this.scenarioContext = scenarioContext;
		getOnboardCustomer = this.webTestContext.getWebPageObject().getOnboardCustomerPage();
		
	}

	@When("I enter Corporate IDV Document Checklist Generation Fields")
	public void i_enter_corporate_idv_document_checklist_generation_fields() throws InterruptedException {
	    getOnboardCustomer.enterCustomerIDVChecklist(scenarioContext);
	}
	@When("I click on Generate Checklist")
	public void i_click_on_generate_checklist() {
	   getOnboardCustomer.clickGenerateChecklist();
	}
	@When("I click on {string} tab under onbording flow")
	public void i_click_on_tab_under_onbording_flow(String tab) {
	   getOnboardCustomer.clickTabs(tab);
	}
	
	@When("I enter Individual information")
	public void i_enter_individual_information() throws InterruptedException {
	   getOnboardCustomer.enterIndividualInformation(scenarioContext);
	}
	
	@When("I enter Non Individual information")
	public void i_enter_non_individual_information() throws InterruptedException {
	    getOnboardCustomer.enterNonIndividualInformation(scenarioContext);
	}
	@When("I click on Generate KYC Profice button")
	public void i_click_on_generate_kyc_profice_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I should wait for {int} seconds to load the page")
	public void i_should_wait_for_seconds_to_load_the_page(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
