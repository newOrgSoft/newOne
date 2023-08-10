Feature: Sell Used Furniture
  As a tenant
  I want to sell my used furniture within the housing community
  So that I can find buyers easily

  Scenario: Listing used furniture for sale
    Given I am a tenant
    When I navigate to the furniture marketplace
    And I list my furniture for sale
    Then my furniture should be visible to potential buyers
