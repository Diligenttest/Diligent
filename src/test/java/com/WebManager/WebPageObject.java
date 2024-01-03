package com.WebManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import web.pages.LoginPage;
import web.pages.OnboardCustomerPage;
import web.pages.QueuePage;

public class WebPageObject {

	public WebDriver driver;
	private LoginPage getLoginPage;
	private QueuePage getQueuePage;
	private OnboardCustomerPage getOnboardCustomerPage;

	public WebPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		return (getLoginPage == null) ? getLoginPage = new LoginPage(driver) : getLoginPage;
	}
	
	public QueuePage getQueuePage() {
		return (getQueuePage == null) ? getQueuePage = new QueuePage(driver) : getQueuePage;
	}
	
	public OnboardCustomerPage getOnboardCustomerPage() throws IOException {
		return (getOnboardCustomerPage == null) ? getOnboardCustomerPage = new OnboardCustomerPage(driver) : getOnboardCustomerPage;
	}
}
