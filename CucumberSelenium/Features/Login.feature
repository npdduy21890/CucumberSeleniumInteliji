Feature: Login Homepage
  Scenario: Login successfully with valid data
    Given I open browser and navigate to BC-Riboon site
    Given I input valid account and password
    When I click Login button
    Then Login page successfully