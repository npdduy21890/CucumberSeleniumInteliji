Feature: Login failed
  Scenario Outline: User can not login Homepage by input invalid data
    Given I open browser and navigate to BC-Riboon site
    Given I input User Name as <account> and Password as <password>
    When I click Login button
    Then Site show content as <result>
    Examples:
    | account | password| result                                          |
    | abcd    | badsđ   | ID、またはパスワードが正しくありません。ご確認ください |
    | ksadodi |         | パスワードは必須です                               |
    |         | ksoeiqmk| パスワードは必須です                               |