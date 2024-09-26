package Task2POM;


import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import Task2POM.BaseTest;
import Task2POM.HomePage;
import Task2POM.BusSelectionPage;
import Task2POM.PassengerDetailsPage;

public class KSRTCTest extends BaseTest {

    @Test(dataProvider = "customerData")
    public void testKSRTCBooking(String date, String customerName, String phone, String passengerName, String age) {
        HomePage homePage = new HomePage(driver);
        BusSelectionPage busSelectionPage = new BusSelectionPage(driver);
        PassengerDetailsPage passengerDetailsPage = new PassengerDetailsPage(driver);

        // Step 1: Select popular route
        homePage.selectPopularRoute();

        // Step 2: Select travel date
        homePage.selectTravelDate(date);

        // Step 3: Search for buses
        homePage.clickSearchBuses();

        // Step 4: Select a seat
        busSelectionPage.selectSeat();

        // Step 5: Fill customer and passenger details
        passengerDetailsPage.enterCustomerDetails(customerName, phone);
        passengerDetailsPage.enterPassengerDetails(passengerName, age);

        // Step 6: Click Make Payment (without submitting)
        passengerDetailsPage.clickMakePayment();
    }

    @DataProvider(name = "customerData")
    public Object[][] getCustomerData() {
        return new Object[][] {
                {"25/09/2024", "John Doe", "6789125987", "John Passenger", "30"},
                {"26/09/2024", "Jane Doe", "6789125988", "Jane Passenger", "28"}
        };
    }
}
