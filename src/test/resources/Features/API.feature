Feature: Record Creation through API
  I want to use this template for onboarding scenarios


  @regression
  Scenario: Record Creation Through API
    Given I Should create a record for "Private" record
    Then I should capture patient user id
    Given I Should create a record for "Public" record
    Then I should capture patient user id