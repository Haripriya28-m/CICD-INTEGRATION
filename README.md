# CI/CD INTEGRATION

COMPANY: CODTECH IT SOLUTIONS

NAME: HARIPRIYA M

INTERN ID: CT08WN211

DOMAIN: AUTOMATION TESTING

DURATION: 8 WEEKS

MENTOR: NEELA SANTOSH

# Adactin Hotel Booking Automation

This project automates the hotel booking process on [Adactin Hotel App](https://adactinhotelapp.com/) using **Selenium WebDriver**, **Java**, **TestNG**, and **Maven**. CI/CD integration is set up using **GitHub Actions** to run tests automatically on every push or pull request.

## 🚀 Technologies Used

- Java 17
- Selenium WebDriver
- TestNG
- Maven
- GitHub Actions (CI/CD)
- ChromeDriver (managed via WebDriverManager)
- Surefire Reports

## 📁 Project Structure

HotelBookingAutomation/
├── src/
│ └── test/
│ └── java/
│ └── tests/
│ └── HotelBookingTest.java
├── pom.xml
├── testng.xml
└── .github/
└── workflows/
└── selenium-tests.yml

## 🧪 How to Run Tests Locally

### Prerequisites
- JDK 17 or higher
- Maven
- Chrome Browser

### Run with Maven:

mvn clean test

## GitHub Actions CI/CD
- This project uses GitHub Actions to automatically run tests on:

- Pushes to the main branch

- Pull requests to the main branch

- Workflow File: .github/workflows/selenium-tests.yml

## Test Reports

- After each GitHub Actions run, test reports are available under the Actions > Run > Artifacts section. These reports are generated using Maven Surefire.
Workflow File: .github/workflows/selenium-tests.yml

## OUTPUT
![Image](https://github.com/user-attachments/assets/05899755-f51d-4589-a3e3-d1a074bafa89)
