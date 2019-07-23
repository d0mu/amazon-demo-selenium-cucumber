Feature: Add a shopping item

  Scenario: Add a shopping item
    Given I navigate the Amazon website
    And I search for ZOCAVIA Men's Running Shoes Lightweight Breathable
    And I click the search button
    And I select the first product from the list
    When I add the product to the cart
    Then the product has been successfully added to cart


