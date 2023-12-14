Feature: Validate Dyanamic fields section for private and public
  I want to use this template for onboarding scenarios

  @regressio
  Scenario: Validate Internal Information Fields validation for Private Company
    Given I Should create a record for "Private" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any created record through API
    Then I should validate fields count for "Private-Internal Information" sector
    And I enter all the information under <Dynamic Internal Information> section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Entity Information" screen
    When I click on <Internal Information> tab in the onborading screen
    Then I should validate data is saved in dynamic internal information section
    When I Close the browser

@regression 
  Scenario: Validate Entity Information for Private Customer Information Tab
    Given I Should create a record for "Private" record
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
    Then I should validate fields count for "Private-CustomerInformation" sector
    And I enter all the information under "Private-CustomerInformation" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Contact Details" screen
    And I click on "Customer Information" tab in the onborading screen
    Then I should validate data is saved under "Private-CustomerInformation" section
    When I Close the browser
    
    
    @regression
  Scenario: Validate Entity Information for Private Contact Details Tab
    Given I Should create a record for "Private" record
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
    And I click on "Contact Details" tab in the onborading screen
    Then I should validate fields count for "Private-Contact Details" sector
    And I enter all the information under "Private-Contact Details" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Nature of Business and Business Activity" screen
    And I click on "Contact Details" tab in the onborading screen
    Then I should validate data is saved under "Private-Contact Details" section
    When I Close the browser
    
     @regression 
  Scenario: Validate Entity Information for Private Nature of Bussiness Activity
    Given I Should create a record for "Private" record
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
    Then I should validate fields count for "Private-NatureOfBussinessActivity" sector
    And I enter all the information under "Private-NatureOfBussinessActivity" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Product Information" screen
    And I click on "NatureOfBussinessActivity" tab in the onborading screen
    Then I should validate data is saved under "Private-NatureOfBussinessActivity" section
    When I Close the browser
    
    @regression @test
  Scenario: Validate Entity Information for Private Nature of Risk Evaluation
    Given I Should create a record for "Private" record
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
    And I click on "Private Risk Evaluation" tab in the onborading screen
    Then I should validate fields count for "Private-Risk Evaluation" sector
    And I enter all the information under "Private-Risk Evaluation" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Beneficial Owner Identification" screen
    And I click on <Entity Information> tab in the onborading screen
    And I click on "Private Risk Evaluation" tab in the onborading screen
    Then I should validate data is saved under "Private-Risk Evaluation" section
    When I Close the browser