# Selenium BDD Automation – Parabank Registration

This project is an **automation testing project** built using **Selenium WebDriver** and **Cucumber (BDD)**.  
It focuses on testing the **user registration feature** of the Parabank website using **positive and negative scenarios**.

This project was created as part of an **automation testing learning program / course assignment** and is intended for **practice and portfolio purposes**.

---

## Project Objectives
- Practice web automation testing using Selenium WebDriver
- Implement Behavior Driven Development (BDD) using Cucumber
- Automate user registration flow on Parabank website
- Validate positive and negative registration scenarios
- Build a clean and structured automation test project

---

## Tech Stack
- **Programming Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **BDD Framework:** Cucumber  
- **Test Runner:** JUnit  
- **Build Tool:** Maven  
- **Browser:** Google Chrome  
- **IDE:** IntelliJ IDEA  

---

## Project Structure
```
src
└── test
├── java
│ ├── config
│ │ └── env_target.java
│ ├── runner
│ │ └── RunTest.java
│ └── stepDef
│ └── RegisterSteps.java
└── resources
└── features
└── register.feature
```


---

## 🧪 Test Scenarios
### ✅ Positive Scenario
- User successfully registers with valid data
- System displays successful registration message

### ❌ Negative Scenario
- User registers with mismatched password confirmation
- System displays validation error message

---

## ▶️ How to Run the Tests
### Prerequisites
- Java JDK 11 or higher
- Maven installed
- Google Chrome installed

### Steps
1. Clone this repository:
```
   git clone https://github.com/your-username/your-repo-name.git
```
2. Navigate to the project directory:
```
cd SeleniumBDD
```
3. Run the tests using Maven:
```
mvn clean test
```
Notes
This project uses Cucumber BDD, so all test steps are defined in .feature files.
Only one step definition class is used to avoid duplicate step issues.
The project is designed for learning and demonstration purposes.
Test data is static and can be enhanced in the future using external data sources.
