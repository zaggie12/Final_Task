Feature: Add new user address

  Scenario: User can add new address
    Given There is a registered user and browser is opened on my store Log in to your account page
    When The user logs in
    And User goes to the addresses page
    And User adds new address: <alias>, <address>, <city>, <postalCode>, <country>, <phone>
    Then The address is added to user's account
    And The browser is closed

    Examples:
      | alias       | address       | city    | postalCode| country       | phone     |
      | Main        | 123 New St    | New City| 06053     | United Kingdom| 123456789 |
