# Selenium Kanban Automation Project

This project is a Selenium-based automation script designed to perform end-to-end tests on a Kanban web application. It validates functionalities such as user login, profile updates, user management, and project creation.

---

## 🚀 Features

1. **Login Functionality**:

   - Validates successful login with correct credentials.
   - Tests login failures with incorrect credentials.

2. **Profile Management**:

   - Updates user password from the profile settings.

3. **User Management**:

   - Creates new users with different roles (e.g., Manager, User, Viewer).

4. **Project Management**:

   - Creates new projects with identifiers.

5. **Logout Functionality**:

   - Ensures proper logout after performing tests.

---

## 📂 Project Structure

### **Dependencies**

- Selenium WebDriver
- Java Development Kit (JDK)

---

## 🛠 Setup Instructions

### **1. Prerequisites**

Ensure you have the following installed:

- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) (optional)
- [Google Chrome](https://www.google.com/chrome/)
- [ChromeDriver](https://sites.google.com/chromium.org/driver/)



### **3. Set up ChromeDriver**

Download and set up ChromeDriver. Make sure the `chromedriver.exe` is in your system PATH or specify its path in the code if necessary.

### **4. Add Dependencies**

Ensure you have the Selenium dependencies in your project. Add the following to your `pom.xml` if using Maven:

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.0.0</version>
</dependency>
```

---

## 🔧 How to Run the Tests

1. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).
2. Make sure the required dependencies are resolved.
3. Execute the `tryft2.java` file.

---

## ⚙️ Functional Steps Covered

### 1. **Failed Login Test**

- Opens the Kanban application.
- Attempts login with incorrect credentials (`testadmi` / `Testadmin12345`).
- Verifies failure and closes the browser.

### 2. **Successful Login and Profile Update**

- Logs in with correct credentials (`testadmin` / `Testadmin123456`).
- Navigates to the user profile and changes the password.

### 3. **User Management**

- Creates three users with roles:
  - `testmanager` (Manager)
  - `testuser` (User)
  - `testviewer` (User)

### 4. **Project Creation**

- Creates a new project named `Tests Project` with identifier `xTP`.

### 5. **Logout**

- Ensures proper logout functionality after test execution.

---

## 🌟 Key Highlights

- **Dynamic Element Handling**: Uses XPath to locate web elements dynamically.
- **Select Dropdowns**: Handles dropdown elements using Selenium's `Select` class.
- **Thread.Sleep**: Provides explicit waits for stability.

---

## 🛠 Improvements 

- Replace `Thread.sleep` with WebDriverWait for better synchronization.
- Add assertions to validate expected outcomes.
- Modularize the code into reusable methods.

---

## ⚠️ Errors and Issues

1. **Login Failure Tracking**:

   - The script may not correctly track the number of failed login attempts. Ensure the correct handling of error messages is implemented.

2. **Password Validation Issue**:

   - The password validation is not adhering to the client's requirements. It should be adjusted according to the specified rules (e.g., length, special characters).

3.**User Count Is Not Decrementing** 

4.**Username and Password Field is In Uppercase By Default** 


