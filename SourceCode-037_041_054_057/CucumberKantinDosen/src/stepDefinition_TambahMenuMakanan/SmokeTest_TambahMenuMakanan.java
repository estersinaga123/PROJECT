package stepDefinition_TambahMenuMakanan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest_TambahMenuMakanan {
	WebDriver driver;
	
//	//1
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
//	//2
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//3
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//4
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//5
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}

	//6
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//7
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//8
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//9
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//10
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//11
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//12
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
//	
	//13
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//14
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//15
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//16
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click(); //line ini mengklik menu makanan
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and valid description$")
//	public void I_enter_valid_date_valid_time_and_valid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//17
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//18
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//19
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//20
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//21
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//22
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	

	//23
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
	
	//24
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
//			
			//25
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			
			//26
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//27
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//28
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//29
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//30
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//31
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//32
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			
			//33
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//34
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//35
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			//36
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			
			//37
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//38
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			
			//39
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			
			//40
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
		
			//41
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
		
			//42
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			
			//43
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			
			//44
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//45
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//46
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			//47
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//48
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//49
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			
			//50
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
			
			//51
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}	
			
			//52
//			@Given("^open chrome and start application$")
//			public void open_chrome_and_start_application() throws Throwable {
//				System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//				
//				driver = new ChromeDriver();
//				driver.get("https://pa2new.detimel.org/");
//				driver.manage().window().maximize();
//			}
//			@When("^I enter valid username and valid password$")
//			public void I_enter_valid_username_and_valid_password() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//				driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//			}
//			@Then("^I can login successfully$")
//			public void I_can_login_successfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//				Thread.sleep(5000);
//			}
//			
//			@When("^I click meal menu$")
//			public void I_click_meal_menu() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).perform();
//				driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//			}
//			@And("^I enter valid date, valid time and invalid description$")
//			public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//				
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//				
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//				
//			}
//			
//			@Then("^I Can add a meal menu succesfully$")
//			public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//				driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//				System.out.println("Successfully add a meal menu");
//		}
	
//53
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//54
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//55
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//56
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//57
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//58
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//59
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//60
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//61
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//62
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//63
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
		
		//64
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
	
	//65
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}

//	//66
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
//	
//	//67
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
//	
//	//68
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
//	
//	//69
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//70
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
//	
//	//71
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//72
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//73
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//	
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	

	//74
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}

	
	//75
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//76
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//77
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//78
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//79
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//80
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//81
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//82
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//83
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//84
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//85
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//86
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//87
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//88
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//89
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//			
//			driver = new ChromeDriver();
//			driver.get("https://pa2new.detimel.org/");
//			driver.manage().window().maximize();
//		}
//		@When("^I enter valid username and valid password$")
//		public void I_enter_valid_username_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//			driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//		}
//		@Then("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//			Thread.sleep(5000);
//		}
//		
//		@When("^I click meal menu$")
//		public void I_click_meal_menu() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(element).perform();
//			driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//		}
//		@And("^I enter valid date, valid time and invalid description$")
//		public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//			
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//			
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//			
//		}
//		
//		@Then("^I Can add a meal menu succesfully$")
//		public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//			System.out.println("Successfully add a meal menu");
//	}
	
	//90
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//91
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//92
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//93
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//94
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//95
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//96
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//97
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//98
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam, Sambal Terasi, Urap");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//99
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ikan teri nasi, daun ubi, rujak");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
	
	//100
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\chromedriver_win32\\chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		driver.get("https://pa2new.detimel.org/");
//		driver.manage().window().maximize();
//	}
//	@When("^I enter valid username and valid password$")
//	public void I_enter_valid_username_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input")).sendKeys("admin");
//		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/input")).sendKeys("password");
//	}
//	@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		Thread.sleep(5000);
//	}
//	
//	@When("^I click meal menu$")
//	public void I_click_meal_menu() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		WebElement element = driver.findElement(By.id("kt_app_sidebar_toggle"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).perform();
//		driver.findElement(By.xpath("//*[@id=\"#kt_app_sidebar_menu\"]/div[6]/a/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_content_container\"]/div/div[1]/div[2]/a")).click();
//	}
//	@And("^I enter valid date, valid time and invalid description$")
//	public void I_enter_valid_date_valid_time_and_invalid_description() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_app_sidebar_toggle\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_4\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_app_body\"]/div[3]/div[2]/div/div[2]/div/span[11]")).click();
//		
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_datepicker_8\"")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]")).click();
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_product_general\"]/div/div/div[2]/div[3]/div[1]/div[2]/div")).sendKeys("Ayam Cabe, Daun ubi, salad buah");
//		
//	}
//	
//	@Then("^I Can add a meal menu succesfully$")
//	public void I_Can_add_a_meal_menu_succesfully() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"kt_ecommerce_add_category_submit\"]/span[1] ")).click();
//		System.out.println("Successfully add a meal menu");
//}
}
