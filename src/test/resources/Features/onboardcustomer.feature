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

  @test
  Scenario: Validate Entity Information for Private Customer Information Tab
    When I enter Corporate IDV Document Checklist Generation Fields
    And I click on Generate Checklist
    And I click on "Individual" tab under onbording flow
    And I enter Individual information
    And I click on Generate Checklist
     And I click on "Non-Individual" tab under onbording flow
    And I enter Non Individual information
    And I click on Generate Checklist
    And I click on Generate KYC Profice button
    Then I should wait for 60 seconds to load the page
    Then I should validate fields count for "Private-CustomerInformation" sector
    And I enter all the information under "Private-CustomerInformation" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Contact Details" screen
    And I click on "Customer Information" tab in the onborading screen
    Then I should validate data is saved under "Private-CustomerInformation" section
    When I Close the browser
