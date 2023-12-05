package StepDefinations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.TestContext.ScenarioContext;
import com.api.APIPayLoad;
import com.api.EndPoints;
import com.api.Headers;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import genericFunctions.FieldNames;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APISteps {

	private ScenarioContext scenarioContext;

	public APISteps(ScenarioContext scenarioContext) {
		this.scenarioContext = scenarioContext;
	}

	APIPayLoad apiPayLoad = new APIPayLoad();
	RequestSpecification httpRequest;
	Response res;
//	static List<Object> consentFormValues = new ArrayList<>();
//	static List<String> fileIds = new ArrayList<String>();
	
	@Given("I Should create a record for {string} record")
	public void i_should_create_a_record_for_record(String requestType) {
		RestAssured.baseURI = EndPoints.baseURI_REST ;
		httpRequest = RestAssured.given().log().all().headers(Headers.createRecordHeader());
		if(requestType.equals("Private"))
		res = httpRequest.body(apiPayLoad.post_PrivateBody(scenarioContext)).post();
		else
			res = httpRequest.body(apiPayLoad.post_PublicBody(scenarioContext)).post();	
		if (res.getStatusCode() == 200) {
			System.out.println("The response code - " + res.getBody().asString());
		}
		else if (res.getStatusCode() == 201) {
			System.out.println("The response code - " + res.getBody().asString());
		}
		else {
			Assert.fail("The request was not in  a proper format " + res.getStatusCode());
		}
	}
	
	
	@Then("I should capture patient user id")
	public void i_should_capture_patient_user_id() {
		JsonPath jsonPathEvaluator = res.jsonPath();
		scenarioContext.addTestData(FieldNames.RecordID.toString(),
				jsonPathEvaluator.get("userUUId").toString());
		ExtentCucumberAdapter.addTestStepLog(scenarioContext.getTestData(FieldNames.RecordID.toString()));
	}
}
