Feature: Homepage

  Scenario: Accessing login page from Homepage
    Given that user is on "HOMEPAGE"
    When he presses the login button
    Then he will be redirected to the "LOGIN" page

  Scenario: Changing Language of website
    Given that user is on "HOMEPAGE"
    When he presses on the "BRAZILIAN" language option
    Then the page will be translated in "BRAZILIAN"