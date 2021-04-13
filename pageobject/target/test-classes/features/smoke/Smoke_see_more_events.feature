Feature: More event on the main page

  Scenario: I as a customer WTBAT see more events than presented on the main page
    Given I go main page Hys Site
    And I Scroll down to see ‘Let’s network’ block
    When I click on ‘Upcoming events’ button
    Then Page "https://stage.hwr.hysdev.com/events/" is opened