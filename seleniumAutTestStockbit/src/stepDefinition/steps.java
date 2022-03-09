package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
    WebDriver driver;			

	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stockbit.com/#/login");
	}

	@When("^Enter the Invalid Username and Password$")
	public void enter_the_invalid_Username_and_Password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("farisyahdin");
		driver.findElement(By.id("password")).sendKeys("randompwd192890");
	}

	@Then("^Failed login$")
	public void failed_login() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	}

}
