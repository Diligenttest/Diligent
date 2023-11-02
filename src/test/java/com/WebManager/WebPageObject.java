package com.WebManager;

import org.openqa.selenium.WebDriver;

import web.pages.LoginPage;
import web.pages.QueuePage;

public class WebPageObject {

	public WebDriver driver;
	private LoginPage getLoginPage;
	private QueuePage getQueuePage;

	public WebPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		return (getLoginPage == null) ? getLoginPage = new LoginPage(driver) : getLoginPage;
	}
	
	public QueuePage getQueuePage() {
		return (getQueuePage == null) ? getQueuePage = new QueuePage(driver) : getQueuePage;
	}
}
