# 🛒 E-Store Application — Selenium Automation Testing

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6C37?style=for-the-badge&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

> End-to-end automation testing project for [SauceDemo](https://www.saucedemo.com/) — a practice e-commerce web application. This project covers the complete purchase flow from login to order confirmation using Selenium WebDriver with Java and TestNG.

---

## 📌 Project Overview

This project automates the following user journey on SauceDemo:

1. **Login** — Enter valid credentials and verify the page title
2. **Sort Products** — Filter products by Price (Low to High) and validate sort order
3. **Add to Cart** — Add a product and verify it appears in the cart
4. **Checkout** — Verify item price and total amount on the checkout overview page
5. **Fill Information** — Validate checkout form fields with valid and invalid inputs
6. **Order Confirmation** — Capture and assert the success message on order completion

---

## 🧪 Test Scenarios Covered

### ✅ Valid Scenarios
| # | Test Case | Expected Result |
|---|-----------|----------------|
| TC01 | Login with valid username & password | User is redirected to inventory page with title "Swag Labs" |
| TC02 | Sort products by Price (Low to High) | Products displayed in ascending price order |
| TC03 | Add product to cart | Cart badge count increments; product appears in cart |
| TC04 | Verify item price on checkout overview | Price matches the product page price |
| TC05 | Fill valid First Name, Last Name, Postal Code | User proceeds to checkout overview |
| TC06 | Complete order and verify success message | "Thank you for your order!" message is displayed |

### ❌ Invalid Scenarios
| # | Test Case | Expected Result |
|---|-----------|----------------|
| TC07 | Login with invalid username | Error message: "Username and password do not match" |
| TC08 | Login with blank username/password | Error message: "Username is required" |
| TC09 | Checkout with empty First Name | Error: "First Name is required" |
| TC10 | Checkout with empty Last Name | Error: "Last Name is required" |
| TC11 | Checkout with empty Postal Code | Error: "Postal Code is required" |
| TC12 | Checkout with all fields blank | Validation error displayed; form not submitted |

---

## 🗂️ Project Structure

```
EStore-Automation/
│
├── src/
│   ├── test/
│   │   └── java/
│   │       └── tests/
│   │           ├── LoginTest.java
│   │           ├── SortProductTest.java
│   │           ├── AddToCartTest.java
│   │           ├── CheckoutTest.java
│   │           └── OrderConfirmationTest.java
│   │
│   └── main/
│       └── java/
│           └── utils/
│               └── DriverSetup.java
│
├── testng.xml
├── pom.xml
└── README.md
```

---

## ⚙️ Tech Stack

| Tool | Purpose |
|------|---------|
| **Java** | Programming language |
| **Selenium WebDriver** | Browser automation |
| **TestNG** | Test framework for organizing and running tests |
| **Maven** | Build and dependency management |
| **ChromeDriver** | Browser driver for Chrome |

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above installed
- Maven installed
- Chrome browser installed
- ChromeDriver matching your Chrome version

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/NamrataGadhave414/EStore-Automation.git
   cd EStore-Automation
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Run all tests**
   ```bash
   mvn test
   ```

4. **Run specific test class**
   ```bash
   mvn -Dtest=LoginTest test
   ```

---

## 🌐 Test Credentials

| Username | Password |
|----------|----------|
| `standard_user` | `secret_sauce` |

> ⚠️ These are publicly available demo credentials provided by SauceDemo for testing purposes.

---

## 📋 Sample Test Flow

```
1. Launch https://www.saucedemo.com/
2. Enter username: standard_user | password: secret_sauce
3. Assert page title = "Swag Labs"
4. Select sort filter → "Price (low to high)"
5. Assert first product price < last product price
6. Click "Add to cart" on first product
7. Navigate to Cart → Click Checkout
8. Assert product price on overview page
9. Fill: First Name, Last Name, Postal Code → Continue
10. Assert total amount including tax
11. Click Finish → Assert success message = "Thank you for your order!"
```

---

## 📷 Screenshots

> *(Add screenshots of test execution results and browser output here)*

---

## 👩‍💻 Author

**Namrata Gadhave**
- 📧 [namratagadhave100@gmail.com](mailto:namratagadhave100@gmail.com)
- 💼 [LinkedIn](https://linkedin.com/in/namratagadhave)
- 🐙 [GitHub](https://github.com/NamrataGadhave414)

---

## 📄 License

This project is intended for learning and portfolio purposes.
