Feature: Order product online

  Scenario: User can order a product in online store
    Given There is a registered user with address added and browser is open on my store Log in to your account page
    When The user logs into account
    And User goes to main page
    And User picks a Hummingbird Printed Sweater to buy
    And User chooses size "M"
    And User picks 5 items of merchandise
    And User adds product to Cart
    And User goes to checkout
    And User confirms delivery address
    And User picks a "pick up in store" as a method of delivery
    And User picks a method of payment - "Pay by Check"
    And User orders with an obligation to pay
    Then Merchandise is ordered





