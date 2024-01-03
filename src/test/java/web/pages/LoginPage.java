package web.pages;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestContext.ScenarioContext;

import genericFunctions.ReusableMethods;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	public WebElement username_TextField;

	@FindBy(id = "password")
	public WebElement password_TextField;

	@FindBy(name = "login")
	public WebElement SignIn_Button;
	
	@FindBy(xpath = "//span[text()=' Agree ']/parent::button")
	public WebElement Agree_Button;
	
	public WebElement leftNavigationPane(String tabName)
	{
		return driver.findElement(By.xpath("//span[contains(text(),'"+tabName+"')]"));
	}

	public void launchApplication() {
		try {
			ReusableMethods.launchApplication(driver, ReusableMethods.getGlobalValue("globalURL"));
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void enterLoginCreds(String loginType) {
		try {
			ReusableMethods.waitForElementToBeClickable(driver, SignIn_Button);
			switch (loginType) {
			case "Admin":

				ReusableMethods.EnterValue(driver, username_TextField, ReusableMethods.getGlobalValue("adminUserName"));

				ReusableMethods.EnterValue(driver, password_TextField, ReusableMethods.getGlobalValue("adminPassword"));
				break;
			case "Maker":
				ReusableMethods.EnterValue(driver, username_TextField, ReusableMethods.getGlobalValue("makerUserName"));
				ReusableMethods.EnterValue(driver, password_TextField, ReusableMethods.getGlobalValue("makerPassword"));
				break;
			case "Checker":
				ReusableMethods.EnterValue(driver, username_TextField,
						ReusableMethods.getGlobalValue("checkerUsername"));
				ReusableMethods.EnterValue(driver, password_TextField,
						ReusableMethods.getGlobalValue("checkerPassword"));
				break;
			case "CheckerAdmin":
				ReusableMethods.EnterValue(driver, username_TextField,
						ReusableMethods.getGlobalValue("CheckerAdminUsername"));
				ReusableMethods.EnterValue(driver, password_TextField,
						ReusableMethods.getGlobalValue("chekerAdminPassword"));
				break;
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickSignIn() {
		ReusableMethods.click(driver, SignIn_Button);
	}
	
	public void clickAgreeButton()
	{
		ReusableMethods.waitforPageLoad(driver);
		ReusableMethods.click(driver, Agree_Button);
	}
	
	public void clickLeftNavigationPane(String tabName)
	{
		ReusableMethods.click(driver, leftNavigationPane(tabName));
	}
	
}
