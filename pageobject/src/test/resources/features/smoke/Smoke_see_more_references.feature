Feature:  I as a user I  WTBAT have an opportunity to see more references

  Scenario: I as a user I  WTBAT have an opportunity to see more references.
  Given I access https://stage.hwr.hysdev.com/
  And I Scroll down to see ‘See all references’ button.
  When I click on ‘See all references’ button.
  Then  references page is opened (https://stage.hwr.hysdev.com/references/)


