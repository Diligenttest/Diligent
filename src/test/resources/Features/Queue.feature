Feature: Onboarding Validation
  I want to use this template for onboarding scenarios

  Background: 
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button

  @regression
  Scenario: Validate Queue page for corporate section
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    Then I should validate application navigated to queue config screen
    And I should validate below tabs in corporate my queue screen
      | Onboard Customer     |
      | Trigger Event Review |
      | Periodic Review      |
    And I should validate table headers for customer under onboard customer
    When I Close the browser

  @regression
  Scenario: Validate Intenal Information fields ,button and tabs
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    Then I should validate tabs in the onboarding screen
    And I should validate fields in the Internal Information screen
    And I should validate buttons in the onboarding screen
    When I Close the browser

  @regression 
  Scenario: Validate Entity Information fields ,button and tabs
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Entity Information> tab in the onborading screen
    Then I should validate fields under "Customer Identification Information"
    And I should validate fields under "Bussiness Information"
    And I should validate fields under "Product Information"
    And I should validate fields under "Contact Information"
    And I should validate fields under "Other Information"
    When I Close the browser
    
    @regression
  Scenario: Validate Connected Party screen fields ,button and tabs for Beneficial Owner
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Connected Party & Screening> tab in the onborading screen
    Then I should validate tabs under connected pary screening
    And I should validate fields under <Beneficial Owner Identification>
    When I Close the browser
    
    @regression @test
  Scenario: Validate Customer section fields under Customer and Connected Parties
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Connected Party & Screening> tab in the onborading screen
   	And I click on <Customer and Connected Parties> link
   	Then I should validate tabs under <Customer and Connected Parties>
   	And I should validate fields under "Customer" under Customer and Connected Parties
    When I Close the browser
    
     @regression @test
  Scenario: Validate Individual section fields under Customer and Connected Parties
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Connected Party & Screening> tab in the onborading screen
   	And I click on <Customer and Connected Parties> link
   	Then I should validate tabs under <Customer and Connected Parties>
   	And I should validate fields under "Individual" under Customer and Connected Parties
    When I Close the browser
    
    @regression 
  Scenario: Validate Data is saved in Internal Information
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I enter all the information under <Internal Information> section
    And I click on Save & Proceed button
    Then I should validate page is navigated to <Entity Information> screen
    When I click on <Internal Information> tab in the onborading screen
    Then I should validate data is saved in internal information section
    When I Close the browser
    
    @regression
  Scenario: Validate Save & Exit Functionality File Upload status
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I enter all the information under <Internal Information> section
    And I click on Save & Exit button
    And I should validate File Status is displayed as selected
    When I Close the browser
