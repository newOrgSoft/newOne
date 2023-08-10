Feature: Tenant Control Panel
  As a tenant
  I want access to a dashboard after booking
  So that I can manage my rental and contact information

  Scenario: Accessing the tenant control panel
    Given I am a tenant
    When I log in and have a booked accommodation
    Then I should be able to access a personalized control panel
    And I should see my personal data and contact information
