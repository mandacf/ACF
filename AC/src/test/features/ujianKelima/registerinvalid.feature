Feature: Register Invalid Username Email Password

 Scenario Outline: User invalid regis Outlinee
    When Browser open Web Shop Demo QA Outlinee
    And Enter invalid <username>, <email> and <password> Outlinee
    #And button register clicked Outlinee
    Then System check credentials invalid Outlinee
    
    
    #4 data
    Examples:
    |username|email|password|
		|acf34|ac34@gmail.com|1$%***((&^^^dfmf |
		|acf1|acf1@gmail.com|1$%45**((&^^^fddgg|
		|af2|af@gmail.com|1$%***((&%^^fdfdf|
		|ac1|ac@gmail.com|1$%***((&@^fdfgfgfg|