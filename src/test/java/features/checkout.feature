Feature:  place the orderfor products
@PlaceOrder
  Scenario Outline: search Experience for product search in both home and offers page
    Given user is on Greencart Landing page
    When user searched with shortname <Name> and extracted actual item of product
    And  Added "3" items of the selected product to cart
    Then user processed to checkout and validate the <Name> items in checkout page
    And  verify user ability to enter promocode and place the order

    Examples: 
      | Name |
      | Str  |
   
