Feature: Validate Dyanamic fields section for public
  I want to use this template for onboarding scenarios


  @regression
  Scenario: Validate Internal Information Fields validation for Public Company
    Given I Should create a record for "Public" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any created record through API
    Then I should validate fields count for "Public-Internal Information" sector
    And I enter all the information under <Dynamic Internal Information> section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Entity Information" screen
    When I click on <Internal Information> tab in the onborading screen
    Then I should validate data is saved in dynamic internal information section
    When I Close the browser

  @regression
  Scenario: Validate Entity Information for Public Customer Information Tab
    Given I Should create a record for "Public" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    Then I should validate fields count for "Public-CustomerInformation" sector
    And I enter all the information under "Public-CustomerInformation" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Nature of Business and Business Activity" screen
    And I click on "Customer Information" tab in the onborading screen
    Then I should validate data is saved under "Public-CustomerInformation" section
    When I Close the browser

  @regression
  Scenario: Validate Entity Information for Public Nature of Bussiness Activity
    Given I Should create a record for "Public" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    And I click on "NatureOfBussinessActivity" tab in the onborading screen
    Then I should validate fields count for "Public-NatureOfBussinessActivity" sector
    And I enter all the information under "Public-NatureOfBussinessActivity" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Product Information" screen
    And I click on "NatureOfBussinessActivity" tab in the onborading screen
    Then I should validate data is saved under "Public-NatureOfBussinessActivity" section
    When I Close the browser

  @regression
  Scenario: Validate Entity Information for Public Product Information
    Given I Should create a record for "Public" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    And I click on "Product Information" tab in the onborading screen
    Then I should validate fields count for "Public-ProductInformation" sector
    And I enter all the information under "Public-ProductInformation" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Risk Evaluation" screen
    And I click on "Product Information" tab in the onborading screen
    Then I should validate data is saved under "Public-ProductInformation" section
    When I Close the browser

  @regression
  Scenario: Validate Entity Information for Public Nature of Risk Evaluation
    Given I Should create a record for "Public" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    And I click on "Risk Evaluation" tab in the onborading screen
    Then I should validate fields count for "Public-Risk Evaluation" sector
    And I enter all the information under "Public-Risk Evaluation" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "New Level" screen
    And I click on "Risk Evaluation" tab in the onborading screen
    Then I should validate data is saved under "Public-Risk Evaluation" section
    When I Close the browser

  @regression
  Scenario: Validate Entity Information for Public Nature of New Level
    Given I Should create a record for "Public" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    And I click on "New Level" tab in the onborading screen
    Then I should validate fields count for "Public-New Level" sector
    And I enter all the information under "Public-New Level" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Beneficial Owner Identification" screen
    And I click on <Entity Information> tab in the onborading screen
    And I click on "New Level" tab in the onborading screen
    Then I should validate data is saved under "Public-New Level" section
    When I Close the browser

  @regression @test
  Scenario: Validate Entity Information for Public Nature of Entity Information Tabs
    Given I Should create a record for "Public" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    Then I should validate Entity Informations tabs for "Public" Sectors
    When I Close the browser
