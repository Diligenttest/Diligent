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

  @regression
  Scenario: Validate Customer section fields under Customer and Connected Parties
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Connected Party & Screening> tab in the onborading screen
    And I click on <Customer and Connected Parties> link
    Then I should validate tabs under <Customer and Connected Parties>
    And I should validate fields under "Customer" under Customer and Connected Parties
    When I Close the browser

  @regression
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
  Scenario: Validate Non Individual section fields under Customer and Connected Parties
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Connected Party & Screening> tab in the onborading screen
    And I click on <Customer and Connected Parties> link
    Then I should validate tabs under <Customer and Connected Parties>
    And I should validate fields under "Non-Individual" under Customer and Connected Parties
    When I Close the browser

  @regression
  Scenario: Validate Due Diligence for Specilized Due Degilicence corportation
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Due Diligence> tab in the onborading screen
    Then I should validate tabs under <Due Diligence>
    And I should validate fields under <Specilized Due Diligence> section
    When I Close the browser

  @regression
  Scenario: Validate Due Diligence for Mandatory Due Degilicence corportation
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Due Diligence> tab in the onborading screen
    And I click on <Mandatory Due Diligence> tab
    Then I should validate fields under "Customer" section under Pep (corp)
    Then I should validate fields under "Non-Individual" section under Pep (corp)
    When I Close the browser

  @regression
  Scenario: Validate Documentation field labels,button for IDV & V Documentation with Customer tab
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Documentation> tab in the onborading screen
    Then I should validate tabs under <Documentation> section
    And I should validate tabs under <ID&V Documentation> section
    And I should validate tabs labels, headers and table data under "Customer" section
    When I Close the browser

  @regression
  Scenario: Validate Documentation field labels,button for IDV & V Documentation with Non Individual tab
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Documentation> tab in the onborading screen
    And I should validate tabs labels, headers and table data under "Non Individual" section
    When I Close the browser

  @regression
  Scenario: Validate Document Tracking section under Documentation for Customer and Non Individual tabs
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Documentation> tab in the onborading screen
    And I click on <Document Tracking< tab under Documentation
    Then I should validate label, headers and button for "Customer" under Document Tracking section
    And I should validate label, headers and button for "Non Individual" under Document Tracking section

  @regression
  Scenario: Validate Add Icon under Documentation section
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Documentation> tab in the onborading screen
    And I click on Add Icon button
    Then I should validate Save & Proceed button is "Disable"
    When I enter <DocumentName> ,<Mandatory> and certification requirement
    Then I should validate Save & Proceed button is "Enable"
    And I click on Remove Icon button
    Then I should validate section is disappeared under other documents sections

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

  @regression
  Scenario: Validate Risk Assesment section in the onboaridng screen
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Risk Assessment> tab in the onborading screen
    Then I should validate <Risk Assesment Section> under Risk Assessment
    When I Close the browser

  @regression
  Scenario: Validate Profile Summary Section and Profile Details in the onboard screen
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on existing customer as "Testing 01"
    And I click on <Profile Summary> tab in the onborading screen
    Then I should validate Tabs under <Profile Summary> Section
    And I should validate <Customer> and  <Risk Assesment summary> information summary section
    And I should validate profile save button for waiver applied section
    When I Close the browser

  @regression
  Scenario: Validate Profile History section under Profile details in the onboard screen
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on existing customer as "Testing 01"
    And I click on <Profile Summary> tab in the onborading screen
    Then I should validate Profile History Section
    When I Close the browser

  @regression
  Scenario: Validate Makers button and comments field validation in onboarding/internal information tab
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on Maker comments button under internal information tab
    Then I should validate Maker comments pop with comments,update and cancel button
    When I enter comments and click on "Cancel" button
    And I click on Maker comments button under internal information tab
    Then I should validate the text is "Not Saved" in comments section
    When I click on Maker comments button under internal information tab
    And I enter comments and click on "Update" button
    And I click on Maker comments button under internal information tab
    Then I should validate the text is "Saved" in comments section
    When I Close the browser

  @regression 
  Scenario Outline: Validate Field Characters should restrict to 50 characters <"FieldName">
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I enter more than 50 characters in <"FieldName">
    And I click on Save & Proceed button
    Then I should validate page is navigated to <Entity Information> screen
    When I click on <Internal Information> tab in the onborading screen
    Then I should validate only 50 characters should be saved in the field <"FieldName">
    When I Close the browser

    Examples: 
      | FieldName              |
      | CoreBankingID          |
      | CustomerSourcedThrough |
      | BussinessSegment       |
      | RMName                 |
      | Tranperency            |

  @regression
  Scenario: Validate Data is saved in Entity Information_CustomerIdentificationInformation
    When I click "Queue Config" in the left pane from Dashboard
    And I click on the "Corporate" subtab in the left pane from Dashboard
    And I click on any existing Application ID
    And I click on <Entity Information> tab in the onborading screen
    And I enter all the information under <Entity Information> section
    And I click on Save & Proceed button
    Then I should validate page is navigated to <Bussiness Information> tab screen
    When I click on <Customer Identification> tab in the onborading screen
    Then I should validate data is saved in Customer Identification section
    When I Close the browser
