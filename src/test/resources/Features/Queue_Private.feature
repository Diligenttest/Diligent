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
    Then I should validate fields count for "Internal Information" under "Private" sector
    And I enter all the information under <Dynamic Internal Information> section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Entity Information" screen
    When I click on <Internal Information> tab in the onborading screen
    Then I should validate data is saved in dynamic internal information section
    When I Close the browser

