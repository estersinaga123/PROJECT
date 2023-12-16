Feature: Test for Aplikasi absensi kantin dosen dan staff IT Del

#Varian1
 Scenario: Test Login with Valid Credentials
    Given open chrome and start application
    When I enter valid username and valid password
    Then I can login successfully
 
#Varian2
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I enter valid username and invalid password
    #Then I cant login
    
#Varian3
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I enter invalid username and valid password
    #Then I cant login
    
#Varian4
   #Scenario: Test Login with Invalid Credentials
    #Given open chrome and start application
    #When I enter invalid username and invalid password
    #Then I cant login