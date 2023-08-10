Feature: Student Housing Insights
  As a tenant
  I want to know about the student community in a housing unit
  So that I can find a compatible living environment

  Scenario: Displaying student community insights
    Given I am a tenant
    When I view a student housing unit
    Then I should see information about the resident students' demographics
