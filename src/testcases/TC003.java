package testcases;

import org.testng.Reporter;

import commonmethods.Actionkeywords;
import constantvalues.LocatorValues;
import utilities.Logging;

public class TC003 {
	
	public static void tc003() throws Exception {
		Logging.startTestcase("TC003");
		Reporter.log("-----------------TC003 Execution started---------------");		
		
		Actionkeywords.handling_click(LocatorValues.user_courses_click);		
		Actionkeywords.handling_click(LocatorValues.user_myclassroom_click);
		Actionkeywords.handling_visibilityofWebElement(LocatorValues.user_mycourses_validate_visibility);
		Logging.endTestcase();
		Reporter.log("-----------------TC003 Execution Finished---------------");
	}

}
