Feature: Test for Aplikasi absensi kantin dosen dan staff IT Del

#Varian1
 Scenario: Test add a meal menu with Valid Credentials
    Given open chrome and start application
    When I enter valid username and valid password
    Then I can login successfully
    When I click meal menu
    And I enter valid date, valid time and valid description
    Then I Can add a meal menu succesfully

#Varian2
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I enter valid username and valid password
    #Then I can login successfully
    #When I click meal menu
    #When I enter valid date, valid time and invalid description
    #Then I Cant add a meal menu
    
#Varian3
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I enter valid username and valid password
    #Then I can login successfully
    #When I click meal menu
    #When I enter valid date, invalid time and valid description
    #Then I Cant add a meal menu
    
#Varian4
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I enter valid username and valid password
    #Then I can login successfully
    #When I click meal menu
    #When I enter invalid date, valid time and valid description
    #Then I Cant add a meal menu
    
#Varian5
 #Scenario: Test add a meal menu with Valid Credentials
    #Given open chrome and start application
    #When I enter valid username and valid password
    #Then I can login successfully
    #When I click meal menu
    #When I enter valid date, invalid time and invalid description
    #Then I Cant add a meal menu
 
#Varian6
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I enter valid username and valid password
    #Then I can login successfully
    #When I click meal menu
    #When I enter invalid date, invalid time and valid description
    #Then I Cant add a meal menu
    
#Varian7
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I nter valid username and valid password
    #Then I can login successfully
    #When I click meal menu
    #When I enter invalid date, valid time and invalid description
    #Then I Cant add a meal menu
    
#Varian8
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I enter valid username and valid password
    #Then I can login successfully
    #When I click meal menu
    #When I enter invalid date, invalid time and invalid description
    #Then I Cant add a meal menu
    