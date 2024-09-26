# KSRTC Bus Booking Automation

This project automates the bus booking process on the KSRTC website using Java and Selenium WebDriver. The automation covers selecting routes, dates, seats, and filling customer details without completing the payment process.

## Task Description

The following actions are automated in this project:

1. Open the KSRTC website: [KSRTC Bus Booking](https://ksrtc.in/oprs-web/guest/home.do?h=1).
2. Select a route from "CHIKKAMAGALURU" to "BENGALURU" from the popular routes.
3. Choose the arrival date only.
4. Click on "Search for bus".
5. Select a seat.
6. Choose the boarding point and dropping point.
7. Fill in the "Customer" and "Passenger" details:
   - **Phone Number**: 6789125987
8. Click on "Make payment" and fill all required fields without submitting the payment.

## Technologies Used

- **Java**: The programming language used for writing the automation scripts.
- **Selenium WebDriver**: A browser automation tool for interacting with web applications.
- **JUnit/TestNG**: For testing framework (if applicable).
- **Maven**: For project management and dependency management (if applicable).

## Prerequisites

- Java JDK 8 or higher installed on your machine.
- Maven installed (if using Maven for project management).
- An IDE (such as IntelliJ IDEA or Eclipse) for writing and executing the code.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ksrtc-bus-booking-automation.git
   cd ksrtc-bus-booking-automation
  ```

## Installation

1. **Install dependencies (if using Maven):**
   ```bash
   mvn install
## Installation

- **Open the project in your preferred IDE.**

## Running the Tests

1. **Open the main class containing the test script.**
2. **Run the test class.** It will launch a browser and perform the automation steps as described above.

## Notes

- Ensure that the web driver (e.g., ChromeDriver) is properly set up in your system's PATH.
- You may need to handle any dynamic elements or wait conditions based on the performance of the KSRTC website during your test execution.

## Author

- **Your Name** - Michael Magdy 
