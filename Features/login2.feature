Feature: Test Orange HRM Application

  Scenario Outline: Sanity Testing login Scenario
    Given user on login Page
    When user enter valid "<username>" and valid "password"

    Examples: 
      | username | password | mobile | 
      | Admin    | admin123 |
      | admin123 | admin123 |
