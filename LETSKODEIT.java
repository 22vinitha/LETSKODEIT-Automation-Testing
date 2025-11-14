package LETSKODEIT;




import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class LETSKODEIT {
		
		public static void main(String[] args) throws InterruptedException {
			
				//Task 1: Browser Launch and Page Navigation
			System.out.println("\n--- Task 1 ---"); 
			System.setProperty("webdriver.firefox.logfile", "/dev/null");// remove logs
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Vinitha\\Selenium\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.letskodeit.com/practice");
			System.out.println("Navigated to LETSKODEIT...");
			
			 	// Verify page title
	        String expectedTitle = "Practice Page";
	        String actualTitle = driver.getTitle();
	
	        if (actualTitle.equals(expectedTitle)) {
	            System.out.println(" PASSED: Page title is correct -> " + actualTitle);
	        } else {
	            System.out.println(" FAILED: Expected '" + expectedTitle + "' but got '" + actualTitle + "'");
	        }
	        
	        	// Task 2: findElement and sendKeys
	        
	        	// Locate the 
	        System.out.println("\n--- Task 2 ---"); 
	        
	        WebElement nameTextbox = driver.findElement(By.id("name"));
	
	        	// Type your name
	        String myName = "Vinitha";
	        nameTextbox.sendKeys(myName);
	        Thread.sleep(2000);
	
	        	// Verify the entered text
	        String enteredText = nameTextbox.getAttribute("value");
	        if (enteredText.equals(myName)) {
	            System.out.println("PASSED: Text entered correctly -> " + enteredText);
	        } else {
	            System.out.println("FAILED: Expected '" + myName + "' but got '" + enteredText + "'");
	        }
	
	        	//Task 3: Button Click
	        
	        	// Alert button
	        System.out.println("\n--- Task 3 ---"); 
	        driver.findElement(By.id("alertbtn")).click();
	        Alert alert = driver.switchTo().alert();
	        System.out.println("Alert text: " + alert.getText());
	        Thread.sleep(2000);
	        alert.accept();
	       
	
	        	// Confirm button
	        driver.findElement(By.id("confirmbtn")).click();
	        Alert confirm = driver.switchTo().alert();
	        System.out.println(" Confirm text: " + confirm.getText());
	        Thread.sleep(2000);
	        confirm.dismiss();
	
	        	//Task 4: Checkbox Handling
	        
	        System.out.println("\n--- Task 4 ---"); 
	        String[] cars = {"bmwcheck", "benzcheck", "hondacheck"};
	        for(String id : cars) {
	            WebElement checkbox = driver.findElement(By.id(id));
	            Thread.sleep(2000);
	            if(!checkbox.isSelected()) checkbox.click();
	            Thread.sleep(1000);
	           
	            System.out.println("'" + id + "' selected:  " + checkbox.isSelected());
	        }
	
	        
	        	//Task 5: Radio Button Handling
	        
	        System.out.println("\n--- Task 5 ---"); 
	        String[] radios = {"bmwradio", "benzradio", "hondaradio"};
	        for(String id : radios) {
	            WebElement radio = driver.findElement(By.id(id));
	            Thread.sleep(2000);
	            radio.click();
	            System.out.println("'" + id + "' selected:  " + radio.isSelected());
	        }
	
	        	//Task 6: Dropdown Handling
	        
	        
	        System.out.println("\n--- Task 6 ---"); 
	        WebElement dropdown = driver.findElement(By.id("carselect"));
	        Select select = new Select(dropdown);
	        Thread.sleep(2000);
	        String[] options = {"Benz", "BMW", "Honda"};
	        for(String option : options) {
	        	Thread.sleep(2000);
	            select.selectByVisibleText(option);
	            System.out.println("'" + "Selected: " + select.getFirstSelectedOption().getText());
	        }

	        	//Task 7: Mouse Hover
	          System.out.println("\n--- Task 7 ---");
		      WebElement hoverButton = driver.findElement(By.id("mousehover"));
		
		     // Scroll the element into view using JavaScript
		     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hoverButton);
		     Thread.sleep(2000);
		
		     Actions actions = new Actions(driver);
		     Thread.sleep(1000);
		     actions.moveToElement(hoverButton).perform();
		     System.out.println(" Mouse hovered over 'Mouse Hover' button");
		
		     // Click hidden link
		     driver.findElement(By.linkText("Top")).click();
		     System.out.println("Clicked on hidden link 'Top'");
		     
		     //task 8 iframe
		     
		     System.out.println("\n--- Task 8: Frame Handling ---");
		
			  // Locate iframe
			  WebElement iframe = driver.findElement(By.id("courses-iframe"));
			
			  // Scroll main page to iframe
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", iframe);
			  System.out.println("Scrolled main page to iframe");
			
			  Thread.sleep(2000);
			  
			  // Switch to iframe
			  driver.switchTo().frame(iframe);
			  System.out.println("Switched to iframe");
			
			  // Locate the input inside the form
			  WebElement searchBox = driver.findElement(By.cssSelector("form#search input[name='course']"));
			
			  // Scroll the input inside the iframe
			  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBox);
			  System.out.println("Scrolled to input inside iframe");
			
			  // Wait until clickable
			  WebDriverWait wait = new WebDriverWait(driver, 15);
			  wait.until(ExpectedConditions.elementToBeClickable(searchBox));
			
			  // Type text
			  searchBox.sendKeys("Selenium webdriver advanced");
			  System.out.println("Typed 'Selenium webdriver advanced' inside iframe");
			  
			  Thread.sleep(2000);
			
			  // Locate and scroll search button
			  WebElement searchButton = driver.findElement(By.cssSelector("form#search button.find-course.search-course"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchButton);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchButton);
			
			  Thread.sleep(2000);
			  // Click the button
			  searchButton.click();
			  System.out.println("Clicked the search button");
			
			  // Switch back to main content
			  driver.switchTo().defaultContent();
			  System.out.println("PASSED: Switched back to main content");
			
		
		
	     // ----------------------------------------------------------------
	     // Task 9: Alert Handling (Trigger Code)
	     // ----------------------------------------------------------------
	     System.out.println("\n--- Task 9: Alert Handling ---");
	
	     // This click is on the main page, and it works because of defaultContent() above
	     driver.findElement(By.id("alertbtn")).click();
	     Thread.sleep(2000);
	     
	     Alert alert2 = driver.switchTo().alert();
	
	     String alertText = alert2.getText();
	     System.out.println("Alert text: " + alertText);
	
	     if(alertText.contains("Hello")) {
	         System.out.println("Task 9 PASSED: Alert verified successfully");
	     }
	
	     alert2.accept();
	     System.out.println("Alert accepted");
	
	     
	 
	
	        driver.quit();
	        System.out.println("Browser closed.");
	    }
	}
	


