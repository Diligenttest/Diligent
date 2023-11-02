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
