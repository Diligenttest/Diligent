Feature: Onboarding Customer
  I want to use this template for Onboarding Customer

  Background: 
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Onboarding Customer" in the left pane from Dashboard
    And I click on the <Corporate> subtab under "onboarding" in the left pane from Dashboard
    When I enter Corporate IDV Document Checklist Generation Fields for "Private" sector
    And I click on Generate Checklist
    And I click on "Individual" tab under onbording flow
    And I enter Individual information
    And I click on Generate Checklist
    And I click on "Non-Individual" tab under onbording flow
    And I enter Non Individual information for "Private" sector
    And I click on Generate Checklist
    And I click on Generate KYC Profice button
    Then I should wait for 10 seconds to load the page

  @regression 
  Scenario: Validate Internal Interformation for Private Customer Information Tab
    Then I should validate fields count for "Private-Internal Information" sector
    When I enter all the information under "Internal Information" section for "Private" sector
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Entity Information" screen
    When I click on <Internal Information> tab in the onborading screen
    Then I should validate data is saved in internal information section
    When I Close the browser

  @regression 
  Scenario: Validate Internal Interformation for Private Customer Information Tab
    When I click on <Entity Information> tab in the onborading screen
    Then I should validate fields count for "Private-CustomerInformation" sector
    And I enter all the information under "Private-CustomerInformation" section for "Private" sector
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Contact Details" screen
    #And I click on "Customer Information" tab in the onborading screen
    #Then I should validate data is saved under "Private-CustomerInformation" section
    When I Close the browser
    
   @regression 
  Scenario: Validate Entity Information for Private Contact Details Tab
    When I click on <Entity Information> tab in the onborading screen
    And I click on "Contact Details" tab in the onborading screen
    Then I should validate fields count for "Private-Contact Details" sector
    And I enter all the information under "Private-Contact Details" section for "Private" sector
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Nature of Business and Business Activity" screen
    #And I click on "Contact Details" tab in the onborading screen
    #Then I should validate data is saved under "Private-Contact Details" section
    When I Close the browser
    
     @regression
  Scenario: Validate Entity Information for Private Nature of Bussiness Activity
    When I click on <Entity Information> tab in the onborading screen
    And I click on "NatureOfBussinessActivity" tab in the onborading screen
    Then I should validate fields count for "Private-NatureOfBussinessActivity" sector
    And I enter all the information under "Private-NatureOfBussinessActivity" section for "Private" sector
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Product Information" screen
    #And I click on "NatureOfBussinessActivity" tab in the onborading screen
    #Then I should validate data is saved under "Private-NatureOfBussinessActivity" section
    When I Close the browser
