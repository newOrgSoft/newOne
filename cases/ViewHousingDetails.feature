Feature: View Housing Details
  As a tenant
  I want to view pictures and details of housing units
  So that I can make an informed decision

  Scenario: Viewing pictures and detailed description
    Given I am a tenant
    When I select a housing unit
    Then I should see an image gallery
    And I should be able to read detailed descriptions
