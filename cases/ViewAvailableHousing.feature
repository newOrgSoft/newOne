Feature: View Available Housing
  As a tenant
  I want to see the housing options available
  So that I can choose a suitable accommodation

  Scenario: Displaying available housing on the map
    Given I am a tenant
    When I open the app
    Then I should see an interactive map with housing pins
    And each pin should provide basic information
