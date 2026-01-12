package stepDef;

import config.env_target;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterSteps extends env_target {

    WebDriverWait wait;

    @Given("User is on parabank homepage")
    public void user_is_on_parabank_homepage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(parabankLink);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("leftPanel")));
    }

    @When("User click register link button")
    public void user_click_register_link_button() {
        driver.findElement(By.linkText("Register")).click();
    }

    @Then("User is in register page")
    public void user_is_in_register_page() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(),'Signing up is easy!')]")
        ));
    }

    @When("User input name")
    public void user_input_name() {
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Doe");
    }

    @And("User input address detail")
    public void user_input_address_detail() {
        driver.findElement(By.id("customer.address.street")).sendKeys("Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("City");
        driver.findElement(By.id("customer.address.state")).sendKeys("State");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("08123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("999999");
    }

    @And("User fill valid username and password")
    public void user_fill_valid_username_and_password() {
        String username = "user" + System.currentTimeMillis();
        driver.findElement(By.id("customer.username")).sendKeys(username);
        driver.findElement(By.id("customer.password")).sendKeys("Password123");
    }

    @And("User input password confirmation")
    public void user_input_password_confirmation() {
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password123");
    }

    @And("User input invalid password confirmation")
    public void user_input_invalid_password_confirmation() {
        driver.findElement(By.id("repeatedPassword")).clear();
        driver.findElement(By.id("repeatedPassword")).sendKeys("WrongPassword");
    }

    @When("User click Register button")
    public void user_click_register_button() {
        driver.findElement(By.xpath("//input[@value='Register']")).click();
    }

    @Then("User regist successfully")
    public void user_regist_successfully() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(),'Your account was created successfully')]")
        ));
        driver.quit();
    }

    @Then("User get error password did not match")
    public void user_get_error_password_did_not_match() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(),'Passwords did not match')]")
        ));
        driver.quit();
    }
}
