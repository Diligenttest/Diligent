package CucumberOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.TestContext.ScenarioContext;

import genericFunctions.ReusableMethods;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features", glue = { "StepDefinations" }, monochrome = true, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true, tags = "@test", dryRun = false)
//plugin = {"pretty", "html:target/HtmlReports/report.html" } dryRun=true,

public class Regression extends AbstractTestNGCucumberTests {
	
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
//	
//	@Parameters({"qa"}) 
//	@BeforeSuite
//	public static FileInputStream getFilePath(String value)
//	{	
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream(System.getProperty("user.dir") + filePath+value);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		return fis;
//	}
}
