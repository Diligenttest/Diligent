package StepDefinations;

import com.TestContext.ScenarioContext;
import com.TestContext.WebTestContext;
import io.cucumber.java.en.When;
import web.pages.LoginPage;

public class LoginPageSteps {

	private WebTestContext webTestContext;
	private LoginPage getLoginPage;

	public LoginPageSteps(WebTestContext webTestContext) {
		this.webTestContext = webTestContext;
		getLoginPage = this.webTestContext.getWebPageObject().getLoginPage();

	}

	@When("I launch the Diligent application")
	public void i_launch_the_diligent_application() {
		getLoginPage.launchApplication();
	}

	@When("I enter {string} credentials")
	public void i_enter_credentials(String loginType) {
		getLoginPage.enterLoginCreds(loginType);
	}

	@When("I click on Sign In button")
	public void i_click_on_sign_in_button() {
		getLoginPage.clickSignIn();
	}
	
	@When("I click on Agree button")
	public void i_click_on_agree_button() {
		getLoginPage.clickAgreeButton();
	}
	
	@When("I click {string} in the left pane from Dashboard")
	public void i_click_in_the_left_pane_from_dashboard(String tabName) {
		getLoginPage.clickLeftNavigationPane(tabName);
	}
}
