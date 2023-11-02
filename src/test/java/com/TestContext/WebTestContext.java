package com.TestContext;

import com.WebManager.WebPageDriver;
import com.WebManager.WebPageObject;

public class WebTestContext {
	private WebPageDriver webDriverManager;
	private WebPageObject webPageObject;
	public WebTestContext(){
		webDriverManager = new WebPageDriver();

	}

	public WebPageDriver getWebDriverManager() {
		return (webDriverManager == null) ? webDriverManager = new WebPageDriver():webDriverManager;
	}

	public void setWebDriverManager(WebPageDriver webDriverManager) {
		this.webDriverManager = webDriverManager;
	}

	public WebPageObject getWebPageObject() {
		return (webPageObject == null) ? webPageObject = new WebPageObject(webDriverManager.getWebDriver()):webPageObject;
	}

	public void setWebPageObject(WebPageObject webPageObject) {
		this.webPageObject=webPageObject;
	}

}
