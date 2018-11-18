package commonmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import constantvalues.ConstantValues;
import mainScript.Driverscript;
import readwrite.ExcelRW;
import utilities.Locatorvaluesplit;
import utilities.Logging;
import utilities.Takingautoscreenshots;

public class Actionkeywords {

	public static WebDriver driver;
	public static WebDriverWait wait; 
	public static String fetchedvalue;
	public static String defWinID;
	
	
	public static WebDriver browserType(String bName) throws Exception {
		try {
			if (bName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", ConstantValues.chromedriverpath);
				driver = new ChromeDriver();	
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				Logging.info("Running the execution in Chrome browser");
				Reporter.log("Running the execution in Chrome browser");
			} else if (bName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", ConstantValues.Firefoxdriverpath);
				driver = new FirefoxDriver();			
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				Logging.info("Running the execution in Firefox browser");
				Reporter.log("Running the execution in Firefox browser");
			} else {
				System.out.println("Wrong browser name entered");
			}			
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "browsertype");
			Logging.error("Not able to launch the browser");
			Reporter.log("Not able to launch the browser");
			e.printStackTrace();
		}
		return driver;
	}
	
	public static void openBrowser(String testdata) throws Exception {
		try {
			driver.get(testdata);			
			Logging.info("Opened the website --- " + testdata);
			Reporter.log("Opened the website --- " + testdata);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Logging.error("Not able to open the website --- " + testdata);
			Reporter.log("Not able to open the website --- " + testdata);
			e.printStackTrace();
		}
	}
	
	public static void mousehover_Withoutclick(String locatorvalue) throws Exception {
		try {
			WebElement element = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			Actions act = new Actions(driver);
			Thread.sleep(1000);
			jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			act.moveToElement(element).build().perform();
			Reporter.log("Mouse hovering withoutclick working fine at location ---" + locatorvalue);
			Logging.info("Mouse hovering withoutclick working fine at location ---" + locatorvalue);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "mousehover_Withoutclick");
			Logging.error("Mouse hovering withoutclick did not work at location ---" + locatorvalue);
			Reporter.log("Mouse hovering withoutclick did not work at location ---" + locatorvalue);
			e.printStackTrace();
		}
	}
	
	public static void mousehover_Withclick(String locatorvalue) throws Exception {
		try {
			WebElement element = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
			Actions act = new Actions(driver);
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			act.moveToElement(element).click().build().perform();
			Logging.info("Mouse hovering withclick working fine at location ---" + locatorvalue);
			Reporter.log("Mouse hovering withclick working fine at location ---" + locatorvalue);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "mousehover_Withclick");
			Logging.error("Mouse hovering withclick did not work at location ---" + locatorvalue);
			Reporter.log("Mouse hovering withclick did not work at location ---" + locatorvalue);
			e.printStackTrace();
		}
	}
	
	public static String fetchValue(String locatorvalue) throws Exception {
		try {
			fetchedvalue = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue)).getText();
			System.out.println(fetchedvalue);
			Logging.info("Fetched the value successfully from location ---" + locatorvalue);
			Reporter.log("Fetched the value successfully from location ---" + locatorvalue);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "fetchValue");
			Logging.error("Not able to Fetch the value from location ---" + locatorvalue);
			Reporter.log("Not able to Fetch the value from location ---" + locatorvalue);
			e.printStackTrace();
		}
		return fetchedvalue;
	}
	
	public static void handling_click(String locatorvalue) throws Exception {
		try {
			WebElement element = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
			Thread.sleep(1000);
			element.click();
			Logging.info("Handling click method working fine at location ---" + locatorvalue);
			Reporter.log("Handling click method working fine at location ---" + locatorvalue);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "handling_click");
			Logging.error("Handling click method did not work at location ---" + locatorvalue);
			Reporter.log("Handling click method did not work at location ---" + locatorvalue);
			e.printStackTrace();
		}
	}
	
	public static void handle_sendkey(String locatorvalue, String value) throws Exception {
		try {
			Thread.sleep(1000);
			WebElement element = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
			element.sendKeys(value);
			Logging.info("Handling sendkey method working fine at location ---" + locatorvalue);
			Reporter.log("Handling sendkey method working fine at location ---" + locatorvalue);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "handling_click");
			Logging.error("Handling sendkey method did not work at location ---" + locatorvalue);
			Reporter.log("Handling sendkey method did not work at location ---" + locatorvalue);
			e.printStackTrace();
		}
	}
	
	public static void handle_sumbit_sendkey(String locatorvalue, String value) throws Exception {
		try {
			WebElement element = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
			element.sendKeys(value);
			element.submit();
			Logging.info("Handling sendkey & submit method working fine at location ---" + locatorvalue);
			Reporter.log("Handling sendkey & submit method working fine at location ---" + locatorvalue);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "handling_click");
			Logging.error("Handling sendkey & submit method did not work at location ---" + locatorvalue);
			Reporter.log("Handling sendkey & submit method did not work at location ---" + locatorvalue);
			e.printStackTrace();
		}
	}
	
	public static void handling_textbox(String locatorvalue, String testdata) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locatorvaluesplit.loc_Split(locatorvalue)));
			Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			element.sendKeys(testdata);
			Logging.info("Handling textbox method working fine at location ---" + locatorvalue);
			Reporter.log("Handling textbox method working fine at location ---" + locatorvalue);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "handling_textbox");
			Logging.error("Handling textbox method did not work at location ---" + locatorvalue);
			Reporter.log("Handling textbox method did not work at location ---" + locatorvalue);
			e.printStackTrace();
		}
	}
	
	
	public static void handling_Dropdown(String locatorvalue, String testdata) throws Exception {
		try {
			WebElement element = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
			Select elementtoselect = new Select(element);
		
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			elementtoselect.selectByVisibleText(testdata);
			Thread.sleep(1000);
			jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);	
			Logging.info("Handling dropdown method working fine at location ---" + locatorvalue);
			Reporter.log("Handling dropdown method working fine at location ---" + locatorvalue);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "handling_Dropdown");
			Logging.error("Handling dropdown method did not work at location ---" + locatorvalue);
			Reporter.log("Handling dropdown method did not work at location ---" + locatorvalue);
			e.printStackTrace();
		}
	}
	
	public static void handling_visibilityofWebElement(String locatorvalue) throws Exception {
		try {
			WebElement element = driver.findElement(Locatorvaluesplit.loc_Split(locatorvalue));
			boolean validateEnrolledCourse = element.isDisplayed();
			
			if(validateEnrolledCourse==true) {
				Logging.info("No course has been taken");
				Reporter.log("No course has been taken");
			}else {
				Logging.info("Course has been taken");
				Reporter.log("Course has been taken");
			}
			
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "handling_Dropdown");
			Logging.error("Couse element did not work at location ---" + locatorvalue);
			Reporter.log("Couse element did not work at location ---" + locatorvalue);
			e.printStackTrace();
		}
	}
	
	public static void defaultwindowId() {
		try {
			defWinID= driver.getWindowHandle();
			Logging.info("Handling Window ID");
			Reporter.log("Handling Window ID");
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Logging.info("Handling Window ID Failed");
			Reporter.log("Handling Window ID Failed");
			e.printStackTrace();
		}
	}
	
	public static void handling_windowsIDs() throws Exception {
		try {
			List<String> windows= new ArrayList<String>(driver.getWindowHandles());
			int j= windows.size();
			
			for(int i=0;i<j;i++) {
				if(defWinID.contentEquals(windows.get(i))) {
					continue;
				}else {
					defWinID= windows.get(i);
					driver.switchTo().window(defWinID);
				}
			}
			
			Logging.info("Handling Window ID");
			Reporter.log("Handling Window ID");
			
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Logging.error("Handling Window ID did not work" );
			Reporter.log("Handling Window ID did not work");
			e.printStackTrace();
		}
	}
	
	public static void RunAutoIt() {
		
		try {
			String strFilePath="D:\\Java Project Files\\HybridFramework\\Malay Ray.pdf";
			String strPath="D:\\Java Project Files\\HybridFramework\\Attachment.exe";
			String strParameter= strPath + " " + strFilePath; 
			Runtime.getRuntime().exec(strParameter);
		} catch (Exception e) {
			Driverscript.bvalue = false;
			System.out.println("Failed to upload profile image");
		}
	}
	
	public static void CourseList(String locatorvalue) {
		List<WebElement> course= driver.findElements(Locatorvaluesplit.loc_Split(locatorvalue));
		int j = course.size();
		
		for(int i=0; i<j; i++) {
			String courseName= course.get(i).getAttribute("text");
			try {
				ExcelRW.writeValue("CourseName", i+1, 0, courseName);
				Logging.error("Write course name in excel sheet");
				Reporter.log("Write course name in excel sheet");
			} catch (Exception e) {
				Driverscript.bvalue = false;
				Logging.error("Not able to write course name in excel sheet");
				Reporter.log("Not able to write course name in excel sheet");
				e.printStackTrace();
			}
		}
	}
	
	public static void closebrowser() throws Exception {
		try {
			driver.close();
			Logging.info("Browser closed successfully");
			Reporter.log("Browser closed successfully");
		} catch (Exception e) {
			Driverscript.bvalue = false;
			Takingautoscreenshots.autoscreenshot((TakesScreenshot) driver, "closebrowser");
			Logging.error("Not able to close the browser");
			Reporter.log("Not able to close the browser");
			e.printStackTrace();
		}	
	}
}
