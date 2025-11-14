# 🚀 Automation Project : Selenium Practice on Let's Kode It

## Project Title
[cite_start]**Automation Testing of "Let's Kode It Practice" Website** [cite: 3]

---

## 🎯 Objective
[cite_start]To automate and validate multiple core web elements—including text fields, buttons, dropdowns, checkboxes, radio buttons, frames, mouse hover, and alerts—using **Selenium WebDriver** for comprehensive practice. [cite: 5]

---

## 🛠️ Tools & Technologies
[cite_start]The project is built using a standard Selenium framework stack. [cite: 8]

| Category | Component |
| :--- | :--- |
| **Programming Language** | [cite_start]Java [cite: 9] |
| **Automation Tool** | [cite_start]Selenium WebDriver [cite: 9] |
| **Integrated Development Environment (IDE)** | [cite_start]Eclipse [cite: 9] |
| **Browser Used** | [cite_start]Firefox / Chrome [cite: 9] |
| [cite_start]**Test URL** | https://www.letskodeit.com/practice [cite: 7] |

---

## ⚙️ Project Setup and Execution

### Prerequisites
* Java Development Kit (JDK) installed.
* Eclipse IDE installed.
* Selenium WebDriver and necessary dependencies (e.g., `selenium-java`) added to the project classpath.
* Corresponding browser driver (`GeckoDriver.exe` for Firefox or `ChromeDriver.exe` for Chrome) downloaded and configured in the system properties.

### Execution Notes
* [cite_start]Code runs automatically without manual intervention. [cite: 37]
* [cite_start]**Best Practice:** The code utilizes different locator strategies (`id`, `name`, `xpath`, `cssSelector`) for element identification. [cite: 37]

---

## ✅ Tasks Performed (9 Test Cases)

The project includes automation scripts covering the following nine scenarios:

### Section 1: Browser & Basic Elements
1.  [cite_start]**Task 1: Navigation:** Open the website, maximize the window, and **verify the page title**. [cite: 12]
2.  [cite_start]**Task 2: Text Input:** Locate the "Enter Your Name" textbox using `By.id("name")`, type text, and **verify the entered text**. [cite: 14]

### Section 2: Interactive Elements
3.  [cite_start]**Task 3: Alerts:** Click the "Alert" and "Confirm" buttons, handling the resulting JavaScript alerts by accepting and dismissing them. [cite: 16]
4.  [cite_start]**Task 4: Checkboxes:** Select all three available checkboxes (BMW, Benz, Honda) and **verify that each is selected**. [cite: 18]
5.  [cite_start]**Task 5: Radio Buttons:** Click all available radio buttons (BMW, Benz, Honda) and **verify that the clicked button is selected**. [cite: 20]
6.  [cite_start]**Task 6: Dropdown:** Use the **`Select` class** to interact with the dropdown and select the options: Benz, BMW, and Honda. [cite: 22]

### Section 3: Advanced Interactions
7.  [cite_start]**Task 7: Mouse Hover:** Perform a mouse hover action over the "Mouse Hover" button, then click on the exposed hidden link ("Top" or "Reload"). [cite: 24]
8.  [cite_start]**Task 8: Frame Handling:** Scroll to the "iFrame Example" section, switch into the iframe, type text into the search bar, and then **switch back to the main content**. [cite: 26]
9.  [cite_start]**Task 9: Alert Verification:** Trigger the alert again and **verify the exact alert text** before accepting it. [cite: 28]

---

## 📈 Evaluation Criteria

The project is evaluated based on the following metrics, emphasizing code quality and verification:

| Criteria | Marks | Focus |
| :--- | :--- | :--- |
| Setup & Execution | 10 | [cite_start]Successful environment configuration and execution. [cite: 33] |
| Test Case Coverage | 20 | [cite_start]Complete automation of all 9 tasks. [cite: 33] |
| **Assertions & Validations** | **20** | [cite_start]**Verification of element states and page content.** [cite: 33] |
| Code Organization | 15 | [cite_start]Proper commenting, indentation, and structure. [cite: 33, 37] |
| Reporting & Documentation | 20 | [cite_start]Submission of logs and passed/failed reports. [cite: 33] |
| Creativity / Bonus Tasks | 15 | [cite_start]Reusability, clean code, and advanced techniques. [cite: 33, 37] |
| **Total** | **100** | |
