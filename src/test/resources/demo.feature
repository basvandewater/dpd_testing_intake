Feature: Testing PHP Travels website

  Scenario: Search for an hotel
    Given PHP Travel website is opened
    When the user searches for an hotel in "Amsterdam"
    Then search results are shown



