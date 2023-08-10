Feature: Book Accommodation
  As a tenant
  I want to book a housing unit
  So that I can secure my desired accommodation

  Scenario: Booking a housing unit
    Given I am a tenant
    When I select a housing unit
    And I choose to book it
    Then I should receive a confirmation
    And the booking should be reflected in my profile
