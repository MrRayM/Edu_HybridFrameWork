package testcases;

import org.testng.Reporter;

import commonmethods.Actionkeywords;
import constantvalues.ConstantValues;
import constantvalues.LocatorValues;
import utilities.Logging;

public class TC004 {

	public static void tc004() throws Exception {
		Logging.startTestcase("TC004");
		Reporter.log("-----------------TC004 Execution started---------------");		
		
		Actionkeywords.handling_click(LocatorValues.exploringCourse_allcourse_click);
		Actionkeywords.handle_sumbit_sendkey(LocatorValues.exploringCourse_course_sendkey_submit, ConstantValues.coursename);
		Actionkeywords.handling_click(LocatorValues.exploringCourse_course_select_click);
		Actionkeywords.handling_click(LocatorValues.exploringCourse_course_addtowishlist_click);
		Actionkeywords.handling_visibilityofWebElement(LocatorValues.exploringCourse_course_addtowishlist_validation);
		Actionkeywords.handling_click(LocatorValues.exploringCourse_course_enroll_click);
		
		Logging.endTestcase();
		Reporter.log("-----------------TC004 Execution Finished---------------");
	}
}
