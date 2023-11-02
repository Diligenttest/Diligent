package StepDefinations;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Base.WebTestBase;
import com.TestContext.ScenarioContext;
import com.TestContext.WebTestContext;

import genericFunctions.ReusableMethods;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Hooks {
	
	private WebTestContext webTestContext;
	private ScenarioContext scenarioContext;
	WebTestBase webtestbase=new WebTestBase();
	
	public Hooks(WebTestContext webTestContext,ScenarioContext scenarioContext )
	{
		this.webTestContext= webTestContext;	
		this.scenarioContext=scenarioContext;
	}
	
	@Given("^Open the Web Browser$")
    public void setupStepDef()throws Throwable{
        webtestbase.start(webTestContext);
    }

    @And("^Close the browser$")
    public void tearDownWebStepDef()throws Throwable{
        webtestbase.teardown(webTestContext);
    }

	@After
    public void tearDownWebStepDefIfFailure()throws Throwable{
        webtestbase.teardown(webTestContext);
    }
	
	@AfterStep
	public void captureScreenshot_Web(Scenario scenario) throws IOException, InterruptedException {
		if (webTestContext.getWebDriverManager().getWebDriver() != null) {
			if (scenario.isFailed())
				scenario.attach(ReusableMethods.getByteScreenshot(webTestContext.getWebDriverManager().getWebDriver()), "image/png", "screenshot name");
		}
	}


}