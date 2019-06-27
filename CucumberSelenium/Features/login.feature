Feature: Login Homepage

  Scenario : Login successfully with right account and password
    Given Open browser and navigate to BC-Ribbon
    When Input account and password
    Examples:
    |account                       | password     |
    |qa.qccheck+20181227@gmail.com | testtest1234 |
    And Click LOGIN button
    Then Login BC-Ribbon
    And Close browser