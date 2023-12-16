package stepDefinition_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest_Login {
	WebDriver driver;
//1
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pa2.detimel.org/");
	}

	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
	}

	@Then("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		System.out.println("Successfully opened the application");
}
	
	
//2
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("officer");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Successfully opened the application");
//	}
//}

//3
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosensatu");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Successfully opened the application");
//	}
//}

//4
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkedua");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Successfully opened the application");
//	}

//5
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenketiga");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//6
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkeempat");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//7
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//					
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkelima");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				System.out.println("Successfully opened the application");
//	}
	
//8
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkeenam");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//9
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenketujuh");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//10
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkedelapan");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}
//}
	
//11
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkesembilan");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//12
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke10");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}
	
//13
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke11");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//14
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke12");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}
//}

//15
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke13");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//16
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke14");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//17
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke15");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//18
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke16");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}
 
//19
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke17");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//20
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke18");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//21
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke19");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//22
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke20");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}
//}

//23
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke21");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//24
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke21");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}

//25
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke22");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Successfully opened the application");
//	}
//}

//26
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//27
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("officer");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//28
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkesatu");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//29
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkedua");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//30
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenketiga");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//31
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkeempat");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//32
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkelima");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//33
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkeenam");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//34
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenketujuh");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//35
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkedelapan");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//36
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenkesembilan");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//37
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke10");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//38
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke11");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//39
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke12");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//40
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke13");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//41
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke14");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//42
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke15");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//43
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke16");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//44
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke17");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//45
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke18");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//46
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke19");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//47
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke20");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//48
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke21");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//49
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke22");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//50
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter valid username and invalid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dosenke23");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//51
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("seodalmi");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//52
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("hanjipyeong");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//53
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("parkseojoon");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//54
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("namjoohyuk");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//55
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("taehyungnapitupulu");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//56
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dika");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//57
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("estersin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//58
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("krismayanii");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//59
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("gavin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//60
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("nathanael");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//61
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("nath");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}


//62
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("jefri");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//63
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("putraa");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//64
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("awmeliaa");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//65
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("vega");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//66
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dedi");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//67
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dediandre");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//68
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("martuaraja");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//69
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dedimartua");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//70
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("rajadedi");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//71
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("dedipanggabean");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}


//72
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("vebbymon");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//73
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("monika");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//74
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("triyani");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//75
//@Given("^open chrome and start application$")
//public void open_chrome_and_start_application() throws Throwable {
//	System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://pa2.detimel.org/");
//}
//
//@When("^I enter invalid username and valid password$")
//public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("emyyy");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//}
//
//@Then("^I cant login$")
//public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		System.out.println("Failed to open the application");
//}

//76
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("emysonia");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//77
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("kacia");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//78
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("patricia");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//79
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("wenni");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//80
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("marianne");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//81
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("wensesla");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//82
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("yleeee");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//83
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("emely");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//84
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("emelyangel");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//85
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("angelalia");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//86
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("yoass");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//87
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("yoasshtu");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//88
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("hutapea");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//89
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("geraldd");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	

//90
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("gerryben");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//91
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("benyamin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//92
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("joji");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//93
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("andreas");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//94
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("ezraa");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//95
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("lasriaa");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//96
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("uteeee");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//97
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("rusdeniuca");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//98
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("noramtii");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//99
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("rivaelm");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}

//100
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("https://pa2.detimel.org/");
//	}
//
//	@When("^I enter invalid username and invalid password$")
//	public void I_enter_invalid_username_and_invalid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("ruththeresia");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("inipassword");
//	}
//
//	@Then("^I cant login$")
//	public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			System.out.println("Failed to open the application");
//	}
}