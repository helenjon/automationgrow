Feature: Login section


  Scenario: Successfully Login to Website
    Given I am on the facebook.com Home Page
    When I fill in Email "XXXX.WWWW@gmail.com" and Password "WWWWW"
    And I click login
    Then I am on main page
