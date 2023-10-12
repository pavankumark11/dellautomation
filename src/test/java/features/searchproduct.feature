Feature: search and place the orderfor products
@OfferPage
  Scenario Outline: search Experience for product search in both home and offers page
    Given user is on Greencart Landing page
    When user searched with shortname <Name> and extracted actual item of product
    And user searched for <Name> shortName  in offers page
    Then validate product in offer page matches with Landing page

    Examples: 
      | Name |
      | Str  |
      | Beet |
