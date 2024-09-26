package Task2POM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusSelectionPage {


        private WebDriver driver;

        // Locators
        private By selectSeat = By.xpath("//a[@title='Book']");

        public BusSelectionPage(WebDriver driver) {
            this.driver = driver;
        }

        public void selectSeat() {
            driver.findElement(selectSeat).click();
        }
    }

