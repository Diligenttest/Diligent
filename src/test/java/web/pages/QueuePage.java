package web.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericFunctions.Constant;
import genericFunctions.ReusableMethods;

public class QueuePage {

	public WebDriver driver;

	public QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//span[text()=' Cancel ']")
	public WebElement cancel_Button;
	
	@FindBy(xpath ="//a[contains(@ng-reflect-router-link,'queue')]//span[text()='Corporate']")
	public WebElement Corpoate_SubTab;
	
	@FindBy(xpath ="//div[@class='mat-tab-label-content']")
	public List<WebElement> CorporateQueue_Tabs;
	
	@FindBy(xpath ="//mat-table//mat-header-cell")
	public List<WebElement> OnboardCustomer_TableHeaders;

	
	public void validateQueueUrl(String url)
	{
		ReusableMethods.waitForElementToBeDisplayed(cancel_Button, 10, driver);
		Assert.assertEquals(url, ReusableMethods.getCurrentURL(driver));
	}
	
	public void validateCorporateMyQueueHeaders(List<String> expectedValues) throws Exception
	{
		ReusableMethods.compareList(CorporateQueue_Tabs, expectedValues);
	}
	
	public void validateOnboardCustomerTableHeaders(List<String> expectedValues) throws Exception
	{
		ReusableMethods.compareList(OnboardCustomer_TableHeaders, Constant.ONBOARDCUSTOMERHEADERS);
	}
	
	public void clickCorporate_Queue()
	{
		ReusableMethods.click(driver, Corpoate_SubTab);
	}
}
