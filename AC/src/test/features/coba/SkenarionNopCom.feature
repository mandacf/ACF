Feature: Login Nop User

  Scenario: User invalid login
    When User go to Web nopcommerce
    And User enter username password invalid
    #And User click button login
    Then User invalid data

  Scenario: User valid login
    When User go to Web nopcommerce
    And User enter username password valid
    #And User click button login valid
    Then User valid data
