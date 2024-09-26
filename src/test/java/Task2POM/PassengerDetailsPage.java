package Task2POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengerDetailsPage {
    private WebDriver driver;

    // Locators for customer details
    private By customerName = By.id("customerName");
    private By mobileNo = By.id("mobileNo");

    // Locators for passenger details
    private By passengerName = By.id("passengerName");
    private By gender = By.id("genderCodeIdMale");
    private By age = By.id("passengerAge");
    private By makePayment = By.id("PgBtn");

    public PassengerDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCustomerDetails(String name, String phone) {
        driver.findElement(customerName).sendKeys(name);
        driver.findElement(mobileNo).sendKeys(phone);
    }

    public void enterPassengerDetails(String name, String age) {
        driver.findElement(passengerName).sendKeys(name);
        driver.findElement(this.age).sendKeys(age);
        driver.findElement(gender).click();  // Select Male gender
    }

    public void clickMakePayment() {
        driver.findElement(makePayment).click();
    }
}
