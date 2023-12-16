*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***

Login1
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed

Login2
      Open Browser    https://pa2.detimel.org    chrome
      Set Selenium Implicit Wait    5
      Sleep    2
      Input Text     //*[@id="login-form"]/div[2]/input    officer
      Input Password    //*[@id="login-form"]/div[3]/input    password
      Click Element    //*[@id="login-button"]
      Sleep    5
      Close Browser
      Log    Test Completed
      
Login3
      Open Browser    https://pa2.detimel.org    chrome
      Set Selenium Implicit Wait    5
      Sleep    2
      Input Text     //*[@id="login-form"]/div[2]/input    dosensatu
      Input Password    //*[@id="login-form"]/div[3]/input    password
      Click Element    //*[@id="login-button"]
      Sleep    5
      Close Browser
      Log    Test Completed
  
Login4
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkedua
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login5
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenketiga
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login6
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkeempat
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login7
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkelima
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login8
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkeenam
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login9
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenketujuh
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login10
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkedelapan
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login11
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkesembilan
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login12
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke10
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login13
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke11
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login14
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke12
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login15
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke13
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login16
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke14
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login17
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke15
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login18
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke16
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login19
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke17
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login20
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke18
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login21
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke19
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    10
   Close Browser
   Log    Test Completed
   
Login22
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke20
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login23
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke21
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login24
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke22
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login25
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke23
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login26
    Log    Test login dengan username valid dan password tidak valid (password kosong)
    Open Browser    https://pa2.detimel.org    chrome
    Set Selenium Implicit Wait    5
    Maximize Browser Window
    Sleep    2
    Input Text    //*[@id="login-form"]/div[2]/input    admin
    #Input Password    ${xpath_input_password}    ${password}
    Click Element    //*[@id="login-button"]
    Log    Failed to login              
    Sleep    5    
    Close Browser
    Log    Test completed
   
Login27
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    inipassword
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login28
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    PASSWORD
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login29
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    p
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser

   
Login30
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    officer
   Input Password    //*[@id="login-form"]/div[3]/input    p@ssword
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login31
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    officer
   Input Password    //*[@id="login-form"]/div[3]/input    password_.
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login32
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    officer
   Input Password    //*[@id="login-form"]/div[3]/input    PASSWORD INI HANYA UNTUK YANG BERIMAN
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login33
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    officer
   Input Password    //*[@id="login-form"]/div[3]/input   123456789
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login34
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input   라헬
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login35
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    officer
   Input Password    //*[@id="login-form"]/div[3]/input   라헬
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login36
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input   라RA헬HEL SIANIPAR
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login37
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    officer
   Input Password    //*[@id="login-form"]/div[3]/input   Sam-Sam Tech
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login38
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosensatu
   Input Password    //*[@id="login-form"]/div[3]/input   Passwordsatu
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login39
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkedua
   Input Password    //*[@id="login-form"]/div[3]/input   satusampe10ya
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login40
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenketiga
   Input Password    //*[@id="login-form"]/div[3]/input   if321057
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login41
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkeempat
   Input Password    //*[@id="login-form"]/div[3]/input   yubi yubi 02
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login42
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkelima
   Input Password    //*[@id="login-form"]/div[3]/input   if you could see me crying in my room
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login43
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkeenam
   Input Password    //*[@id="login-form"]/div[3]/input   itaewonclass
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login44
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenketujuh
   Input Password    //*[@id="login-form"]/div[3]/input   rahasiayaaa
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login45
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkedelapan
   Input Password    //*[@id="login-form"]/div[3]/input   8delapan
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login46
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenkesembilan
   Input Password    //*[@id="login-form"]/div[3]/input   s
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login47
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke10
   Input Password    //*[@id="login-form"]/div[3]/input   satutitik10bintang
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login48
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke11
   Input Password    //*[@id="login-form"]/div[3]/input   uri
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login49
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke12
   Input Password    //*[@id="login-form"]/div[3]/input   urimaji
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login50
   Log    Test login dengan username valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    dosenke13
   Input Password    //*[@id="login-form"]/div[3]/input   terakiryadek
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login51
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    namdosan
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login52
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    hanjipyeong
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login53
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    seodalmi
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login54
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    ra
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login55
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    12345
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login56
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    Rahel Amelia Vega
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login57
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    라헬
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed

Login58
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    rahelavs_.
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login59
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    rahel@_
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed

Login60
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    _123.rahel
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login61
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    vega
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login62
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    samu3l
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login63
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    Park sae ro yi
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login64
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    Kim dami
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
    
Login65
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    jo yi seo
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login66
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    On soo ah
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login67
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    kwon nara
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   

Login68
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    Jang geun won
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login69
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    Won in jae
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login70
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    Kim bok joo
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login71
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    Lee sung kyung
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   

Login72
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    ParkSeoJoon
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login73
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   ParkRachel
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login74    
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   Jung Jae Yi
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login75  
   Log    Test login dengan username tidak valid dan password valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   Lee Sun OK
   Input Password    //*[@id="login-form"]/div[3]/input   password
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login76
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   GavinNat
   Input Password    //*[@id="login-form"]/div[3]/input   inipassword
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login77
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   KrismayaniEster
   Input Password    //*[@id="login-form"]/div[3]/input   passwordya
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login78
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   Sammysiahaan
   Input Password    //*[@id="login-form"]/div[3]/input   passwordok
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login79
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   andreededi
   Input Password    //*[@id="login-form"]/div[3]/input   katasandi
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login80
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   ireneredvelvet
   Input Password    //*[@id="login-form"]/div[3]/input   passwordini
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login81
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   seulgi
   Input Password    //*[@id="login-form"]/div[3]/input   yabuseyo
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login82
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   jennie
   Input Password    //*[@id="login-form"]/div[3]/input   biccinsekya
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login83
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   yuki
   Input Password    //*[@id="login-form"]/div[3]/input   aniyaa
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login84
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   yoashutapea
   Input Password    //*[@id="login-form"]/div[3]/input   astagfirullah
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login85
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   bundarezha
   Input Password    //*[@id="login-form"]/div[3]/input   nununana
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login86
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   emely
   Input Password    //*[@id="login-form"]/div[3]/input   wongcingyengtae
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login87
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   juli
   Input Password    //*[@id="login-form"]/div[3]/input   apa
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login88
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   soniaemy
   Input Password    //*[@id="login-form"]/div[3]/input   tri
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login89
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   sunmi
   Input Password    //*[@id="login-form"]/div[3]/input   gashina
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login90
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   santa_.
   Input Password    //*[@id="login-form"]/div[3]/input   tanggalh4ri1n1
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login91
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   SUANDIKA NAPITUPULU
   Input Password    //*[@id="login-form"]/div[3]/input   tahunakhir12345
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login92
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   Harry Potter
   Input Password    //*[@id="login-form"]/div[3]/input    Wizard
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login93
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   grangerHermione
   Input Password    //*[@id="login-form"]/div[3]/input   sayang
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login94
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   RonaldWeasley
   Input Password    //*[@id="login-form"]/div[3]/input   another_weasley
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login95
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   kimjennie
   Input Password    //*[@id="login-form"]/div[3]/input   naneunsolo
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login96
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   sojisub
   Input Password    //*[@id="login-form"]/div[3]/input   bogosippo
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login97
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   GongYoo
   Input Password    //*[@id="login-form"]/div[3]/input   ahjussi
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login98
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   Kim shin123
   Input Password    //*[@id="login-form"]/div[3]/input   Jieuntakhusbu
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login99
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   Tanjiro
   Input Password    //*[@id="login-form"]/div[3]/input   bakayaro
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed
   
Login100
   Log    Test login dengan username tidak valid dan password tidak valid
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input   Princess
   Input Password    //*[@id="login-form"]/div[3]/input   okeya
   Click Element    //*[@id="login-button"]
   Log    Failed to login 
   Sleep    5
   Close Browser
   Log    Test Completed