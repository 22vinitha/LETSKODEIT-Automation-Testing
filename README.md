# 🚀 Automation Project : Selenium Practice on Let's Kode It

## Project Title
**Automation Testing of "Let's Kode It Practice" Website**

---

## 🎯 Objective
To automate and validate multiple core web elements—including text fields, buttons, dropdowns, checkboxes, radio buttons, frames, mouse hover, and alerts—using **Selenium WebDriver**.

---

## 🛠️ Tools & Technologies
The project is built using a standard Selenium framework stack.

| Category | Component |
| :--- | :--- |
| **Programming Language** | Java |
| **Automation Tool** | Selenium WebDriver |
| **Integrated Development Environment (IDE)** | Eclipse |
| **Browser Used** | Firefox / Chrome |
| **Test URL** | https://www.letskodeit.com/practice |

---

## ⚙️ Project Setup and Execution

### Prerequisites
* Java Development Kit (JDK) installed.
* Eclipse IDE installed.
* Selenium WebDriver and necessary dependencies (e.g., `selenium-java`) added to the project classpath.
* Corresponding browser driver (`GeckoDriver.exe` for Firefox or `ChromeDriver.exe` for Chrome) downloaded and configured in the system properties.

### Execution Notes
* Code runs automatically without manual intervention.
* **Best Practice:** The code utilizes different locator strategies (`id`, `name`, `xpath`, `cssSelector`) for element identification.

---

## ✅ Tasks Performed (9 Test Cases)

The project includes automation scripts covering the following nine scenarios:

### Section 1: Browser & Basic Elements
1.  **Task 1: Navigation:** Open the website, maximize the window, and **verify the page title**.
2.  **Task 2: Text Input:** Locate the "Enter Your Name" textbox using `By.id("name")`, type text, and **verify the entered text**.

### Section 2: Interactive Elements
3.  **Task 3: Alerts:** Click the "Alert" and "Confirm" buttons, handling the resulting JavaScript alerts by accepting and dismissing them.
4.  **Task 4: Checkboxes:** Select all three available checkboxes (BMW, Benz, Honda) and **verify that each is selected**.
5.  **Task 5: Radio Buttons:** Click all available radio buttons (BMW, Benz, Honda) and **verify that the clicked button is selected**.
6.  **Task 6: Dropdown:** Use the **`Select` class** to interact with the dropdown and select the options: Benz, BMW, and Honda.

### Section 3: Advanced Interactions
7.  **Task 7: Mouse Hover:** Perform a mouse hover action over the "Mouse Hover" button, then click on the exposed hidden link ("Top" or "Reload").
8.  **Task 8: Frame Handling:** Scroll to the "iFrame Example" section, switch into the iframe, type text into the search bar, and then **switch back to the main content**.
9.  **Task 9: Alert Verification:** Trigger the alert again and **verify the exact alert text** before accepting it.

---

