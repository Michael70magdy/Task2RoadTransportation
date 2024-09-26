package Task2POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


        private WebDriver driver;

        // Locators
        private By popularRouteFrom = By.xpath("//a[text()='CHIKKAMAGALURU - BENGALURU']");
        private By travelDate = By.id("txtJourneyDate");
        private By searchBuses = By.id("searchBtn");

        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public void selectPopularRoute() {
            driver.findElement(popularRouteFrom).click();
        }

        public void selectTravelDate(String date) {
            driver.findElement(travelDate).clear();
            driver.findElement(travelDate).sendKeys(date);
        }

        public void clickSearchBuses() {
            driver.findElement(searchBuses).click();
        }
    }


