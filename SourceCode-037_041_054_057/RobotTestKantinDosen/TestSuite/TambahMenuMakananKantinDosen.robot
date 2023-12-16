*** Settings ***
Library    SeleniumLibrary

*** Test Cases ***

TambahMakanan1
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[26]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    AAyam, Sambal Terasi, Urap
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan2
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[30]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    TTelur dadar, Mie aceh, Tempe sambal
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan3
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[30]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    AAyam goreng, Tumis kangkung, Tahu tempe goreng, Sambal, Salad buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan4
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[28]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    AAyam goreng, Tumis kangkung, Tahu tempe goreng, Sambal, Salad buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan5
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ifu mie goreng, Oeak arik teri tempe goreng
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan6
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[28]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayamn kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan7
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[27]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Gulai telur kentang, Cah jipang wortel, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan8
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[26]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Soto ayam, Kentang goreng, Sambal merah, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan9
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[25]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Jahir pesmol, bayam bening, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan10
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[31]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Tahu gulai, Tumis kol
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan11
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[32]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Bihun goreng, Tempe sambal, kerupuk
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan12
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[32]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Lele sambal, Urap, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan13
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[31]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ikan asin kertas sambal, Gulai daun ubi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan14
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[31]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ikan salam sambal, sawi putih wortel santan, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan15
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[30]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam andaliman, cap cay, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan16
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Lele kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]                               
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan17
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih~Lele kalasan~sambal~cah kacang panjang~buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan18
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih!Lele kalasan!sambal!cah kacang panjang!buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan19
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih@Lele kalasan@sambal@cah kacang panjang@buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan20
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih#Lele kalasan#sambal#cah kacang panjang#buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan21
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih$Lele kalasan$sambal$cah kacang panjang$buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan22
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih&Lele kalasan&sambal&cah kacang panjang&buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan23
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih | Lele kalasan | sambal | cah kacang panjang | buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan24
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih { Lele kalasan { sambal { cah kacang panjang { buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan25
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih } Lele kalasan } sambal } cah kacang panjang } buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan26
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    N1.Nasi putih 2.Daging ayam lada hitam 3.sayur kari 4.buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan27
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam lada hitam, sayur kari, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan28   
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan29  
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Gulai telur kentang, Cah jipang wortel, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   

TambahMakanan30 
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Gulai telur, tumis jipang wortel, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan31 
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi goreng, telur, timun, kerupuk
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan32
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam lada hitam, sayur kari, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan33
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam lada hitam, sayur kari, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan34
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam lada hitam, sayur kari, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan35
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ikan asin kertas sambal, Gulai daun ubi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan36
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Lele sambal, Urap, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan37
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Jahir sambal, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan38
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ikan asin kertas sambal, Gulai daun ubi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   

TambahMakanan39
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ifu mie goreng, Oeak arik teri tempe goreng
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan40
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[29]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayamn kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan41
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[2]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayamn kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan42
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[2]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayamn kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan43
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[3]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayamn kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan44
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[4]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayamn kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan45
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[5]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan46
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[6]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan47
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[7]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan48
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan49
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam kalasan, Tumis sawi putih wortel, sambal terasi, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan50
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Daging ayam andaliman, cap cay, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan51
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    AAyam, Sambal Terasi, Urap
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan52
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    TTelur dadar, Mie aceh, Tempe sambal
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan53
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    N1.Nasi putih 2.Daging ayam lada hitam 3.sayur kari 4.buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan54
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih } Lele kalasan } sambal } cah kacang panjang } buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan55
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih { Lele kalasan { sambal { cah kacang panjang { buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan56
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih ^ Lele kalasan ^ sambal ^ cah kacang panjang ^ buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan57
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih @ Lele kalasan @ sambal @ cah kacang panjang @ buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan58
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih & Lele kalasan & sambal & cah kacang panjang & buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan59
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih ! Lele kalasan ! sambal ! cah kacang panjang ! buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan60
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih # Lele kalasan # sambal # cah kacang panjang # buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan61
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih $ Lele kalasan $ sambal $ cah kacang panjang $ buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan62
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih : Lele kalasan : sambal : cah kacang panjang : buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan63
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih  Lele kalasan ~ sambal ~ cah kacang panjang ~ buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan64
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih  Lele kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan65
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Lele kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan66
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Lele kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan67
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi gurih, Lele kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan68
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ayam kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan69
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ikan teri sambal, sambal, tumis kangkung, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan70
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ayam kecap, sambal, bakwan, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan71
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Lele kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan72
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Ayam kecap, sambal, bakwan, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan73
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Lele kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan74
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Lele kalasan, sambal, cah kacang panjang, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan75
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    TTelur dadar, Mie aceh, Tempe sambal
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan76
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan77
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    Nasi putih ~ Lele kalasan ~ sambal ~ cah kacang panjang ~ buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan78
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih ~ Lele kalasan ~ sambal ~ cah kacang panjang ~ buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan79
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan80
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan81
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan82
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan83
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan84
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[2]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan85
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan86
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan87
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan88
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[6]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed

TambahMakanan89
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[6]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   # Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan90
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[6]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   # Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan91
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[6]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   # Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi goreng, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan92
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[6]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   # Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed

TambahMakanan93
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[6]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   # Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Mie gomak kuah, telur sambal, kerupuk, buah
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan94
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   # Click Element    //*[@id="kt_datepicker_4"]
   # Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[6]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   # Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih, Sop ayam, bubur kacang hijau
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan95
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[2]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih!Sop ayam!bubur kacang hijau
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan96
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[3]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih^Sop ayam^bubur kacang hijau
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan97
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[4]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih&Sop ayam&bubur kacang hijau
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan98
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[7]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih@Sop ayam@bubur kacang hijau
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan99
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[8]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih!Sop ayam!bubur kacang hijau
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed
   
TambahMakanan100
   Open Browser    https://pa2.detimel.org    chrome
   Set Selenium Implicit Wait    5
   Maximize Browser Window
   Sleep    2
   Input Text    //*[@id="login-form"]/div[2]/input    admin
   Input Password    //*[@id="login-form"]/div[3]/input    password
   Click Element    //*[@id="login-button"]
   Sleep    2
   Click Element    //*[@id="#kt_app_sidebar_menu"]/div[6]/a/span[2]
   Click Element    //*[@id="kt_app_content_container"]/div/div[1]/div[2]/a
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[1]
   Click Element    //*[@id="kt_datepicker_4"]
   Click Element    //*[@id="kt_app_body"]/div[3]/div[2]/div/div[2]/div/span[5]
   Sleep    2
   # Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[2]
   # Click Element    //*[@id="kt_datepicker_8"]
   # Sleep    2
   Click Element    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]
   Input Text    //*[@id="kt_ecommerce_add_product_general"]/div/div/div[2]/div[3]/div[1]/div[2]/div    NNasi putih*Sop ayam*bubur kacang hijau
   Click Element    //*[@id="kt_ecommerce_add_category_submit"]/span[1]       
   Log    Failed to Add meal menu                        
   Sleep    5
   Close Browser
   Log    Test Completed