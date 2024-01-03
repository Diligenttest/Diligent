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
    And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
    And I click on any created record through API
    Then I should validate fields count for "Private-Internal Information" sector
    And I enter all the information under <Dynamic Internal Information> section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Entity Information" screen
    When I click on <Internal Information> tab in the onborading screen
    Then I should validate data is saved in dynamic internal information section
    When I Close the browser

  @regression
  Scenario: Validate Entity  for Private Customer Information Tab
    Given I Should create a record for "Private" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
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
    And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
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
    And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
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

  @regression
  Scenario: Validate Entity Information for Private Product Information
    Given I Should create a record for "Private" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    And I click on "Private Product Information" tab in the onborading screen
    Then I should validate fields count for "Private-Product Information" sector
    And I enter all the information under "Private-Product Information" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Declaration for Holding without Tax Purposes" screen
    And I click on "Private-Product Information" tab in the onborading screen
    Then I should validate data is saved under "Private-Product Information" section
    When I Close the browser

  @regression
  Scenario: Validate Entity Information for Private Declaration for Holding without Tax Purposes
    Given I Should create a record for "Private" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
   And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    And I click on "Declaration for Holding without Tax Purposes" tab in the onborading screen
    Then I should validate fields count for "Declaration for Holding without Tax Purposes" sector
    And I enter all the information under "Declaration for Holding without Tax Purposes" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Declaration of Beneficial Ownership" screen
    And I click on "Declaration for Holding without Tax Purposes" tab in the onborading screen
    Then I should validate data is saved under "Declaration for Holding without Tax Purposes" section
    When I Close the browser

  @regression
  Scenario: Validate Entity Information for Private Declaration Beneficial Ownership
    Given I Should create a record for "Private" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Entity Information> tab in the onborading screen
    And I click on "Declaration of Beneficial Ownership" tab in the onborading screen
    Then I should validate fields count for "Declaration of Beneficial Ownership" sector
    And I enter all the information under "Declaration of Beneficial Ownership" section
    And I click on Save & Proceed button
    Then I should validate page is navigated to "Agreement" screen
    And I click on "Declaration of Beneficial Ownership" tab in the onborading screen
    Then I should validate data is saved under "Declaration of Beneficial Ownership" section
    When I Close the browser

  @regression
  Scenario: Validate Entity Information for Private Nature of Risk Evaluation
    Given I Should create a record for "Private" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
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

  @regression
  Scenario: Validate Documentation for ID&V Documentation and Saved Documents in Document Tracking for Private Sector
    Given I Should create a record for "Private" record
    Then I should capture patient user id
    Given Open the Web Browser
    When I launch the Diligent application
    And I enter "Maker" credentials
    And I click on Sign In button
    And I click on Agree button
    And I click "Queue Config" in the left pane from Dashboard
    And I click on the <Corporate> subtab under "queue" in the left pane from Dashboard
    And I click on any created record through API
    And I click on <Documentation> tab in the onborading screen
    Then I should validation Doc Selection as No
    And I should validate list of Documents needs to availble
      | Audited financial report                                                                            |
      | CRS self certification                                                                              |
      | Original Board resolution approving opening of account and its authorised signatories               |
      | Fax indemnity Resolution                                                                            |
      | Deed of Indemnity                                                                                   |
      |  Letter of Indemnity                                                                               |
      | Crossed Cheque for Minimum Balance Amount                                                           |
      |  Letter of Introduction from SBI Overseas Branch/existing Bankers domiciled in FATF member country |
      | Certificate of Incorporation / Registration                                                         |
      | Register of Directors                                                                               |
      | Register of Shareholders                                                                            |
      | FATCA Form                                                                                          |
    When I select mandatory documents in customer tab
    Then I should validation Doc Selection as Yes
    And I click on Save & Proceed button
    Then I should validate selected Documents should be displayed under Document Tracking Section
      | Audited financial report                                                                            |
      | CRS self certification                                                                              |
      | Register of Directors                                                                               |
      | Register of Shareholders                                                                            |
      |  Letter of Introduction from SBI Overseas Branch/existing Bankers domiciled in FATF member country |
      | Certificate of Incorporation / Registration                                                         |
      | Original Board resolution approving opening of account and its authorised signatories               |
      | FATCA Form                                                                                          |
    When I Close the browser
