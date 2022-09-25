 Feature: Login Invalid Username Password
 
 Scenario Outline: User invalid login Outlinee
    When Browser open Web HRM Outlinee
    And Enter invalid <password> and <username> Outlinee
    #And button login clicked Outlinee
    Then System check credentials invalid Outlinee
    
#5 data
    Examples:    
    |username|password|
		|manda@gmail.com|123|
		|dika@gmail.com|145|
		|nanto@gmail.com|321|
		|adit@gmail.com|2345|
		|mafa@gmail.com|1234|
